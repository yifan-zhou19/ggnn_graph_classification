package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int c;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= 2;j = j + 1)
		{
			for (i = 0;i <= n - 2;i = i + 1)
			{
				if (a[i] > a[i + 1])
				{
					c = a[i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
			}
		}
		System.out.printf("%d\n%d",a[n - 1],a[n - 2]);
	}


}

