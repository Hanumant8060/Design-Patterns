package com.bridgelabz.facadedesignpattern;

public class ReportWriter {
	public void writeHtmlReport(Report report, String location) {
		System.out.println("Written html report ");
	}
	// Implementation

	public void writePdfReport(Report report, String location) {
		System.out.println("Written pdf report ");
	}
}
