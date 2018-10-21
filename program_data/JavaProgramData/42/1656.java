package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int c;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		for (i = 0;i < n;i++)
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
			k = Integer.parseInt(tempVar3);
		}
		c = 0;
		m = n;

			for (i = 0;i < m;i++)
			{
				if (a[i] == k)
				{
					for (j = i;j < m;j++)
					{
					a[j] = a[j + 1];
					}
					c += 1;
					m -= 1;
					i--;
				}
			}

			for (i = 0;i < n - c - 1;i++)
			{
			System.out.printf("%d ",a[i]);
			}
			System.out.printf("%d",a[n - c - 1]);


			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		return 0;
	}
}

