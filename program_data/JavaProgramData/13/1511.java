package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int x = 0;
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
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == 0)
			{
			continue;
			}
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] == a[j])
				{
				a[j] = 0;
				}
			}
		}
	System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf(" %d",a[i]);
			}

		}
		return 0;


	}
}

