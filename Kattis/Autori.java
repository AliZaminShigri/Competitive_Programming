import java.io.*;
import java.util.*;
public class Autori{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        
        StringBuilder result = new StringBuilder();
        while(st.hasMoreTokens()){
            result.append(st.nextToken().charAt(0));
        }
        
        pw.printf("%s\n",result.toString());
        pw.flush();
        br.close();
        pw.close();
    }
}