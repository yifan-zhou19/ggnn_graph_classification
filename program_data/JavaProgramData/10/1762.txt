package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int i;
	public static int j;
	public static int n = 0;
	public static int t;
	public static int[] a = new int[25];
	public static int[] b = new int[25];
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					t = b[j] + 1;
					if (t > b[i])
					{
						b[i] = t;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (b[i] > n)
			{
				n = b[i];
			}
		}
		System.out.print(n + 1);

	}
}

