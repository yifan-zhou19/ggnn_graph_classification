package <missing>;

public class GlobalMembers
{
	/*
	 * shehuimingliu.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Owner
	 */
	public static int[] a = new int[1000000];
	public static int[] b = new int[1000000];

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n * (n - 1);i++)
		{

			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((x == 0) && (y == 0))
			{
				break;
			}
			a[y]++;
			b[x]++;
		}
		for (j = 0;j < n;j++)
		{
			if ((a[j] == n - 1) && (b[j] == 0))
			{
					System.out.print(j);
					System.out.print("\n");
				break;
			}

			else
			{
				if (j == n - 1)
				{
					System.out.print("NOT FOUND");
					System.out.print("\n");
				}

			}
		}
	}
}

