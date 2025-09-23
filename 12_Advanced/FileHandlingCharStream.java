import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandlingCharStream {
    public static void main(String args[]){
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch(IOException exception){
            exception.printStackTrace();
        } finally{
            try {
                if(in != null)
                    in.close();
                if(out != null)
                    out.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
