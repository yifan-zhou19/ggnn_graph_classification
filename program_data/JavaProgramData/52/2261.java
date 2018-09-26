package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[200];
		int i;
		int j;
		int k;
		int n;
		int m;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = n;j <= 2 * n - 1;j++)
		{
			a[j] = a[j - n];
		}
		System.out.printf("%d",a[n - m]);
		for (k = n - m + 1;k <= 2 * n - 1 - m;k++)
		{
			System.out.printf(" %d",a[k]);
		}
		System.out.print("\n");
	}

}

