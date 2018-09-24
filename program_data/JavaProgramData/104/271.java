package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012712_322.cpp
	 *Author:???
	 * Created on: 2010-11-21
	 * ????????
	 */
	public static int Main()
	{
		int[] x = new int[1000];
		int[] a = new int[1000];
		int[] y = new int[1000];
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		a[0] = 1;
		for (i = 1;i < 100;i++)
		{
			a[i] = a[i - 1] * 2;
		} //a[]?2?n???
		for (j = 2;j < 100;j++)
		{
			if (x[1] == 1)
			{
				j = 1;
				break;
			}
			for (i = 0;i < 100;i++)
			{
			   if (x[j - 1] < a[i])
			   {
				   break;
			   }
			}
			int t = a[i - 1]; //t?x[j]????????
			int m;
			m = (x[j - 1] - t) / 2;
			x[j] = t / 2 + m;
			if (x[j] == 1)
			{
				break;
			}
		} //???x???????
		int n = j;
		for (j = 2;j < 100;j++)
		{
				for (i = 0;i < 100;i++)
				{
				   if (y[j - 1] < a[i])
				   {
					   break;
				   }
				}
				int t = a[i - 1]; //t?x[j]????????
				int m;
				m = (y[j - 1] - t) / 2;
				y[j] = t / 2 + m;
				if (y[j] == 1)
				{
					break;
				}
		} //???y???????
		int m = j;
		for (i = 0;i <= 100;i++)
		{
			if (x[n - i] != y[m - i])
			{
				break;
			}
		} //???????????
		if ((x[1] == 1000) && (y[1] == 1000))
		{
			System.out.print(1000);
			System.out.print("\n");
		}
		else
		{
			System.out.print(x[n - i + 1]);
			System.out.print("\n");
		}

		return 0;
	}

}

