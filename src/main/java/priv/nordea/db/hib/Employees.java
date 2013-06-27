package priv.nordea.db.hib;

// Generated Jun 1, 2013 9:24:39 AM by Hibernate Tools 3.4.0.CR1

/**
 * Employees generated by hbm2java
 */
public class Employees implements java.io.Serializable {

	private String guid;
	private String username;
	private String id;
	private String language;
	private String acl;
	private int active;
	private String currency;
	private String ccardGuid;
	private String workdayNum;
	private String workdayDenom;
	private String rateNum;
	private String rateDenom;
	private String addrName;
	private String addrAddr1;
	private String addrAddr2;
	private String addrAddr3;
	private String addrAddr4;
	private String addrPhone;
	private String addrFax;
	private String addrEmail;

	public Employees() {
	}

	public Employees(String guid, String username, String id, String language,
			String acl, int active, String currency, String workdayNum,
			String workdayDenom, String rateNum, String rateDenom) {
		this.guid = guid;
		this.username = username;
		this.id = id;
		this.language = language;
		this.acl = acl;
		this.active = active;
		this.currency = currency;
		this.workdayNum = workdayNum;
		this.workdayDenom = workdayDenom;
		this.rateNum = rateNum;
		this.rateDenom = rateDenom;
	}

	public Employees(String guid, String username, String id, String language,
			String acl, int active, String currency, String ccardGuid,
			String workdayNum, String workdayDenom, String rateNum,
			String rateDenom, String addrName, String addrAddr1,
			String addrAddr2, String addrAddr3, String addrAddr4,
			String addrPhone, String addrFax, String addrEmail) {
		this.guid = guid;
		this.username = username;
		this.id = id;
		this.language = language;
		this.acl = acl;
		this.active = active;
		this.currency = currency;
		this.ccardGuid = ccardGuid;
		this.workdayNum = workdayNum;
		this.workdayDenom = workdayDenom;
		this.rateNum = rateNum;
		this.rateDenom = rateDenom;
		this.addrName = addrName;
		this.addrAddr1 = addrAddr1;
		this.addrAddr2 = addrAddr2;
		this.addrAddr3 = addrAddr3;
		this.addrAddr4 = addrAddr4;
		this.addrPhone = addrPhone;
		this.addrFax = addrFax;
		this.addrEmail = addrEmail;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAcl() {
		return this.acl;
	}

	public void setAcl(String acl) {
		this.acl = acl;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCcardGuid() {
		return this.ccardGuid;
	}

	public void setCcardGuid(String ccardGuid) {
		this.ccardGuid = ccardGuid;
	}

	public String getWorkdayNum() {
		return this.workdayNum;
	}

	public void setWorkdayNum(String workdayNum) {
		this.workdayNum = workdayNum;
	}

	public String getWorkdayDenom() {
		return this.workdayDenom;
	}

	public void setWorkdayDenom(String workdayDenom) {
		this.workdayDenom = workdayDenom;
	}

	public String getRateNum() {
		return this.rateNum;
	}

	public void setRateNum(String rateNum) {
		this.rateNum = rateNum;
	}

	public String getRateDenom() {
		return this.rateDenom;
	}

	public void setRateDenom(String rateDenom) {
		this.rateDenom = rateDenom;
	}

	public String getAddrName() {
		return this.addrName;
	}

	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}

	public String getAddrAddr1() {
		return this.addrAddr1;
	}

	public void setAddrAddr1(String addrAddr1) {
		this.addrAddr1 = addrAddr1;
	}

	public String getAddrAddr2() {
		return this.addrAddr2;
	}

	public void setAddrAddr2(String addrAddr2) {
		this.addrAddr2 = addrAddr2;
	}

	public String getAddrAddr3() {
		return this.addrAddr3;
	}

	public void setAddrAddr3(String addrAddr3) {
		this.addrAddr3 = addrAddr3;
	}

	public String getAddrAddr4() {
		return this.addrAddr4;
	}

	public void setAddrAddr4(String addrAddr4) {
		this.addrAddr4 = addrAddr4;
	}

	public String getAddrPhone() {
		return this.addrPhone;
	}

	public void setAddrPhone(String addrPhone) {
		this.addrPhone = addrPhone;
	}

	public String getAddrFax() {
		return this.addrFax;
	}

	public void setAddrFax(String addrFax) {
		this.addrFax = addrFax;
	}

	public String getAddrEmail() {
		return this.addrEmail;
	}

	public void setAddrEmail(String addrEmail) {
		this.addrEmail = addrEmail;
	}

}