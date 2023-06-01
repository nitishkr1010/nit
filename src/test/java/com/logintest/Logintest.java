package com.logintest;

import java.util.ArrayList;
import org.testng.annotations.Test;
import com.base.ExcelReader;
import com.base.keywordsIMPL;

public class Logintest {

	
	@Test
	public void test() {
		keywordsIMPL key = new keywordsIMPL();
	ArrayList data = ExcelReader.getTestData("E:\\logintestcase.xlsx");
	for(int i =0;i <data.size();i++) {
		if (data.get(i).equals("open")) {
			if(data.get(i+3).equals("YES")) {
			key.open();
		}}
		if (data.get(i).equals("url")) {
			if(data.get(i+3).equals("YES")) {
			key.url(data.get(i+1).toString());
		}}
		if (data.get(i).equals("input")) {
			if(data.get(i+3).equals("YES")) {
			String testdata = data.get(i+1).toString();
			String objectname = data.get(i+2).toString();
			key.input(testdata,objectname);
		}}
		if (data.get(i).equals("click")) {
			if(data.get(i+3).equals("YES")) {
			String objectname = data.get(i+2).toString();
			key.click(objectname);
		}}
		if (data.get(i).equals("input1")) {
			if(data.get(i+3).equals("YES")) {
			String testdata = data.get(i+1).toString();
			String objectname = data.get(i+2).toString();
			key.input(testdata,objectname);
			}}
		if (data.get(i).equals("quit")) {
			if(data.get(i+3).equals("YES")) {
			key.quit();
			}}	
}
}
}

