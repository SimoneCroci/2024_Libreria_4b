/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._utility;

import java.io.*;

/**
 *
 * @author Studente
 */
public class App
{
    public static void main(String[] args)
    {
//Test Menu
	System.out.println("--- TEST MENU: ---");
	
	int numeroVociMenu=7;
	int voceMenuScelta;
	String[] vociMenu=new String[numeroVociMenu];
	
	vociMenu[0]="0 --> Esci";
	vociMenu[1]="1 --> Voce 1";
	vociMenu[2]="2 --> Voce 2";
	vociMenu[3]="3 --> Voce 3";
	vociMenu[4]="4 --> Voce 4";
	vociMenu[5]="5 --> Voce 5";
	vociMenu[6]="6 --> Voce 6";
	
	Menu menu=new Menu(vociMenu);
	
	do{
	    voceMenuScelta=menu.sceltaMenu();
	    switch(voceMenuScelta)
	    {
		case 0:
		    System.out.println("Arrivederci.");
		    break;
		case 1:
		    System.out.println("Hai scelto voce 1");
		    break;
		case 2:
		    System.out.println("Hai scelto voce 2");
		    break;
		case 3:
		    System.out.println("Hai scelto voce 3");
		    break;
		case 4:
		    System.out.println("Hai scelto voce 4");
		    break;
		case 5:
		    System.out.println("Hai scelto voce 5");
		    break;
		case 6:
		    System.out.println("Hai scelto voce 6");
		    break;
		default:
		    System.out.println("Valore inserito non valido, riprova.");
	    }
	}while(voceMenuScelta!=0);

	
//Test Ordinatore
	System.out.println("\n--- TEST ORDINATORE: ---");
	
    //Inizializzo l'array di interi
	System.out.println("---Array di interi---");
        System.out.println("Array a:");
	int[] a={344,32,3,4,234,54,5};
	for(int i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+"\t");
	}
	
	//TEST metodo scambia
	System.out.println("\nArray a (scambia):");
	Ordinatore.scambia(a, 1, 2);
	for(int i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+"\t");
	}
	
	//TEST metodo selectionSortCrescente
	System.out.println("\nArray a (selectionSortCrescente):");
	int[] ordinato=Ordinatore.selectionSortCrescente(a);
	for(int i=0;i<ordinato.length;i++)
	{
	    System.out.print(ordinato[i]+"\t");
	}
	
	//TEST metodo selectionSortDecrescente
	System.out.println("\nArray a (selectionSortDecrescente):");
	ordinato=Ordinatore.selectionSortDecrescente(a);
	for(int i=0;i<ordinato.length;i++)
	{
	    System.out.print(ordinato[i]+"\t");
	}
	
	//TEST metodo bubbleSortCrescente
	System.out.println("\nArray a (bubbleSortCrescente):");
	ordinato=Ordinatore.bubbleSortCrescente(a);
	for(int i=0;i<ordinato.length;i++)
	{
	    System.out.print(ordinato[i]+"\t");
	}
	
	//TEST metodo bubbleSortDecrescente
	System.out.println("\nArray a (bubbleSortDecrescente):");
	ordinato=Ordinatore.bubbleSortDecrescente(a);
	for(int i=0;i<ordinato.length;i++)
	{
	    System.out.print(ordinato[i]+"\t");
	}
	
    //Inizializzo l'array di stringhe
	System.out.println("\n---Array di stringhe---");
        System.out.println("Array s:");
	String[] s={"Ciao","Pinna","Pierone","Zorro","Nome"};
	for(int i=0;i<s.length;i++)
	{
	    System.out.print(s[i]+"\t");
	}
	
	//TEST metodo scambia
	System.out.println("\nArray s (scambia):");
	Ordinatore.scambia(s, 1, 2);
	for(int i=0;i<s.length;i++)
	{
	    System.out.print(s[i]+"\t");
	}
	
	//TEST metodo selectionSortCrescente
	System.out.println("\nArray s (selectionSortCrescente):");
	String[] ordinata=Ordinatore.selectionSortCrescente(s);
	for(int i=0;i<ordinata.length;i++)
	{
	    System.out.print(ordinata[i]+"\t");
	}
	
	//TEST metodo selectionSortDecrescente
	System.out.println("\nArray s (selectionSortDecrescente):");
	ordinata=Ordinatore.selectionSortDecrescente(s);
	for(int i=0;i<ordinata.length;i++)
	{
	    System.out.print(ordinata[i]+"\t");
	}
	
	//TEST metodo bubbleSortCrescente
	System.out.println("\nArray s (bubbleSortCrescente):");
	ordinata=Ordinatore.bubbleSortCrescente(s);
	for(int i=0;i<ordinata.length;i++)
	{
	    System.out.print(ordinata[i]+"\t");
	}
	
	//TEST metodo bubbleSortDecrescente
	System.out.println("\nArray s (bubbleSortDecrescente):");
	ordinata=Ordinatore.bubbleSortDecrescente(s);
	for(int i=0;i<ordinata.length;i++)
	{
	    System.out.print(ordinata[i]+"\t");
	}
	
	
