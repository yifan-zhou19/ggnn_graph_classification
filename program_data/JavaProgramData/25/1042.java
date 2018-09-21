package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (j == 0)
				{
					b[j] = (a[j] * 2) / 10;
					a[j] = (a[j] * 2) % 10;

				}
				else
				{
					b[j] = (a[j] * 2 + b[j - 1]) / 10;
					a[j] = (a[j] * 2 + b[j - 1]) % 10;
				}
			}
		}
		for (i = 100;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				for (j = i;j >= 0;j--)
				{
					System.out.print(a[j]);
				}
				break;
			}
		}
		return 0;
	}

}

