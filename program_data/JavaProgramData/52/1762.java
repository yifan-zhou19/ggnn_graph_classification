package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int j;
		int k;
		int t;
		for (j = 1;j <= m;j++)
		{
		for (k = n - 1;k >= 0;k--)
		{
			if (k == n - 1)
			{
				t = a[k];
				a[k] = a[k - 1];
			}
			else if (k == 0)
			{
				a[k] = t;
			}
			else
			{
				a[k] = a[k - 1];
			}
		}
		}
		int l;
		for (l = 0;l < n - 1;l++)
		{
			System.out.printf("%d ",a[l]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

