package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[200];
		int i;
		int n;
		int m;
		int k;
		int h;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - m - 1;i++)
		{
			a[n + i] = a[i];
		}
		k = (n - m);
		h = (2 * n) - m;
		for (i = k;i < h - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		i = h - 1;
		System.out.printf("%d",a[i]);
	}
}

