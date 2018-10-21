import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * GetNumbers.cpp
	 *
	 *  Created on: 2012-12-12
	 *  Author: ??
	 *  ???????
	 */


	public static int Main()
	{
		String a = new String(new char[40]);
		int len = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (int i = 0 ; i < len ; i++)
		{
			if (i == len - 1)
			{ //????
				if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
				{
					System.out.print((a.Substring(i)));
					System.out.print("\n");
				}
			}
			else
			{
				if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9') //?????
				{
					if (*(a.Substring(i) + 1) >= '0' && *(a.Substring(i) + 1) <= '9') //????????
					{
					System.out.print((a.Substring(i)));
					}
					else
					{
						System.out.print((a.Substring(i)));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}


}
