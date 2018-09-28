package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[302];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[j] == a[i])
				{
					a[j] = -1;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i] >= 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}


}

