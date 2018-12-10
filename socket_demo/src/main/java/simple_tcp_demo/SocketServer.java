package simple_tcp_demo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args){
        // 创建一个ServerSocket，用于监听客户端socket连接请求
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("TCP Server Start");

            // 采用循环方式监听客户的请求
            while(true){
                // 监听客户端连接请求，在连接请求之前一直阻塞
                Socket socket = ss.accept();
                OutputStream os = socket.getOutputStream();
                PrintStream ps = new PrintStream(os);
                ps.print("你好，你收到了来自服务端的问候");
                ps.close();
                os.close();
                socket.close();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
