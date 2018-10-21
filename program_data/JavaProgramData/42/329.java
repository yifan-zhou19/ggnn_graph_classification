package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				i--;
				n--;
			}
		}
		if (a[n - 1] == k)
		{
			m = n - 1;
		}
		else
		{
			m = n;
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[m - 1]);
		return 0;
	}
}

