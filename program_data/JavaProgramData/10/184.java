package <missing>;

public class GlobalMembers
{
	public static int dd(int no, float h)
	{
		while (h < a[no - 1])
		{
			if (no == n)
			{
				break;
			}
			 no++;
		}
		if (no == n)
		{
			if (h >= a[n - 1])
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			int b = dd(no + 1, a[no - 1]);
			int c = dd(no + 1, h);
			if (b >= c)
			{
				return b + 1;
			}
			else
			{
				return c;
			}
		}
	}
	public static int n;
	public static int[] a = new int[25];
	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(dd(1, 10000F));
		System.out.print("\n");
		return 0;
	}
}

