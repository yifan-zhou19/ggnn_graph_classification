package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int k;
		int[] b = new int[25];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int max1;
	//	int dex;
		for (int i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = 1;
		}
		for (int j = k - 1;j >= 0;j--)
		{
			max1 = 0;
			for (int m = k - 1;m > j;m--)
			{
				if (a[m] <= a[j] != 0 && b[m] >= max1)
				{
					max1 = b[m];
				}
			}
			b[j] = max1 + 1;
		}
		int max;
		max = b[0];
		for (int n = 1;n < k;n++)
		{
			if (max < b[n])
			{
				max = b[n];
			}
		}
		System.out.print(max);
		System.out.print("\n");


		return 0;
	}



}

