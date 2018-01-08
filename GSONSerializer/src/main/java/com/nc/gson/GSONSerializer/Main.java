//working

package com.nc.gson.GSONSerializer;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(final String[] args) throws IOException {
		
		System.out.println("\n\t****GSON Serializer****\n\t");
		
	    // Configure GSON
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Book.class, new BookSerializer());
	    gsonBuilder.setPrettyPrinting();
	    final Gson gson = gsonBuilder.create();

	    final Book javaPuzzles = new Book();
	    javaPuzzles.setTitle("Java Puzzles: Traps, Pitfalls, and Corner Cases");
	    javaPuzzles.setIsbn10("032133678X");
	    javaPuzzles.setIsbn13("978-0321336781");
	    javaPuzzles.setAuthors(new String[] { "Joshua Bloch", "Neal Gafter" });

	    // Format to JSON
	    final String json = gson.toJson(javaPuzzles);
	    System.out.println(json);
	  }
	
}
