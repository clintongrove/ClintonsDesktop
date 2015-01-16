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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Clinton
 */
public class EventList {
    List <Event> list = new <Event> ArrayList();
    List<String> list2= new<String>ArrayList();
   
    public void rt(String x, String y, String z){

        File f = new File("C:\\Users\\hgrove17\\Documents\\GitHub\\ClintonsDesktop\\PR3_3.1\\src\\pr3_3\\pkg1\\text.txt");
try {
    Event date = new Event();
    date.date=x;
    date.location=y;
    date.event=z;
    list.add(date);
    System.out.println("added");
BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
for (int i = 0; i<list.size();i++){
        String a= list.get(i).date;
        String b= list.get(i).location;
        String c= list.get(i).event;
wrtr.write(a+ " "+b+" "+c);
wrtr.newLine();
System.out.println(a+ " "+b+" "+c);

}wrtr.close();
}
catch (Exception ex) {
System.out.println("I was hoping that we wouldn't get here2.");
}
    }
    
    public String rd(){
        
File f = new File("C:\\Users\\hgrove17\\Documents\\GitHub\\ClintonsDesktop\\PR3_3.1\\src\\pr3_3\\pkg1\\text.txt");
try {
    list.clear(); list2.clear();
    BufferedReader rdr = new BufferedReader(new FileReader(f));
    String line;
    while ((line = rdr.readLine())!= null){
    Pattern p = Pattern.compile(" ");
    Matcher m = p.matcher(line.substring(11));    
        m.find();
        Event e = new Event();
        list2.add(line);
        e.date=line.substring(0,10);
        e.location= line.substring(11,m.start()+11);
        e.event=line.substring(m.start()+12);
        
        System.out.println(e.event);
        System.out.println(e.location);
        System.out.println(e.date);
        list.add(e);
        System.out.println("added");
        
        
    
    }}
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


