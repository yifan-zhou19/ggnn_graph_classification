package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012712_324.cpp
	 *
	 *  Created on: 2010-11-21
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n];
		apple[1] = n + k;
		while (true)
		{
			for (i = 2;i <= n;i++)
			{
				apple[i] = (apple[i - 1] - k) / n * (n - 1);
				if ((apple[i] % n != k) || (apple[i] < n))
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
				apple[1] += n;
			}
		}
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}

}

