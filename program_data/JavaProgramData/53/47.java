package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = -1;
				}
			}
		}
		k = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != -1)
			{
				k++;
			}
		}
		   j = 0;
		   i = 0;
		while (j <= k - 2)
		{
			if (a[i] != -1)
			{
				System.out.printf("%d,",a[i]);
				j++;
			}
			i++;
		}
		for (j = i;j <= n - 1;j++)
		{
			if (a[j] != -1)
			{
				System.out.printf("%d",a[j]);
			}
		}
	}


}

