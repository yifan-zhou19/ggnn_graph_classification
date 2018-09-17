package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max = 1;
		int[] a = new int[25];
		int[] b = new int[25];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] <= a[j] != 0 && b[i] < b[j] + 1)
				{
					b[i] = b[j] + 1;
					if (b[i] > max)
					{
						max = b[i];
					}
				}
			}
		}

		System.out.printf("%d\n",max);
	}
}

