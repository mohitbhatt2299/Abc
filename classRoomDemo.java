package classroommanagement;

import java.util.*;

public class classRoomDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roomId;
		String className;
		int noOfSystem;
		boolean ac;
		boolean projector;
		ArrayList<clsaadetails> AList=new ArrayList<clsaadetails>();
		
		String options;
		
		while (true) {

			System.out.println("1 create new room" + "2 search details of a room" + "3 all details" + "4 availability "
					+ "5 no of rooms" + "6 exit");
			options = sc.next();
			interfaceClass inter =new interfaceClass();
			switch (options) 
			{ 
			
			case "1":
				System.out.println("enter no room ");
				int roomNo;
				roomNo = sc.nextInt();
			

				
					System.out.println("enter room id");
					roomId = sc.nextInt();
					System.out.println("enter class name");
					className = sc.next();
					System.out.println("enter no of system");
					noOfSystem = sc.nextInt();
					System.out.println("enter ac");
					ac = Boolean.parseBoolean(sc.next());
					System.out.println("enter projector");
					projector = Boolean.parseBoolean(sc.next());
               add(inter.addroom1(roomId, className, noOfSystem, projector,ac));
				

				break;
			case "2":
				
				System.out.println("enter room id");
				roomId = sc.nextInt();
				
				 System.out.println(inter.searchRoom(roomId,AList));
				break;
			case "3":
				for (clsaadetails clA : AList) {
					System.out.println(clA);
				}
				break;
			case "4":

				System.out.println("enter no of system");
				noOfSystem=sc.nextInt();

				break;

			case "5":
				System.out.println(clsaadetails.getCount());
				break;
			case "6":
				System.exit(0);
				break;
			}
		}
	}

	private static void add(clsaadetails addroom1) {
		// TODO Auto-generated method stub
		
	}


	

}
