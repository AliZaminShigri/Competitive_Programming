import java.io.*;
public class timeloop{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            pw.printf("%d Abracadabra\n",i+1);
        }
        
        pw.flush();
        br.close();
        pw.close();
    }
}