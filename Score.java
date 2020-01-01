
public class Score {
	private String UserId;
	private String name;
	private int assessmentScore;
	private int technicalScore;
	private int behaviouralScore;

	public Score() {
	}

	public Score(String userId, String name, int assessmentScore, int technicalScore, int behaviouralScore) {
		super();
		UserId = userId;
		this.name = name;
		this.assessmentScore = assessmentScore;
		this.technicalScore = technicalScore;
		this.behaviouralScore = behaviouralScore;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return UserId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		UserId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the assessmentScore
	 */
	public int getAssessmentScore() {
		return assessmentScore;
	}

	/**
	 * @param assessmentScore the assessmentScore to set
	 */
	public void setAssessmentScore(int assessmentScore) {
		this.assessmentScore = assessmentScore;
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

	/**
	 * @return the behaviouralScore
	 */
	public int getBehaviouralScore() {
		return behaviouralScore;
	}

	/**
	 * @param behaviouralScore the behaviouralScore to set
	 */
	public void setBehaviouralScore(int behaviouralScore) {
		this.behaviouralScore = behaviouralScore;
	}

}
