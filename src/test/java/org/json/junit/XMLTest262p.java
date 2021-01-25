package org.json.junit;

import static org.junit.Assert.assertEquals;

import java.io.*;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.junit.Test;

public class XMLTest262p {
	
	@Test
	public void taskTwoTest() throws FileNotFoundException {
		// Given
		FileReader fileReader = new FileReader("/Users/andyko/Documents/GitHub/262p-milestone2/JSON-java/src/test/java/org/json/junit/xmls/Sample.xml");
		JSONPointer jsonPointer = new JSONPointer("/catalog/book/1");
		
		// When
		JSONObject jsonObject = XML.toJSONObject(fileReader, jsonPointer);
		
		// Then
		System.out.println(jsonObject);
	}
	
	@Test
	public void taskFiveTest() throws FileNotFoundException {
		
	}
	
//	@Test
//	public void testTest() {
//		int four = 2 + 2;
//		assertEquals(5, four);
//	}
}
