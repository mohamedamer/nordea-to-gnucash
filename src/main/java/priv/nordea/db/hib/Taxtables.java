package priv.nordea.db.hib;

// Generated Jun 1, 2013 9:24:39 AM by Hibernate Tools 3.4.0.CR1

/**
 * Taxtables generated by hbm2java
 */
public class Taxtables implements java.io.Serializable {

	private String guid;
	private String name;
	private String refcount;
	private int invisible;
	private String parent;

	public Taxtables() {
	}

	public Taxtables(String guid, String name, String refcount, int invisible) {
		this.guid = guid;
		this.name = name;
		this.refcount = refcount;
		this.invisible = invisible;
	}

	public Taxtables(String guid, String name, String refcount, int invisible,
			String parent) {
		this.guid = guid;
		this.name = name;
		this.refcount = refcount;
		this.invisible = invisible;
		this.parent = parent;
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

	public String getRefcount() {
		return this.refcount;
	}

	public void setRefcount(String refcount) {
		this.refcount = refcount;
	}

	public int getInvisible() {
		return this.invisible;
	}

	public void setInvisible(int invisible) {
		this.invisible = invisible;
	}

	public String getParent() {
		return this.parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

}
