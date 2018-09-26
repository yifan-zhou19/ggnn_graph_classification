package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
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
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 1000000;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 1000000)
			{
				k = i;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] != 1000000)
			{
				System.out.printf("%d,",a[i]);
			}
		}
	   System.out.printf("%d",a[k]);

	}
}

