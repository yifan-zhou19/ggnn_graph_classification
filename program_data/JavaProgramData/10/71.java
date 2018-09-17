package <missing>;

public class GlobalMembers
{
	public static int maxnum(int[] a, int n, int up)
	{
		if (n == 0)
		{
			return 0;
		}
		int i;
		int max = -1;
		int t;
		for (i = 0;i < n;i++)
		{
			t = up;
			if (a[i] <= up != 0 || up == -1)
			{
				t = a[i];
			}
			else
			{
				continue;
			}
			if (maxnum(a + i + 1, n - 1 - i, t) > max)
			{
				max = maxnum(a + i + 1, n - i - 1, t);
			}
		}
		return max + 1;
	}

	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[25];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(maxnum(a, n, -1));
	}

}

