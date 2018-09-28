package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		int c;
		int d;
		int n;
		int e;
		int j;
		int k;
		int m;
		int[] a = new int[1000000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (k = 1;k <= n;k++)
		{
			if (a[k] != b)
			{
					System.out.printf("%d",a[k]);
			break;
			}
		}

		for (j = k + 1;j <= n;j++)
		{
				if (a[j] != b)
				{
					System.out.printf(" %d",a[j]);
				}
		}

		return 0;
	}

}

