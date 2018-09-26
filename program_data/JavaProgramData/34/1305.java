package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogu.cpp
	 *???????
	 *  Created on: 2012-11-25
	 *      Author: ??
	 */

	public static void jiaogu(int k)
	{
		int m;
		if (k == 1)
		{
			System.out.print("End");
			return; //??????????
		}
		if (k % 2 == 0)
		{
			m = k / 2;
			System.out.printf("%d/2=%d\n", k, m);
			jiaogu(m);
			return; //???????2???????
		}
		if (k % 2 == 1)
		{
			m = 3 * k + 1;
			System.out.printf("%d*3+1=%d\n", k, m);
			jiaogu(m);
			return; //??????*3+1??????
		}
	}

	public static int Main()
	{
		int u;
		u = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(u); //??
		return 0;
	}

}

