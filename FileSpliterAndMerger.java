/**
 * Design Pattern : File Spliters and merge
 * Author      : http://stackoverflow.com/questions/10864317/how-to-break-a-file-into-pieces-using-java
 * Date        : 3-Apr-2016
 * Thin        : --M
 **/


// accepted
// Read portions of bytes to byte array and store them in new files when buffer is full or it is end of file.
// For example (code is not perfect, but maybe will help you)

class FileSplit {
    public static void splitFile(File f) throws IOException {
        int partCounter = 1;//I like to name parts from 001, 002, 003, ...
                            //you can change it to 0 if you want 000, 001, ...

        int sizeOfFiles = 1024 * 1024;// 1MB
        byte[] buffer = new byte[sizeOfFiles];

        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(f))) {//try-with-resources to ensure closing stream
            String name = f.getName();

            int tmp = 0;
            while ((tmp = bis.read(buffer)) > 0) {
                //write each chunk of data into separate file with different number in name
                File newFile = new File(f.getParent(), name + "."
                        + String.format("%03d", partCounter++));
                try (FileOutputStream out = new FileOutputStream(newFile)) {
                    out.write(buffer, 0, tmp);//tmp is chunk size
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        splitFile(new File("D:\\destination\\myFile.mp3"));
    }
}
// myFile.mp3 size=12,7 MB
// After split i had 13 files
// myFile.mp3.001 - myFile.mp3.012 with size 1 MB size
// myFile.mp3.013 with size 806 KB
// If you want to merge these files you can use

public static void mergeFiles(List<File> files, File into)
        throws IOException {
    try (BufferedOutputStream mergingStream = new BufferedOutputStream(
            new FileOutputStream(into))) {
        for (File f : files) {
            Files.copy(f.toPath(), mergingStream);
        }
    }
}
// You can also add some additional methods to make your life little easier, for instance method which will create list of files containing separated parts based on name of one of these files.
public static List<File> listOfFilesToMerge(File oneOfFiles) {
    String tmpName = oneOfFiles.getName();//{name}.{number}
    String destFileName = tmpName.substring(0, tmpName.lastIndexOf('.'));//remove .{number}
    File[] files = oneOfFiles.getParentFile().listFiles(
            (File dir, String name) -> name.matches(destFileName + "[.]\\d+"));
    Arrays.sort(files);//ensuring order 001, 002, ..., 010, ...
    return Arrays.asList(files);
}
// Now you can just overload mergeFiles method to use only File oneOfFiles instead of List<File> and generate list based on this element
public static void mergeFiles(File oneOfFiles, File into)
        throws IOException {
    mergeFiles(listOfFilesToMerge(oneOfFiles), into);
}
// You can also overload these methods to use String instead of File
public static List<File> listOfFilesToMerge(String oneOfFiles) {
    return listOfFilesToMerge(new File(oneOfFiles));
}

public static void mergeFiles(String oneOfFiles, String into) throws IOException{
    mergeFiles(new File(oneOfFiles), new File(into));
}