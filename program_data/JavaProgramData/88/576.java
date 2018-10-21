import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * findnum_0.cpp
	 *
	 *  Created on: 2013-12-6
	 *      Author: ??
	 */
	public static int Main()
	{
		String a = new String(new char[45]);
		String p = a;
		int[] go = new int[45];
		int i;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)
			{
				go[j] = i;
				for (i = go[j];;i++)
				{
					if (*(p.Substring(i)) < 48 || *(p.Substring(i))>57)
					{
						//end[j]=i-1;
						*(p.Substring(i)) = '\0';
						j++;
						break;
					}
				}
			}
		}
		p = a;
		for (i = 0;i < j;i++)
		{
			System.out.print(p + go[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
