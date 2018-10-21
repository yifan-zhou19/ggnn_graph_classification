package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int k;
		int m;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[500];
		int[] b = new int[500];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0 && a[i] != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (k = 1;k <= j;k++)
		{
			m = 0;
			for (i = 0;i <= j - k;i++)
			{
				if (b[i] > b[m])
				{
					m = i;
				}
			}
			if (m != j - k)
			{
				c = b[m];
				b[m] = b[j - k];
				b[j - k] = c;
			}
		}
		for (k = 0;k < j - 1;k++)
		{
		   System.out.printf("%d,",b[k]);
		}
		System.out.printf("%d",b[j - 1]);
	}


}

