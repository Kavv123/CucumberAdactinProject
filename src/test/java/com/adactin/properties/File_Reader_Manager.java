package com.adactin.properties;

import java.io.IOException;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static File_Reader_Manager getInstanceFR() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public static Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
