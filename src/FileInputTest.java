import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * �����ļ��Ķ�д����
 * ����ļ�·���а�����б�ܷ��ţ�Ҫ��ÿ����б��֮ǰ�ټ�һ������ķ�б��
 * ��ȡ�ļ���Ҫһ����File������һ��Scanner����
 * Ҫ��д���ļ���Ҫ����һ��PrintWriter����
 * @author Leo
 *
 */

public class FileInputTest {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner in = new Scanner(new File("F:\\Java\\Java_Demo\\Java_Demo\\src\\1.txt"));
		//String a = in.nextLine();
		//System.out.println(a);
		
		PrintWriter out = new PrintWriter("F:\\Java\\Java_Demo\\Java_Demo\\src\\1.txt");
		out.print("Happy");
	}

}
