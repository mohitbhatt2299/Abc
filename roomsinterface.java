package classroommanagement;

import java.util.ArrayList;

public interface roomsinterface<clArray>
{
	public clsaadetails addroom1(int roomId,String className,int noOfSystem,boolean projector, boolean ac);
	public void allocateRooms(int noOfSystem);
	public clsaadetails[] displayRooms();
	
	public clsaadetails[] availability(clsaadetails[] clArray,int noOfRooms);
	
	
	public clsaadetails searchRoom(int classId, ArrayList<clsaadetails> AList);

	
}
