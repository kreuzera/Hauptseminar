package FileTransfer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import Model.Element;
import Model.Graph;

public class ReadFromFile {

	private LinkedList<String> finalList = new LinkedList<String>();
	
	/**
	 * Method to get Text from data on Desktop
	 * Path for windows:
	 * System.getProperty("user.home")+"/Desktop"
	 * @param fileName name of file to read from
	 * @return
	 * @throws IOException
	 */
	public String readIn() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader((System.getProperty("user.home")+"/Desktop/test.txt")));
		
		String temp = "";
		StringBuilder builder = new StringBuilder();
		
		try{
			while((temp = reader.readLine()) != null)
				builder.append(temp);
		}
		catch(IOException e){}

		return builder.toString();
	}
	
	/***
	 * Splits a List of Strings at every "."
	 * @param tempList list to split
	 */
	public void splitList(LinkedList<String>tempList){
		for(int i = 0; i<tempList.size();i++){
			String [] tempArray = tempList.get(i).split("\\.");
			for(int j = 0; j<tempArray.length;j++){
				String tempString = "";
				if(tempArray[j].substring(0, 1).equals(" "))
					tempString = tempArray[j].substring(1,tempArray[j].length());
				else
					tempString = tempArray[j];
				finalList.add(tempString);
			}
		}
	}
	
	public static void main (String [] args){ 
		
		Element e1 = new Element("1", 1);
		Element e2 = new Element("2", 2);
		Element e3 = new Element("3", 3);
		Element e4 = new Element("4", 4);
		Element e5 = new Element("5", 5);
		Element e6 = new Element("6", 6);
		
		Graph g = new Graph();
		
		g.setHead(e1);
	
		g.linkElements(e1, e2);
		g.linkElements(e1, e3);
		
		g.linkElements(e2, e3);
		g.linkElements(e2, e4);
		g.linkElements(e2, e6);
		
		g.linkElements(e3, e4);
		g.linkElements(e3, e5);
		g.linkElements(e3, e6);
		
		g.linkElements(e4, e5);
		g.linkElements(e4, e6);
		
		
		e1.setDegree();
		e2.setDegree();
		e3.setDegree();
		e4.setDegree();
		e5.setDegree();
		e6.setDegree();
		
		System.out.println(e4.getDegree());
	}
}
