/**
 * 
 */
/**
 * @author Administrator
 *
 */
package gooo1;
import java.util.Scanner;
public class ToBinary{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入数字：");
		int a=sca.nextInt();
		String str=Integer.toBinaryString(a);
		System.out.println(a+"转化为二进制为："+str);
	}
}