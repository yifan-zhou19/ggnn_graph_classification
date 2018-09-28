import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qimolianxi10.cpp
	 *
	 *  Created on: 2010-12-17
	 *      Author: l
	 */
	public static int Main()
	{
		String a = new String(new char[501]); //???????
		a = new Scanner(System.in).nextLine(); //??
		int i;
		int j;
		int l;
		int k;
		int p;
		l = a.length(); //????
		for (i = 2;i <= l;i++) //i?????????
		{
			for (j = 0;j <= l - i;j++)
			{
				p = 1;
				for (k = j;k <= j + i / 2;k++)
				{
					if (a.charAt(k) != a.charAt(2 * j + i - 1 - k))
					{
						p = 0; //p?????????
					}
				}
				if (p == 1)
				{ //?????????
					for (k = j;k < j + i;k++)
					{
						System.out.print(a.charAt(k));
					}
				System.out.print("\n");
				}
			}
		}



		return 0;
	}

}
