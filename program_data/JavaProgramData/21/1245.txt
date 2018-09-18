package <missing>;

public class GlobalMembers
{
	/*
	 * test2.cpp
	 *
	 *  Created on: 2014-1-5
	 *      Author: ???
	 */
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		float e;
		float d;
		float s = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s += a[i];
		}
		e = s / n;
		d = Math.abs(a[0] - e);
		for (int i = 1;i < n;i++)
		{
			if (d < Math.abs(a[i] - e))
			{
				d = Math.abs(a[i] - e);
			}
		}
		int t;
		for (t = 0;t < n;t++)
		{
			if (Math.abs(a[t] - e) == d)
			{
				System.out.print(a[t]);
				break;
			}
		}
		for (int i = t + 1;i < n;i++)
		{
			if (Math.abs(a[i] - e) == d)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

