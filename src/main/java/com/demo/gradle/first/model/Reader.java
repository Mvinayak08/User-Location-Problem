package com.demo.gradle.first.model;

public class Reader {
	
	private int reader_Id;
	private String reader_Name;
	
	public Reader() {
		super();
	}

	public Reader(int reader_Id, String reader_Name) {
		super();
		this.reader_Id = reader_Id;
		this.reader_Name = reader_Name;
	}

	public int getReader_Id() {
		return reader_Id;
	}

	public void setReader_Id(int reader_Id) {
		this.reader_Id = reader_Id;
	}

	public String getReader_Name() {
		return reader_Name;
	}

	public void setReader_Name(String reader_Name) {
		this.reader_Name = reader_Name;
	}

	@Override
	public String toString() {
		return "Reader [reader_Id=" + reader_Id + ", reader_Name=" + reader_Name + "]";
	}
	

}
