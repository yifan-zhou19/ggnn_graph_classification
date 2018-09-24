package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int k;
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		int[] a = new int[300];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					for (k = j;k < n - 1;k++)
					{
						a[k] = a[k + 1];
					}
					n = n - 1;
					j = j - 1;
				}
			}
		}
		if (n == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < n;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

