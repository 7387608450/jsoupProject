package com.app.atmecs;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
			Document d = Jsoup.connect("https://www.javatpoint.com").get();
			Elements e = d.select("img[src~=(?i)\\.(png|jpe?g|gif)]");  
			for (Element image : e) {
				System.out.println(image.attr("width"));
				System.out.println(image.attr("src"));
			}
		} catch (IOException e) 
        {
			e.printStackTrace();
		}
    }
}
