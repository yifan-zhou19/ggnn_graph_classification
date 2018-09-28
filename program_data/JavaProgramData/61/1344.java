package <missing>;

public class GlobalMembers
{
	/*
	 * ????Fibonacci Sequence.cpp
	 * ??????
	 * ????: 2012-11-5
	 * ??:??????????a??????
	 */

	public static int Main()
	{
		int n;
		int[] a = new int[21];
		int[] Fibonacci = new int[21];
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++) //????a????a[i]??
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		Fibonacci[1] = 1;
		Fibonacci[2] = 1;
		for (i = 3;i <= 20;i++)
		{
			Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2]; //Fibonacci???????????
		}
		for (k = 1;k <= n;k++)
		{
		System.out.print(Fibonacci[a[k]]);
		System.out.print("\n");
		}
		return 0;
	}

}

