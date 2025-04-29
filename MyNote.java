import java.io.*;
import java.util.Scanner;

class NoteManager 
{
    private String fileName;

    public NoteManager(String fileName) 
    {
        this.fileName = fileName;
    }

    public void createFile()
    {
        try
        {
            File f = new File(fileName);
            if (f.createNewFile())
                System.out.println("File created: " + fileName);
            else
                System.out.println("File already exists.");    
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
    public void writeNote(String note)
    {
        try
        {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(note + System.lineSeparator());
            fw.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
    public void readNotes()
    {
        try (Scanner scanner = new Scanner(new File(fileName))) 
        {
            System.out.println("Notes in the file:");
            while (scanner.hasNextLine()) 
            {
                System.out.println(scanner.nextLine());
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("The file does not exist.");
            e.printStackTrace();
        }
    }
}

public class MyNote
{
    public static void main(String[] args)
    {
        NoteManager nm = new NoteManager("javatest.txt");
        nm.createFile();
        nm.writeNote("Priyanka Das");
        nm.readNotes();
    }
}