package priv.nordea.db.hib;

// Generated Jun 1, 2013 9:24:39 AM by Hibernate Tools 3.4.0.CR1

/**
 * Jobs generated by hbm2java
 */
public class Jobs implements java.io.Serializable {

	private String guid;
	private String id;
	private String name;
	private String reference;
	private int active;
	private Integer ownerType;
	private String ownerGuid;

	public Jobs() {
	}

	public Jobs(String guid, String id, String name, String reference,
			int active) {
		this.guid = guid;
		this.id = id;
		this.name = name;
		this.reference = reference;
		this.active = active;
	}

	public Jobs(String guid, String id, String name, String reference,
			int active, Integer ownerType, String ownerGuid) {
		this.guid = guid;
		this.id = id;
		this.name = name;
		this.reference = reference;
		this.active = active;
		this.ownerType = ownerType;
		this.ownerGuid = ownerGuid;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Integer getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(Integer ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerGuid() {
		return this.ownerGuid;
	}

	public void setOwnerGuid(String ownerGuid) {
		this.ownerGuid = ownerGuid;
	}

}
