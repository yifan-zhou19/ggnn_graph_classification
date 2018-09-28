import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */
	public static int Main() //?????
	{ //?????
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine(); //??
		int length = str.length(); //????
		int i;
		int j;
		int t;
		for (i = 0;i <= length;i++)
		{
			if ((str.charAt(i) < '0') || (str.charAt(i)>'9'))
			{
				continue; //???i????????????
			}
			else
			{
				for (j = 1;j <= length - i;j++)
				{
					if ((str.charAt(i + j) < '0') || (str.charAt(i + j)>'9') || (str.charAt(i + j) == '\0'))
					{
						for (t = i;t < i + j;t++)
						{
							System.out.print(str.charAt(t));
						}
						System.out.print("\n");
						i = i + j - 1;
						break;
					}
				}
			}
		}
		return 0; //???????????????????
	} //????

}
