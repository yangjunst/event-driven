package cn.itcast.io.a.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//��ȡ����¼�롣��¼�������ת�ɴ�д���浽�ļ��С�
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(System.out,true);//true�Զ�ˢ�£���println��Ч��
		
		String line = null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			out.println(line.toUpperCase());
//			out.flush();
		}
		
		out.close();
	
		
		//��Ҫ�����ݴ�ӡ���ļ��У���ʹ���Զ�ˢ�¡�
		//PrintWriter out = new PrintWriter(new FileWriter("a.txt"),true);
	}

}
