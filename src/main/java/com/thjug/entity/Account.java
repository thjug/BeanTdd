/*
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

/**
 *
 * @author nuboat
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
	@NamedQuery(name = "Account.findByUsername", query = "SELECT a FROM Account a WHERE a.username = :username"),})
public class Account extends Time {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer accountid;

	@Size(max = 64)
	private String username;

	@Size(max = 256)
	private String passwd;

	public Account() {
	}

	public Account(final Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(final Integer accountid) {
		this.accountid = accountid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(final String passwd) {
		this.passwd = passwd;
	}

	@Override
	public int hashCode() {
		return (accountid != null ? accountid.hashCode() : 0);
	}

	@Override
	public boolean equals(final Object object) {
		if (!(object instanceof Account)) {
			return false;
		}
		final Account other = (Account) object;
		return (this.accountid != null || other.accountid == null) && (this.accountid == null || this.accountid.equals(other.accountid));
	}

	@Override
	public String toString() {
		return "Account[ accountid=" + accountid + " ]";
	}

}
