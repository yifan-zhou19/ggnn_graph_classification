import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???????
	 *
	 *  Created on: 2012-12-12
	 *      Author: zhuyongfu
	 */



	public static int Main()
	{
		String str1 = new String(new char[101]); //??????????????
		String str2 = new String(new char[101]);
		String p = str1; //??????????????
		String q = str2;
		int l;
		int i;
		str1 = new Scanner(System.in).nextLine(); //??
		l = str1.length();
		for (i = 0;i < l;i++) //??????????????
		{
			if (i != l - 1)
			{
				*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			}
			else
			{
				*(q.Substring(i)) = *(p.Substring(i)) + p;
			}
		}
		for (i = 0;i < l;i++) //??
		{
			System.out.print((q.Substring(i)));
		}
		return 0;
	}
}
