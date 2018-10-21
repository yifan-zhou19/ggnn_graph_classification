import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: qinpengzifuchuan.cpp
	 *??????
	 *????: 2012-12-10
	 *??: ???????
	 */


	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		//??cin??????????
		for (int i = 0; i < s.length() - 1; i++)
		{
			*(s1.Substring(i)) = *(s.Substring(i)) + *(s.Substring(i) + 1);
		}
		//???????
		*(s1 + s.length() - 1) = *(s + s.length() - 1) + *s;
		//????
		*(s1 + s.length()) = '\0';
		//?s1???????
		System.out.print(s1);
		return 0;
	}
}
