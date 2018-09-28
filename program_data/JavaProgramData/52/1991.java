package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int j;
		int n;
		int m;
		int temp;
		int temp2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1; j <= m; j++)
		{
			temp = a[n];
			for (i = n; i >= 2; i--)
			{
				temp2 = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp2;
			}
			a[1] = temp;
		}
		for (i = 1; i < n; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n]);
		return 0;
	}
}

