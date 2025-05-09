package climateChangeCrisis;

public class FieldArea extends Area {

	// Constants for business rules

	// private static final int MIN_FIELDLENGTH = 10;

	// Instance vars

	private Development developmentObj;
	private Player ownedBy;
	private String initialSquareMessage;

	// Constructor

	public FieldArea(String areaName, Development developmentObj, String initialSquareMessage, Player player) {
		super.setAreaName(areaName);
		super.setBelongsToField(true);
		this.setdevelopmentObj(developmentObj);
		this.setInitialSquareMessage(initialSquareMessage);
		this.setOwnedBy(player);;
	}

	// Getters & Setters

	/**
	 * @return the developmentLevel
	 */
	public Development getdevelopmentObj() {
		return developmentObj;
	}

	/**
	 * 
	 * @param developmentObj
	 * @throws IllegalArgumentException if trying to set FieldArea Development to
	 *                                  null
	 */
	public void setdevelopmentObj(Development developmentObj) throws IllegalArgumentException {
		if (developmentObj == null) {
			throw new IllegalArgumentException("Development cannot be null");
		}

		this.developmentObj = developmentObj;
	}

	/**
	 * @return the ownedBy
	 */
	public Player getOwnedBy() {
		return ownedBy;
	}

	/**
	 * 
	 * @param ownedBy
	 * @throws IllegalArgumentException if trying to set ownership of FieldArea to
	 *                                  null or Player already owns this FieldArea
	 */
	public void setOwnedBy(Player ownedBy) throws IllegalArgumentException {

		if (ownedBy == null) {
			throw new IllegalArgumentException("Cannot set owned by to null");
		}

		
		this.ownedBy = ownedBy;
	}

	/**
	 * @return the initialSquareMessage
	 */
	public String getInitialSquareMessage() {
		return initialSquareMessage;
	}

	/**
	 * @param initialSquareMessage the initialSquareMessage to set
	 */
	public void setInitialSquareMessage(String initialSquareMessage) {
		this.initialSquareMessage = initialSquareMessage;
	}

	
}
