package simple_tcp_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 8888);
            InputStream is = socket.getInputStream();
            BufferedReader buff = new BufferedReader(new InputStreamReader(is));
            String str = buff.readLine();
            System.out.println(str);
            buff.close();
            is.close();
            socket.close();
        }
        catch (IOException e){
            System.out.println();
        }
    }

}
