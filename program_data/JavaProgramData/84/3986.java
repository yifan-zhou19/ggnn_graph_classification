package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[102];
		int j;
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
		for (i = 1;i <= 2;i++)
		{
			k = 1;
			for (j = 2;j <= n;j++)
			{
				if (a[j] > a[k])
				{
					k = j;
				}
			}
			System.out.printf("%d\n",a[k]);
			a[k] = -10000;
		}


	}
}

