package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DupeStringSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
String Output="";
String[] str=text.split(" ");
List<String> Listvalue=new ArrayList<String>();
for (String string : str) {
	Listvalue.add(string);
	
}
//Copying Set to list
Set <String> SetValue= new LinkedHashSet<String>(Listvalue);
//System.out.println("The text without duplicate String "+SetValue);
 
for (String string : SetValue) {
	Output=Output+" " + string;
	
	
}
System.out.print(Output);
	
	
	
	
	
	
	
	
	
	}
}
