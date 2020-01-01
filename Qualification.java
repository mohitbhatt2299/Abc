
public class Qualification {

	private String education;
	private String finalPercentage;
	private int interviewScore;
	private int communicationScore;
	private int technicalScore;

	public Qualification() {
	}

	public Qualification(String education, String finalPercentage, int interviewScore, int communicationScore,
			int technicalScore) {
		super();
		this.education = education;
		this.finalPercentage = finalPercentage;
		this.interviewScore = interviewScore;
		this.communicationScore = communicationScore;
		this.technicalScore = technicalScore;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the finalPercentage
	 */
	public String getFinalPercentage() {
		return finalPercentage;
	}

	/**
	 * @param finalPercentage the finalPercentage to set
	 */
	public void setFinalPercentage(String finalPercentage) {
		this.finalPercentage = finalPercentage;
	}

	/**
	 * @return the interviewScore
	 */
	public int getInterviewScore() {
		return interviewScore;
	}

	/**
	 * @param interviewScore the interviewScore to set
	 */
	public void setInterviewScore(int interviewScore) {
		this.interviewScore = interviewScore;
	}

	/**
	 * @return the communicationScore
	 */
	public int getCommunicationScore() {
		return communicationScore;
	}

	/**
	 * @param communicationScore the communicationScore to set
	 */
	public void setCommunicationScore(int communicationScore) {
		this.communicationScore = communicationScore;
	}

	/**
	 * @return the technicalScore
	 */
	public int getTechnicalScore() {
		return technicalScore;
	}

	/**
	 * @param technicalScore the technicalScore to set
	 */
	public void setTechnicalScore(int technicalScore) {
		this.technicalScore = technicalScore;
	}

}
