package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[20000];
		int i = 2;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		while (i <= n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			i = i + 1;
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i = i + 1)
		{
			if (a[i] == a[1])
			{
				a[i] = 0;
			}
		}
		for (k = 2;k <= n;k = k + 1)
		{
			if (a[k] != 0)
			{
			System.out.printf(" %d",a[k]);
			for (j = k + 1;j <= n;j = j + 1)
			{
				if (a[j] == a[k])
				{
					a[j] = 0;
				}
			}
			}
		}
	}
}

