package <missing>;

public class GlobalMembers
{
	/*
	 * 1134 ??.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] a = new int[16]; //????
		int i;
		int j;
		int k;
		int l;
		int n;
		k = 0;
		while (k != -1) //-1????
		{
			if (a[0] == -1)
			{
				break; //-1????
			}
			i = 0;
			l = 1;
			do //??????
			{
				i = i + 1;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				l = i + 1;
			}while (a[i] != 0);
			l = l - 1;
			n = 0;
			for (i = 0;i < l;i++) //???????
			{
				for (j = 0;j < l;j++)
				{
					if (a[i] == 2 * a[j])
					{
						n = n + 1;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
			for (i = 0;i < 16;i++)
			{
				a[i] = 0;
			}
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = a[0];
		}
		return 0;
	}
}

