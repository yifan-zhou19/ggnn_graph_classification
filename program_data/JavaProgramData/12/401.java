package <missing>;

public class GlobalMembers
{
	/*
	 * 1134 ??.cpp
	 *
	 *  Created on: 2010-11-16
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int[] a = new int[16];
		for (int i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			switch (a[i])
			{
			case -1:
				return 0; //??0?????
			case 0:
			{
				int s = 0;
				for (int j = 0;j < i;j++)
				{
					for (int k = j;k < i;k++)
					{
						if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
						{
						 s++; //????
						}
					}
				}
						 i = -1;
				System.out.print(s);
				System.out.print("\n");
			}
			}
		}


	}

}

