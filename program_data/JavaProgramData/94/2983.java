package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y = 0;
		int[] a = new int[501];
		int[] b = new int[501];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 0;x < n;x++)
		{
			a[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (x = 0;x < n;x++)
		{
			if (a[x] % 2 != 0)
			{
				b[y] = a[x];
				y++;
			}

		}
		sort(b,b + y);
		System.out.print(b[0]);
		for (x = 1;x < y;x++)
		{
			System.out.print(',');
			System.out.print(b[x]);
		}
		return 0;
	}

}

