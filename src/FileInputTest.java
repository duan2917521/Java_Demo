import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 关于文件的读写操作
 * 如果文件路径中包含反斜杠符号，要在每个反斜杠之前再加一个额外的反斜杠
 * 读取文件需要一个用File对象构造一个Scanner对象
 * 要想写入文件就要构造一个PrintWriter对象
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
