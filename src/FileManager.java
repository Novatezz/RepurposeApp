import java.io.*;

/**
 * File Manager Class
 * Handles Reading and writing to file
 */
public class FileManager
{
    private int arrayLength=0;//set default length to use in loop
    String fileName ="RePurposingSuggestions.txt";

    /**
     * Method to Read file
     * @return Array to be used in our form
     */
    public Ideas[] ReadDataFromFile()
    {
        String line; //set variable to hold lines as strings
        Ideas[] ideaArray = new Ideas[100];//create array
        arrayLength = 0;
        try
        {
           //parsing a file into BufferedReader class constructor
           //file path change to whatever path needed
           BufferedReader br = new BufferedReader(new FileReader(fileName));
           while ((line = br.readLine()) != null)   //returns a Boolean value
           {
               //set temporary array to hold each line from document
               String[] temp = line.split(";");    //use semicolon as separator
               //turn string into object from Ideas class and add to array
               ideaArray[arrayLength] = new Ideas(temp[0],temp[1],temp[2],temp[3],temp[4]);
               arrayLength++;//extend position
           }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            ideaArray = null;
            arrayLength = 0;
        }
        //return the completed list
        return ideaArray;
    }
    public int getArrayLength()
    {
        return arrayLength;
    }

    /**
     * Method to write to file
     * @param ideaArray Array that we want to write to file
     * @param arraySize Size of array to prevent null errors
     */
    public void WriteDataToFile(Ideas[] ideaArray,int arraySize)
    {
        try
        {
            //initialise file writer and path to save file
            FileWriter myWriter = new FileWriter(fileName);
            //for loop to step through each item in our list
            for (int i = 0; i < arraySize; i++)
            {
                //Joins all items in array inside the list then writes them to file
                myWriter.write(ideaArray[i].toString()+"\n");
            }
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
        }
    }
}

