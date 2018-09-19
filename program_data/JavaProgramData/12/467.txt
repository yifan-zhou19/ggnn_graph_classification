package <missing>;

public class GlobalMembers
{
	/*
	 * 9.cpp
	 *
	 *  Created on: 2010-11-19
	 *      Author: ???
	 *        ??? ??
	 */



	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int r;
		int n;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			n = 0;
			if (a[0] == -1) //??????-1?????
			{
				break;
			}
			for (i = 1;a[i - 1] != 0;i++) //????
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j <= i - 2;j++) //??????
			{
				for (r = 0;r <= i - 2;r++)
				{
					if (2 * a[j] == a[r])
					{
						n++;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}

}

