import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?12?15
	* @description
	* ??????:????????? 
	*/
	public static int Main()
	{
		int i;
		int length;
		String zifu = new String(new char[101]);
		zifu = new Scanner(System.in).nextLine();
		length = zifu.length();
		for (i = 0;i < length;i++)
		{
			if (i == length - 1)
			{
				System.out.print((char)(zifu.charAt(i) + zifu.charAt(0)));
			}
			else
			{
				System.out.print((char)(zifu.charAt(i) + zifu.charAt(i + 1)));
			}
		}
		return 0;
	}

}
