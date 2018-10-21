package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[30];
	public static int[] a = new int[30];
	public static int k;

	public static int Main()
	{
		int i;
		int j;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f[i] = 1;
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (f[j] + 1 > f[i])
					{
						f[i] = f[j] + 1;
					}
				}
			}
		}
		j = f[0];
		for (i = 1;i < k;i++)
		{
			if (f[i] > j)
			{
				j = f[i];
			}
		}
		System.out.print(j);
		System.out.print("\n");
		return 0;
	}
}

