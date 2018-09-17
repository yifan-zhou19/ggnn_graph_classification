package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int k;
		int i;
		int j;
		int max2;
		int max1;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = 1;
		for (i = 1;i < k;i++)
		{
			max1 = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] <= a[j])
				{
					if (max1 < (b[j] + 1))
					{
						max1 = b[j] + 1;
					}
				}
			}
			b[i] = max1;
		}
		max2 = 0;
		for (i = 0;i < k;i++)
		{
			if (b[i] > max2)
			{
				max2 = b[i];
			}
		}
		System.out.print(max2);
		System.out.print("\n");
		return 0;
	}





}

