package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[25];
		int[] d = new int[25];
		int max;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}

		d[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			max = 0;
			for (j = i + 1;j < k;j++)
			{
				if (a[i] >= a[j] != 0 && max < d[j])
				{
					max = d[j];
				}
			}
			if (max == 0)
			{
				d[i] = 1;
			}
			else
			{
				d[i] = max + 1;
			}
		}

		for (i = 0,max = 0;i < k;i++)
		{
			if (max < d[i])
			{
				max = d[i];
			}
		}
		System.out.printf("%d",max);
	}

}

