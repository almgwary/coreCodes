// To Save your bitmap in sdcard use the following code
// <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

// Store Image

private void storeImage(Bitmap image) {
    File pictureFile = getOutputMediaFile();
    if (pictureFile == null) {
        Log.d(TAG,
                "Error creating media file, check storage permissions: ");// e.getMessage());
        return;
    } 
    try {
        FileOutputStream fos = new FileOutputStream(pictureFile);
        image.compress(Bitmap.CompressFormat.PNG, 90, fos);
        fos.close();
    } catch (FileNotFoundException e) {
        Log.d(TAG, "File not found: " + e.getMessage());
    } catch (IOException e) {
        Log.d(TAG, "Error accessing file: " + e.getMessage());
    }  
}



//To Get the Path for Image Storage

/** Create a File for saving an image or video */
private  File getOutputMediaFile(){
    // To be safe, you should check that the SDCard is mounted
    // using Environment.getExternalStorageState() before doing this. 
    File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
            + "/Android/data/"
            + getApplicationContext().getPackageName()
            + "/Files"); 

    // This location works best if you want the created images to be shared
    // between applications and persist after your app has been uninstalled.

    // Create the storage directory if it does not exist
    if (! mediaStorageDir.exists()){
        if (! mediaStorageDir.mkdirs()){
            return null;
        }
    } 
    // Create a media file name
    String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmm").format(new Date());
    File mediaFile;
        String mImageName="MI_"+ timeStamp +".jpg";
        mediaFile = new File(mediaStorageDir.getPath() + File.separator + mImageName);  
    return mediaFile;
} 