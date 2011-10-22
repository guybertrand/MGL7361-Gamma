package ca.uqam.mgl7361.a2011.gamma;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Trace
{
    private FileWriter outFile;
    private PrintWriter output;
    private String traceFilename;
    private static final Trace instance = new Trace();
    private boolean writeInXML;
    private boolean writeOnFile;
    
    private Trace()
    {
        writeInXML = false;
        writeOnFile = false;
    }
    
    public static Trace getInstance()
    {
        return instance;
    }
    
    public void initialize(boolean indXML, boolean indFile)
    {
        writeInXML = indXML;
        writeOnFile = indFile;
        
        try
        {   
            if (writeOnFile)
            {
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
                traceFilename= "./GammaTest-" + dateFormat.format(new Date()) + ".log";
                outFile = new FileWriter(traceFilename);
                output = new PrintWriter(outFile);
            }
            printHeader();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void addLine(String text)
    {
        if (writeOnFile)
        {
            output.println(text);     
        }
        else
        {
            System.out.println(text);
        }
    }
    
    public void close()
    {
        if (writeOnFile)
        {
            output.close();
        }
    }
    
    public boolean getWriteInXML()
    {
        return writeInXML;
    }
    
    public boolean getWriteOnFile()
    {
        return writeOnFile;
    }
    
    private void printHeader()
    {
        if (writeOnFile)
        {
            System.out.println("logfile=" + traceFilename);
        }
        
        if (writeInXML)
        {
            Trace.getInstance().addLine("<?xml version=\"1.0\"?>");
        }
    }
}