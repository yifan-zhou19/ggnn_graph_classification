package <missing>;

public class GlobalMembers
{
	/*
	 * 1112.cpp
	 *
	 *  Created on: 2012-11-11
	 *      Author: wangyinzhi
	 */



	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n + 2];
		apple[1] = n + k;
		while (true)
		{
		for (i = 2;i <= n + 1;i++)
		{
		apple[i] = (apple[i - 1] - k) * (n - 1) / n; //????
		if ((apple[i] % n != k) || ((apple[i] - k) / n == 0)) //????????????
		{
			break;
		}
		}
		if (i == n + 1)
		{
			break;
		}
		else
		{
			apple[1] = apple[1] + n;
		}
		}
		m = apple[1] * n / (n - 1) + k; //?????????????
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}
}

