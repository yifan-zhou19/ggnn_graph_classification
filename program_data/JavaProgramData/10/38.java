package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[100];
		int[] f = new int[100];
		a[0] = 100000;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int max = 0;
		for (i = 1;i <= k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (f[i] < f[j] + 1)
					{
						f[i] = f[j] + 1;
					}
				}
			}
			if (max < f[i])
			{
				max = f[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
	}

}

