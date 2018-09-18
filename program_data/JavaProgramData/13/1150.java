package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < n;j++)
		{
			for (k = 0;k < j;k++)
			{
				if (a[j] == a[k])
				{
					a[j] = 0;
				}
			}
			if (a[j] != 0)
			{
				System.out.printf(" %d",a[j]);
			}
		}
		return 0;
	}

}

