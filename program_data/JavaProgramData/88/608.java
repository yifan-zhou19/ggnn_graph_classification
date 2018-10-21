package <missing>;

public class GlobalMembers
{
	/*
	 * tiqushuzi.cpp
	 *???????
	 *  Created on: 2012-12-24
	 *      Author: ??
	 */

	public static int Main()
	{
		String str = new String(new char[50]); //?????????
		String p = str;
		int i = 0;
		p = new Scanner(System.in).nextLine(); //??
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) < 48 || *(p.Substring(i))>57)
			{
				continue; //????
			}
			if (*(p.Substring(i) + 1) < 48 || *(p.Substring(i) + 1)>57)
			{
				System.out.print((p.Substring(i)));
				System.out.print("\n");
			}
			else
			{
				System.out.print((p.Substring(i)));
			}
		}
		return 0;
	}

}
