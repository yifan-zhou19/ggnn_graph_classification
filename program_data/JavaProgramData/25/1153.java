package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[40];
	public static int[] b = new int[40];
	public static void f()
	{
		int i;
		int y;
		for (i = 0; i < 40; i++)
		{
			b[i] = 0;
		}
		for (i = 39; i > 0; i--)
		{
			y = a[i] * 2;
			b[i - 1] += y / 10;
			b[i] += y % 10;
			if (b[i] > 9)
			{
				b[i - 1]++;
				b[i] -= 10;
			}
		}
		for (i = 0; i < 40; i++)
		{
			a[i] = b[i];
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[39] = 2;
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i < n; i++)
			{
				f();
			}
			for (i = 0; ;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			for (j = i; j < 40; j++)
			{
				System.out.print(a[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

