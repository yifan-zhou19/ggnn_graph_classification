package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[400];
		int[] b = new int[400];
		int j;
		int k;
		int m;
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
		for (m = 0,i = 0;i <= n - 1;i++)
		{
			for (j = 0,k = 1;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
				k = 0;
				break;
				}
			}
			if (k != 0)
			{
				b[m] = a[i];
				m++;
			}
		}
		for (i = 0;i <= m - 2;i++)
		{
			System.out.printf("%d,",b[i]);
		};
		System.out.printf("%d",b[m - 1]);
	}


}

