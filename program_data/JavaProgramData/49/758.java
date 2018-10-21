import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ? ?? on 12-11-12.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//


	public static int Main()
	{
		String a = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		int la;
		int c;
		int d;
		int sum;
		la = a.length();
		int i;
		int j;
		int k;
		for (i = 2; i <= la; i = i + 2)
		{
			for (j = 0; j <= la - i; j++)
			{
				d = j;
				c = i + j - 1;
				sum = 0;
				do
				{
					if (a.charAt(d) != a.charAt(c))
					{
						sum++;
					}
					d++;
					c--;
				} while (c > d);
				if (sum == 0)
				{
					for (k = j; k <= i + j - 1; k++)
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
