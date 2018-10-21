package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int k;
		int i;
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
			for (k = 0;k <= i - 1;k++)
			{
				if (a[k] == a[i])
				{
					a[i] = -100;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else if (a[i] != -100)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}
}

