package com.bridgelabz.facadedesignpattern;

public class Report {
	public ReportHeader reportHeader;
	public ReportData reportData;
	public ReportFooter reportFooter;
	public ReportHeader getReportHeader() {
		return reportHeader;
	}
	public void setReportHeader(ReportHeader reportHeader) {
		System.out.println("Set report header ");
		this.reportHeader = reportHeader;
	}
	public ReportData getReportData() {
		return reportData;
	}
	public void setReportData(ReportData reportData) {
		System.out.println("Set report data ");
		this.reportData = reportData;
	}
	public ReportFooter getReportFooter() {
		return reportFooter;
	}
	public void setReportFooter(ReportFooter reportFooter) {
		System.out.println("set report footer ");
		this.reportFooter = reportFooter;
	}
	
	
	

}
