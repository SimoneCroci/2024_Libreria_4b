/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._utility;

import java.io.*;

/**
 *
 * @author Studente
 * rappresenta un file di testo
 * quando viene istaziato il file di testo può essere aperto: in scrittura append, in scrittura non in append, in lettura
 * consente di scrivere una stringa sul file di testo o di leggere una stringa dal file di testo
 * consente di chiudere il file 
 */
public class TextFile
{
    private char mode; //R=reader/lettura - W=writer/scrittura
    private BufferedReader reader;
    private BufferedWriter writer;
    
    /**
     * Costruttore (senza append)
     * @param nomeFile pathname del file fsico
     * @param mode modalità di apertura del file, può assumere i valori: 
     * - W o w  per aprire il file in scrittura
     * - qualsiasi altra lettera per aprire il file in lettura
     * @throws FileNotFoundException viene sollevata se il file da leggere non viene trovato, esso viene trovatoù
     * @throws IOException viene sollevata se non è possibile accedere al file
     * @param append se vale true il file aperto in scrittura è aperto in append, altrimenti viene aperto non in append
     *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
     */
    public TextFile(String nomeFile, char mode) throws FileNotFoundException, IOException
    {
	this.mode='R'; //modalità di default
	if(mode=='W' || mode=='w')
	    this.mode='W';
	if(this.mode=='R')
	    reader=new BufferedReader(new FileReader(nomeFile));
	else
	    writer=new BufferedWriter(new FileWriter(nomeFile));
    }
    
    /**
     * Costruttore (con append)
     * @param nomeFile
     * @param mode
     * @param append
     * @throws FileNotFoundException
     * @throws IOException
     */
    public TextFile(String nomeFile, char mode, boolean append) throws FileNotFoundException, IOException
    {
	this.mode='R'; //modalità di default
	if(mode=='W' || mode=='w')
	    this.mode='W';
	if(this.mode=='R')
	    reader=new BufferedReader(new FileReader(nomeFile));
	else
	    writer=new BufferedWriter(new FileWriter(nomeFile,append));
    }
    
    /**
     * Scrive su file
     * @param line
     * @throws FileException
     * @throws IOException
     */
    public void toFile(String line) throws FileException, IOException
    {
	if(mode=='R')
	    throw new FileException("Errore: file aperto in lettura");
	writer.write(line);
	writer.newLine();
    }
    
    /**
     * Legge da file
     * @return
     * @throws FileException
     * @throws IOException
     */
    public String fromFile() throws FileException, IOException
    {
	if(mode=='W')
	    throw new FileException("Errore: file aperto in scrittura");
	String s=reader.readLine();
	if(s==null)
	    throw new FileException("Errore: fine del file");
	return s;
    }
    
    /**
     * Chiude il file
     * @throws IOException
     */
    public void closeFile() throws IOException
    {
	if(mode=='R')
	    reader.close();
	else
	    writer.close();
    }
}