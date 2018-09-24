package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] a = new int[25];
	public static int[] b = new int[25];

	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int n = 0;
		for (j = 0;j < k;j++)
		{
			b[j] = 1;
			for (i = 0;i < j;i++)
			{
				if (a[i] >= a[j])
				{
					if (b[i] + 1 > b[j])
					{
						b[j] = b[i] + 1;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (n <= b[i])
			{
				n = b[i];
			}
		}
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}

}

