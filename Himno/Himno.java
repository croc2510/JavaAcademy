package Himno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Himno implements Himnoej {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Derian Rodriguez\\Desktop\\Himno.txt");
		Himno ej = new Himno();
		Integer x = ej.countCharacters(file);
		System.out.println("Numero de caracteres = "+x);
		Integer z = ej.countWords(file);
		System.out.println("Numero de palabras = "+z);
		Integer y = ej.countLines(file);
		System.out.println("Numero de lineas = "+y);
		Integer a = ej.countParagraph(file);
		System.out.println("Numero de lineas = "+a);

	}

	@Override
	public int countCharacters(File file) {
		int characterCount = 0;
		file.getName();
		String data;
		System.out.println(file.getName());
		try {
			FileInputStream fileStream = new FileInputStream(file);
			InputStreamReader InputStreamReader = new InputStreamReader(fileStream);
			BufferedReader reader = new BufferedReader(InputStreamReader);
			while ((data = reader.readLine()) != null) {
				if (!(data.equals(""))) {

					characterCount += data.length();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return characterCount;
	}

	@Override
	public int countWords(File file) {
		int wordCount = 0;
		String data;
		try {
			FileInputStream fileStream = new FileInputStream(file);
			InputStreamReader InputStreamReader = new InputStreamReader(fileStream);
			BufferedReader reader = new BufferedReader(InputStreamReader);
			while ((data = reader.readLine()) != null) {
				String currentLine = reader.readLine();
				String[] words = currentLine.split(" ");
				wordCount = wordCount + words.length;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return wordCount;
	}

	@Override
	public int countLines(File file) {
		int characterCount = 0;
		String data;
		try {
			FileInputStream fileStream = new FileInputStream(file);
			InputStreamReader InputStreamReader = new InputStreamReader(fileStream);
			BufferedReader reader = new BufferedReader(InputStreamReader);
			while ((data = reader.readLine()) != null) {
				if (!(data.equals(""))) {

					characterCount++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return characterCount;
	}

	@Override
	public int countParagraph(File file) {
		int characterCount = 1;
		String data;
		try {
			FileInputStream fileStream = new FileInputStream(file);
			InputStreamReader InputStreamReader = new InputStreamReader(fileStream);
			BufferedReader reader = new BufferedReader(InputStreamReader);
			while ((data = reader.readLine()) != null) {
				if ((data.equals("I")) || (data.equals("II")) || (data.equals("IV")) || (data.equals("III"))) {

					characterCount++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return characterCount;
	}
}
