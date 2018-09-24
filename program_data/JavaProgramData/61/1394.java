package <missing>;

public class GlobalMembers
{
	/*
	 *100022.cpp
	 *????????????a?????
	 *Created on: 2012-10-13
	 *Author:??
	 */
	public static int[] shuchu = new int[20]; //????
	public static int[] shuru = new int[100];
	public static int n = 0;
	public static int i = 0;
	public static int k = 0;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{ //????
			shuru[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print("\n");
		}
		shuchu[0] = 1;
		shuchu[1] = 1;
		for (i = 2;i < 20;i++)
		{ //????
			shuchu[i] = shuchu[i - 1] + shuchu[i - 2];
		}

		for (k = 0;k < n;k++)
		{
			System.out.print(shuchu[shuru[k] - 1]);
			System.out.print("\n");
		}
	return 0;
	}

}

