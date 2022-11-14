import java.io.*;
import java.util.*;

public class MoscowDream{

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if(a < 1 || b < 1 || c < 1 || (a + b + c) < n || n < 3){
            pw.printf("NO\n");
        }
        else{
            pw.printf("YES\n");
        }

        pw.flush();
        br.close();
        pw.close();
    }
}