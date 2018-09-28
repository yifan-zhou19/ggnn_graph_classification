package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int k = 1;
		int s = 0;
		int[] a = new int[500];
		int[] b = new int[500];
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[k] = a[i];
				k++;
				s++;
			}
		}
		for (j = 0;j < s;j++)
		{
			for (k = 1;k <= s - j;k++)
			{
				if (b[k] < b[k + 1])
				{
					e = b[k + 1];
					b[k + 1] = b[k];
					b[k] = e;
				}
			}
			if (s - j != 1)
			{
			System.out.printf("%d,",b[s - j]);
			}
			if (s - j == 1)
			{
				System.out.printf("%d",b[s - j]);
			}
		}
		return 0;
	}


}

