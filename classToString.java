package factories;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

import enums.TaskName;
import models.ParentTaskDataModel;
import models.Task_GET_DEVICE_INFORMATION_DataModle;

/**
 * Apr 1, 2016
 * @author Almgwary
 * RemoteFire
 * TaskDataModelsFactory.java
 **/

/**
 *  Serialize and deseialize  taskDataModel classes
 *  taskDataModel is used to map data as a class model to task  
 * */
public   class TaskDataModelsFactory {

	public static ParentTaskDataModel getTaskDataModelClass(String data   ) throws ClassNotFoundException, IOException{
		ParentTaskDataModel dataModel = null; 
		dataModel = (ParentTaskDataModel)fromString(data); 
		return dataModel;
	}

	public  static String getDataFromCalss(ParentTaskDataModel dataModel) throws IOException{
		String data = null;
		data= toString(dataModel);
		return data;
	}
	
	   /** Read the object from Base64 string. */
	private static Object fromString( String s ) throws IOException ,
	                                                       ClassNotFoundException {
	        byte [] data = Base64.getDecoder().decode( s );
	        ObjectInputStream ois = new ObjectInputStream( 
	                                        new ByteArrayInputStream(  data ) );
	        Object o  = ois.readObject();
	        ois.close();
	        return o;
	   }

	    /** Write the object to a Base64 string. */
	private static String toString( Serializable o ) throws IOException {
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream( baos );
	        oos.writeObject( o );
	        oos.close();
	        return Base64.getEncoder().encodeToString(baos.toByteArray()); 
	    }

}

