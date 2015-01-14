/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3.pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clinton
 */
public class EventList {
    List <Event> list = new <Event> ArrayList();
    List<String> list2= new<String>ArrayList();
    public void rt(String x, String y, String z){
    Event date = new Event();
    date.date=x;
    date.location=y;
    date.event=z;
    list.add(date);
        File f = new File("C:\\Users\\Clinton\\Documents\\NetBeansProjects\\PR3_3.1\\src\\pr3_3\\pkg1\\text.txt");
try {
BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
for (int i = 0; i<list.size();i++){
        String a= list.get(i).date;
        String b= list.get(i).location;
        String c= list.get(i).event;
wrtr.write(a+ " "+b+" "+c);
wrtr.newLine();
System.out.println(a+ " "+b+" "+c);
wrtr.close();
}}
catch (Exception ex) {
System.out.println("I was hoping that we wouldn't get here.");
}
    }
    public String rd(){
File f = new File("C:\\Users\\Clinton\\Documents\\NetBeansProjects\\PR3_3.1\\src\\pr3_3\\pkg1\\text.txt");
try {
BufferedReader rdr = new BufferedReader(new FileReader(f));
String line;
while ((line = rdr.readLine()) != null)
    list2.add(line);
    
    
}
catch (Exception ex) {
System.out.println("I was hoping that we wouldn't get here.");
}
String linez="";
for (int i = 0; i<list2.size();i++){
    if (list2.get(i).equals("null"))
        break;
    linez+=list2.get(i)+" \n";
}
    
return linez;
}
}


