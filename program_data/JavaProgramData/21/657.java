package <missing>;

public class GlobalMembers
{
	/*
	 * 1234.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: c130
	 */
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[300];
		float max;
		float min;
		float s = 0F;
		float v;
		float w;
		float e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		max = a[0];
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
				if (a[i] < min)
				{
					min = a[i];
				}
		}
		for (i = 0;i < n;i++)
		{
				s = s + a[i];
		}
		v = s / n;
		w = v - min;
		e = max - v;
		if (w > e)
		{
			System.out.print(min);
			System.out.print("\n");
		}
		else
		{
			if (w == e)
			{
				System.out.print(min);
				System.out.print(",");
				System.out.print(max);
				System.out.print("\n");
			}
				else
				{
					System.out.print(max);
					System.out.print("\n");
				}
		}
		return 0;
	}

}

