import java.util.*;

/**
 * 读取输入
 * 首先构造一个Scanner对象，并与“标准输入流”System.in关联
 * nextLine读取一行
 * next读取一个单词，以空格为分隔符
 * nextInt读取一个整数
 * @author Leo
 *
 */

public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		String name = in.nextLine();
		
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		System.out.println("Hello, " + name + ". Next year,you'll be " + (age + 1));
	}

}
