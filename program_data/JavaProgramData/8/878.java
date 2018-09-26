package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????.cpp
	 * ??????
	 * ?????2012.11.27
	 * ??????????????????????????
	 */
	public static int x;
	public static int y;
	public static int print()
	{
		System.out.print(" ");
		return 0;
	}
	public static void order(int n)
	{
		int i;
		int j;
		int temp = 0;
		int[] a = new int[10];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j + 1] < a[j])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
	}
	public static int Main()
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		order(x);
		print();
		order(y);
		return 0;
	}

}