//Test ConsoleInput
	System.out.println("\n\n--- TEST CONSOLEINPUT: ---");
	ConsoleInput tastiera=new ConsoleInput();
	
	//String
	System.out.print("Inserisci una stringa (String): ");
	try
	{
	    String string1=tastiera.readString();
	    System.out.println("String = "+string1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	
	//Int
	System.out.print("Inserisci un intero (Int): ");
	try
	{
	    int int1=tastiera.readInt();
	    System.out.println("int = "+int1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Short
	System.out.print("Inserisci un short (Short): ");
	try
	{
	    int short1=tastiera.readShort();
	    System.out.println("short = "+short1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Long
	System.out.print("Inserisci un long (Long): ");
	try
	{
	    long long1=tastiera.readLong();
	    System.out.println("long = "+long1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Float
	System.out.print("Inserisci un float (Float): ");
	try
	{
	    float float1=tastiera.readFloat();
	    System.out.println("float = "+float1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Double
	System.out.print("Inserisci un double (Double): ");
	try
	{
	    double double1=tastiera.readDouble();
	    System.out.println("double = "+double1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Boolean
	System.out.print("Inserisci un boolean (Boolean): ");
	try
	{
	    boolean boolean1=tastiera.readBoolean();
	    System.out.println("boolean = "+boolean1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Byte
	System.out.print("Inserisci un byte (Byte): ");
	try
	{
	    byte byte1=tastiera.readByte();
	    System.out.println("byte = "+byte1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Errore: formato errato");
	}
	
	//Char
	System.out.print("Inserisci un char (Char): ");
	try
	{
	    char char1=tastiera.readChar();
	    System.out.println("char = "+char1);
	}
	catch(IOException e)
	{
	    System.out.println("Errore: lettura dati");
	}
	
	
//Test TextFile + FileException
	System.out.println("\n--- TEST TEXTFILE+FILEEXCEPTION: ---");
	String nomeFile="C:\\Users\\utente\\Desktop\\file.txt";
	TextFile file=null;
        
	//Scrittura su file (senza append)
	try
	{
	    file=new TextFile(nomeFile, 'W');
	    file.toFile("Ciao Pierone");
	    file.toFile("Ciao Pinna");
	    file.closeFile();
	    System.out.println("Scrittura completata con successo!");
	}
	catch(IOException e)
	{
	    System.out.println("Errore: impossibile scrivere sul file");
	}
	catch(FileException e)
	{
	    System.out.println(e.toString());
	}
	
	//Scrittura su file (con append)
	try
	{
	    file=new TextFile(nomeFile, 'W', true);
	    file.toFile("Arrivederci Pierone");
	    file.toFile("Arrivederci Pinna");
	    file.closeFile();
	    System.out.println("Scrittura in append completata con successo!");
	}
	catch(IOException e)
	{
	    System.out.println("Errore: impossibile scrivere sul file");
	}
	catch(FileException e)
	{
	    System.out.println(e.toString());
	}
	
	//Lettura da file
	try
	{
	    file=new TextFile(nomeFile, 'R');
	    while(true)
	    {
		String str=file.fromFile();
		System.out.println(str);
	    }
	}
	catch(IOException e)
	{
	    System.out.println("Errore: impossibile leggere il file");
	}
	catch(FileException e)
	{
	    System.out.println(e.toString());
            try
            {
                file.closeFile();
            }
            catch(IOException ex)
            {
                System.out.println("Erorre: chiusura file");
            }
	}
    }
}