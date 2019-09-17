package com.pos.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.pos.model.Outfile;

public class MainTest {
	
	
	
		
		public static void main(String[] args) throws Exception {
			ArrayList<Outfile> arrayList = new ArrayList<>();
	        BufferedReader reader = new BufferedReader(new FileReader("E:/date.csv"));
	        Map<String, String> map = new TreeMap<String, String>();
	   //     TreeSet<Outfile> treeSet = new TreeSet<>();
	       
	        String line = reader.readLine();//read header
	        while ((line = reader.readLine()) != null) {
	            Outfile key = getField(line);
	            arrayList.add(key);
			/*
			 * if (l == null) { map.put(key, l); } l.add(line);
			 */

	        }
	      arrayList.sort(Comparator.comparing(Outfile :: getAmount).reversed());
	      
	      System.out.println(arrayList.toString());
	        reader.close();
	        
	        FileWriter writer = new FileWriter("E:/sorted_date.csv");
	        writer.write("date, clientId, amount");
	        writer.write("\n");

	        for (Outfile outfile : arrayList) {
	        	  writer.write(outfile.getDate());
	        	  writer.append(",");
	        	  writer.write(outfile.getClientname());
	        	  writer.append(",");
	        	  writer.write(outfile.getAmount().toString());
//	        	  writer.append(",");
	        	  writer.append("\n");
	                System.out.println(outfile);
			}
	        writer.close();
	    }

	    private static Outfile getField(String line) {
	    	String[] split = line.split(",");
	    	Outfile outfile = new Outfile();
	    	outfile.setDate(split[0]);
	    	outfile.setClientname(split[1]);
	    	outfile.setAmount(Integer.parseInt(split[2]));
	    	return outfile;
	    	
	    //    return line.split(",")[2];// extract value you want to sort on
	    }
	}
