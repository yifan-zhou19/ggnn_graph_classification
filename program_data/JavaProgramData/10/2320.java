package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] x = new int[30];
		int[] f = new int[30];
		int temp;
		int max;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f[0] = 1;
		for (i = 1;i < k;i++)
		{
			max = 1;
			for (j = 0;j < i;j++)
			{
				temp = 0;
				if (x[i] <= x[j])
				{
					temp = f[j] + 1;
				}
				if (temp > max)
				{
					max = temp;
				}
			}
			f[i] = max;
		}
		max = 1;
		for (i = 0;i < k;i++)
		{
			if (f[i] > max)
			{
				max = f[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

