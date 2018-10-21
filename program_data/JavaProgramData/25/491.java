package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10001];
	public static int len = 1;
	public static void cal()
	{
		int i;
		a[len] *= 2;
		i = len - 1;
		if (a[len] >= 10)
		{
			a[len] -= 10;
			a[++len] = 1;
		}
		for (;i >= 1;i--)
		{
			a[i] *= 2;
			if (a[i] >= 10)
			{
				a[i] -= 10;
				a[i + 1] += 1;
			}
		}
	}

	public static int Main()
	{
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= 10000;j++)
		{
			a[j] = -1;
		}
		a[1] = 1;
		for (j = 1;j <= n;j++)
		{
			cal();
		}
		for (j = len;j >= 1;j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

