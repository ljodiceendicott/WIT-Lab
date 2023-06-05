package edu.wit.cs.comp2000;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/* @Author Seamus Nautons and Vincent Jodice
 * @version 1.0
 * Vincent was responsible for the most of the design and implementation of the code
 * Seamus was responsible for part of the design and the testing of the code
 */
public class SpellChecker {
	
	public static void main(String[] args) throws FileNotFoundException {
		// create 2 file classes, one for the dictionary and one for the sentence(s) we are reading 
		File scrabbleDictionary = new File("data/sowpods.txt");
		File sentence = new File("data/simplesentences.txt");
		// create 2 bags, one for the dictionary and one for the misspelled words
		BagInterface<String> dictionaryBag = new ResizableArrayBag<>();
		BagInterface<String> misspelledBag = new ResizableArrayBag<>();
		Scanner scrabblein = new Scanner(scrabbleDictionary);
		Scanner scrabbleDictionaryin = new Scanner(scrabbleDictionary);
		while(scrabbleDictionaryin.hasNext()) {
		String word = scrabbleDictionaryin.next();
		dictionaryBag.add(word);
		}
		System.out.println();
		scrabblein.close();
		scrabbleDictionaryin.close();
	}
	
}
