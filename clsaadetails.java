package classroommanagement;

public class  clsaadetails{
	private static int count;
	private int classId;
	private String className;
	private int noOfSystem;
	private boolean ac;
	private boolean projector;
	private String faculty;
	private boolean available;
	static
	{
		count=0;
	}
	clsaadetails(){
		count++;
	}

	public static int getCount() {
		return count;
	}
	
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getNoOfSystem() {
		return noOfSystem;
	}
	public void setNoOfSystem(int noOfSystem) {
		this.noOfSystem = noOfSystem;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isProjector() {
		return projector;
	}
	public void setProjector(boolean projector) {
		this.projector = projector;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public boolean getAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "clsaadetails [classId=" + classId + ", className=" + className + ", noOfSystem=" + noOfSystem + ", ac="
				+ ac + ", projector=" + projector + ", faculty=" + faculty + ", available=" + available + "]";
	}
	 
 }
 

