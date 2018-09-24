package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		int m;
		int c;
		int[] a = new int[50];
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 1;
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] <= a[j])
				{
					if (b[i] < b[j] + 1)
					{
						b[i] = b[j] + 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p < b[i])
			{
				p = b[i];
			}
		}
		System.out.printf("%d",p);
	}

}

