package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int e = 0;
		int j;
		int k;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[e] = a[i];
				e++;
			}
		}
		for (i = 0;i < e;i++)
		{
			for (j = 0;j < e-1;j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j + 1];
					b[j + 1] = b[j];
					b[j] = k;
				}
			}
		}
		for (i = 0;i < e-1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[e-1]);
	}


}

