package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-6-8
	 *      Author: 09119
	 */
	public static int k;
	public static int[] high = new int[30];
	public static int ff(int pos,int highflag,int count)
	{
		if (pos == k)
		{
			return count;
		}
		if (high[pos] <= highflag)
		{
			int tmp1 = ff(pos + 1, high[pos], count + 1);
			int tmp2 = ff(pos + 1, highflag, count);
			if (tmp1 > tmp2)
			{
				return tmp1;
			}
			else
			{
				return tmp2;
			}
		}
		else
		{
			return ff(pos + 1, highflag, count);
		}
	}
	public static int Main()
	{
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			high[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int result = ff(0, 99999, 0);
		System.out.print(result);
		System.out.print("\n");
		return 0;
	}

}

