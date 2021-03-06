package priv.nordea.db.hib;

// Generated Jun 1, 2013 9:24:39 AM by Hibernate Tools 3.4.0.CR1

/**
 * Schedxactions generated by hbm2java
 */
public class Schedxactions implements java.io.Serializable {

	private String guid;
	private String name;
	private int enabled;
	private String startDate;
	private String endDate;
	private String lastOccur;
	private int numOccur;
	private int remOccur;
	private int autoCreate;
	private int autoNotify;
	private int advCreation;
	private int advNotify;
	private int instanceCount;
	private String templateActGuid;

	public Schedxactions() {
	}

	public Schedxactions(String guid, int enabled, int numOccur, int remOccur,
			int autoCreate, int autoNotify, int advCreation, int advNotify,
			int instanceCount, String templateActGuid) {
		this.guid = guid;
		this.enabled = enabled;
		this.numOccur = numOccur;
		this.remOccur = remOccur;
		this.autoCreate = autoCreate;
		this.autoNotify = autoNotify;
		this.advCreation = advCreation;
		this.advNotify = advNotify;
		this.instanceCount = instanceCount;
		this.templateActGuid = templateActGuid;
	}

	public Schedxactions(String guid, String name, int enabled,
			String startDate, String endDate, String lastOccur, int numOccur,
			int remOccur, int autoCreate, int autoNotify, int advCreation,
			int advNotify, int instanceCount, String templateActGuid) {
		this.guid = guid;
		this.name = name;
		this.enabled = enabled;
		this.startDate = startDate;
		this.endDate = endDate;
		this.lastOccur = lastOccur;
		this.numOccur = numOccur;
		this.remOccur = remOccur;
		this.autoCreate = autoCreate;
		this.autoNotify = autoNotify;
		this.advCreation = advCreation;
		this.advNotify = advNotify;
		this.instanceCount = instanceCount;
		this.templateActGuid = templateActGuid;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLastOccur() {
		return this.lastOccur;
	}

	public void setLastOccur(String lastOccur) {
		this.lastOccur = lastOccur;
	}

	public int getNumOccur() {
		return this.numOccur;
	}

	public void setNumOccur(int numOccur) {
		this.numOccur = numOccur;
	}

	public int getRemOccur() {
		return this.remOccur;
	}

	public void setRemOccur(int remOccur) {
		this.remOccur = remOccur;
	}

	public int getAutoCreate() {
		return this.autoCreate;
	}

	public void setAutoCreate(int autoCreate) {
		this.autoCreate = autoCreate;
	}

	public int getAutoNotify() {
		return this.autoNotify;
	}

	public void setAutoNotify(int autoNotify) {
		this.autoNotify = autoNotify;
	}

	public int getAdvCreation() {
		return this.advCreation;
	}

	public void setAdvCreation(int advCreation) {
		this.advCreation = advCreation;
	}

	public int getAdvNotify() {
		return this.advNotify;
	}

	public void setAdvNotify(int advNotify) {
		this.advNotify = advNotify;
	}

	public int getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}

	public String getTemplateActGuid() {
		return this.templateActGuid;
	}

	public void setTemplateActGuid(String templateActGuid) {
		this.templateActGuid = templateActGuid;
	}

}
