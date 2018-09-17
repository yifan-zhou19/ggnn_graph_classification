package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[12];
		int[] b = new int[12];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = b[0] = 1;
		while (x != 1)
		{
			a[a[0]] = x;
			a[0]++;
			x = x / 2;
		}
		a[a[0]] = 1;

		while (y != 1)
		{
			b[b[0]] = y;
			b[0]++;
			y = y / 2;
		}
		b[b[0]] = 1;

		int k = 0;
		while (a[a[0] - k] == b[b[0] - k])
		{
			k++;
		}

		if (a[0] - k + 1 == 0)
		{
			System.out.print(a[1]);
		}
		else
		{
			System.out.print(a[a[0] - k + 1]);
		}
		return 0;
	}

}

