import java.util.Date;

public class PersonalInfo {

	private String fatherName;
	private String motherName;
	private String address;
	private Date dateOfBirth;
	private long contact;
	private String gender;
	private String password;
	private String designation;
	private double salaryPackage;

	public PersonalInfo() {
	}

	public PersonalInfo(String fatherName, String motherName, String address, Date dateOfBirth, long contact,
			String gender, String password, String designation, double salaryPackage) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.contact = contact;
		this.gender = gender;
		this.password = password;
		this.designation = designation;
		this.salaryPackage = salaryPackage;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the contact
	 */
	public long getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(long contact) {
		this.contact = contact;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salaryPackage
	 */
	public double getSalaryPackage() {
		return salaryPackage;
	}

	/**
	 * @param salaryPackage the salaryPackage to set
	 */
	public void setSalaryPackage(double salaryPackage) {
		this.salaryPackage = salaryPackage;
	}

}
