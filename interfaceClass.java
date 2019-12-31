package classroommanagement;

import java.util.ArrayList;

public class interfaceClass implements roomsinterface {
	public clsaadetails addroom1(int roomId, String className, int noOfSystem, boolean projector, boolean ac) {
		clsaadetails cl = new clsaadetails();

		cl.setClassId(roomId);

		cl.setClassName(className);

		cl.setNoOfSystem(noOfSystem);

		cl.setAc(ac);

		cl.setProjector(projector);

		cl.setAvailable(true);

		return cl;

	}

	public clsaadetails searchRoom(int roomId, ArrayList<clsaadetails> AList) {
		// TODO Auto-generated method stub

		for (clsaadetails clArray : AList) {

			if (clArray.getClassId() == roomId) {
				return clArray;

			}
		}
		return null;
	}

	@Override
	public void allocateRooms(int noOfSystem) {
		// TODO Auto-generated method stub

	}

	@Override
	public clsaadetails[] displayRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public clsaadetails[] availability(clsaadetails[] clArray, int noOfRooms) {
		// TODO Auto-generated method stub

		return null;

	}

}
