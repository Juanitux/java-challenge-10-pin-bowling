/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingchallenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Juan Carlos Lopez
 */
public class main {

    public static void main(String[] args) throws IOException 
    {
        String delimiter = " ";
        Map<String, String> map = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get("D:\\Desktop\\10pinbowling.txt"))){
            lines.filter(line -> line.contains(delimiter)).forEach(
                line -> map.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1])
            );
            System.out.println(map);     
        }
            
    }
}
    

