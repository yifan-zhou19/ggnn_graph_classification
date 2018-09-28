package <missing>;

public class GlobalMembers
{
	/*
	 * 38.cpp
	 *??????
	 *  Created on: 2012-11-2
	 *      Author: ???
	 */
	public static int Main()
	{ //?????
		int i; //??int???
		int j;
		int n;
		int m;
		int[] f = new int[25]; //????f
		f[1] = 1;
		f[2] = 1; //???f[1],f[2]??
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= m; j++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((n == 1) || (n == 2))
			{
				System.out.print(f[n]);
				System.out.print("\n");
			} //??n??1?2???1
			else
			{
				for (i = 3; i <= n; i++)
				{
					f[i] = f[i - 1] + f[i - 2];
				} //??n??2????????
				System.out.print(f[n]);
				System.out.print("\n");
			}

		}
		return 0; //?????

	}

}

