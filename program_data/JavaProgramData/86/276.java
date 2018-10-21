package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int stop;
		int j;
		int[] a = new int[11];
		int t;
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stop = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < stop;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}

				t = a[j] + 3 * stop;
			}

				if (t < 61)
				{
					total = 60 - 3 * stop;
				}
				else if (t < 64)
				{
					total = a[j - 1];
				}
				else
				{
					t = a[j - 2] + 3 * (stop - 1);
					if (t < 61)
					{
						total = 60 - 3 * (stop - 1);
					}
					else if (t < 64)
					{
						total = a[j - 2];
					}
					else
					{
						total = 60 - 3 * (stop - 2);
					}
				}
				System.out.printf("%d\n",total);

		}
		return 0;
	}


}

