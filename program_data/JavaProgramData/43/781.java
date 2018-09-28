package <missing>;

public class GlobalMembers
{
	//*********************************************
	//*  file: 1.cpp
	//*  description???????
	//*  Created on: 2012-10-23
	//*  Author: ??     1200012858
	//*********************************************
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int k1;
		int p;
		int q;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= (m / 2); i = i + 2)
		{
			k = (int)Math.sqrt(i);
			for (p = 2; p <= k; p++)
			{
				if (i % p == 0)
				{
					break;
				}
			}
				if (p == k + 1)
				{
					j = m - i;
					k1 = (int)Math.sqrt(j);
					for (q = 2; q <= k1; q++)
					{
					 if (j % q == 0)
					 {
						 break;
					 }
					}
					if (q == k1 + 1)
					{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					}
				}
		}
		return 0;

	}
}

