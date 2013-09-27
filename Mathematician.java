package org.vkedco.android.listofmathematicians;
/*
 *************************************************
 * Mathematician is a class whose instances
 * represent the names of famous mathematicians
 * displayed in a ListView.
 * 
 * Bugs o vladimir dot kulyukin at usu dot edu
 ************************************************* 
 */

public class Mathematician {
	
	private String mFirstName;
	private String mLastName;
	private String mWikiURL;
	
	public Mathematician() {
		mFirstName = "";
		mLastName  = "";
		mWikiURL   = "";
	}
	
	public Mathematician(String fn, String ln) {
		mFirstName = fn;
		mLastName = ln;
		mWikiURL = "";
	}
	
	public Mathematician(String fn, String ln, String wiki) {
		mFirstName = fn;
		mLastName = ln;
		mWikiURL = wiki;
	}

	public String getFirstName() {
		return mFirstName;
	}
	
	public String getLastName() {
		return mLastName;
	}
	
	public String getWikiURL() {
		return mWikiURL;
	}
	
	public String toString() {
		return mFirstName + " " + mLastName;
	}
}
