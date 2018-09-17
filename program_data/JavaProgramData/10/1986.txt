package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[25];
		int[] b = new int[25];
		int max;
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
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] >= a[j] != 0 && b[i] < b[j] + 1)
				{
					b[i] = b[j] + 1;
				}
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			max = (max > b[i])?max:b[i];
		}
		System.out.printf("%d\n",max);
	}

}

