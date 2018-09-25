package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y = 0;
		int m = 0;
		int d = 0;
		int sum = 0;
		int i = 0;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			a[1] = 29;
		}
		for (i = 0;i <= m - 2;i++)
		{
			sum = sum + a[i];
		}
		sum = sum + d;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

