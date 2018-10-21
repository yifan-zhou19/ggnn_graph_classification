import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         ???????
	*/


	public static int Main()
	{
		String w = new String(new char[1000]);
		int i = 0;
		int j = 0;
		int flag = 1;
		int l;
		w = new Scanner(System.in).nextLine();
		l = w.length();
		for (i = 0; i < l; i++)
		{
			if (w.charAt(i) != 32)
			{
				flag = 1;
			}
			if (flag != 0)
			{
				System.out.print(w.charAt(i));
			}
			if (w.charAt(i) == 32)
			{
				flag = 0;
			}
		}
		return 0;
	}
}
