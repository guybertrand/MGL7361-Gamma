package ca.uqam.mgl7361.a2011.gamma;
import java.io.*;

public class Trace
{
    private FileWriter outFile;
    private PrintWriter output;
    
    public Trace(String filename) throws IOException
    {
        try
        {
            outFile = new FileWriter(filename);
            output = new PrintWriter(outFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void addLine(String text)
    {
        System.out.println(text);
        output.println(text);
    }
    
    public void close()
    {
        output.close();
    }
}