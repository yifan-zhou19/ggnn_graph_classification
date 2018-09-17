package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[13];
		a[1] = 31;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
		a[2] = 29;
		}
		else
		{
		a[2] = 28;
		}
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		int n;
		int i;
		n = 0;
		for (i = 1;i < m;i++)
		{
		n = n + a[i];
		}
		n = n + d;
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}

}

