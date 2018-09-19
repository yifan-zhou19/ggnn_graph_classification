package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int m;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < k;i++)
		{
			for (j = 0,m = 1;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
				n = 0;
				}
				else
				{
					n = 1;
				}
				m = m * n;
			}
			if (m == 1)
			{
				System.out.printf(" %d",a[i]);
			}


		}
		return 0;
	}

}

