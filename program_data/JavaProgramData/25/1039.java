package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[31];

	public static void double_()
	{
		int i;
		for (i = 0; i < 31; i++)
		{
			a[i] = a[i] * 2;
		}
		for (i = 0; i < 31; i++)
		{
			a[i + 1] += a[i] / 10;
			a[i] = a[i] % 10;
		}
	}

	public static int Main()
	{
		a[0] = 1;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			double_();
		}
		for (i = 31; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

