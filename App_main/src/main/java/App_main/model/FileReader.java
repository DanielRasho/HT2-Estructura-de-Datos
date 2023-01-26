package App_main.model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

// Diego, empeza a hacer esto... por si te sirve.
public class FileReader {

    private BufferedReader objReader = null;
    private String strCurrentLine = "";

    /**
     * FileReader Constructor
     * @param path
     * @throws FileNotFoundException
     */
    public FileReader(String path) throws FileNotFoundException {
        objReader = new BufferedReader(new java.io.FileReader(path));
    }

    /**
     * Returns the next line in file.
     * @return The next line in file.
     * @throws EOFException when getting to the End Of File.
     */
    public String nextLine() throws EOFException {
            try {
                strCurrentLine = objReader.readLine();
            } catch (IOException e) {
                throw new EOFException();
            }
            return strCurrentLine.trim();
    }

    /**
     * Set the file this object will be reading
     * @param path Absolute path.
     * @throws FileNotFoundException When can not find the given path.
     */
    public void setFile(String path) throws FileNotFoundException{
        objReader = new BufferedReader(new java.io.FileReader(path));
    }

    /**
     * Closes the file stream.
     */
    public void close(){
        try {
            objReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
