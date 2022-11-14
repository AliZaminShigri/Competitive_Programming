import java.io.*;
import java.util.*;
public class Carrots {
    public static void main(String [] args) throws IOException{ 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int contestent = Integer.parseInt(st.nextToken());
        int probSolved = Integer.parseInt(st.nextToken());
        while(contestent -- > 0){
            br.readLine();
        }
        pw.printf("%d \n", probSolved);
        pw.flush();
        br.close();
        pw.close();


    }
}
