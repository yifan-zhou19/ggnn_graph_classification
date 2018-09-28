package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2012-10-14
	 *      Author: ??
	 */

	public static int max(int a,int b) //??????????????????
	{
		return a > b != 0?a:b;
	}

	public static int Main()
	{
		int n; //ans?????
		int a;
		int b;
		int ans;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		ans = 0;
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
			{
					sum++;
			ans = max(ans, sum);
			} //?????????ans?
			else
			{
				sum = 0; //??????????sum??????
			}

		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

