package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[302];
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
				if (a[i] == a[k])
				{
					a[k] = 0;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0 && i == 1)
			{
				System.out.printf("%d",a[i]);
			}
			else if (a[i] != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}

}

