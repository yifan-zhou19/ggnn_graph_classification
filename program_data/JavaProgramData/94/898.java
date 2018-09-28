package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int m;
		int e;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		j = -1;
		m = 0;
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 == 1)
			{
				j++;
			b[j] = a[i];
			m++;
			}
		}
		for (k = 0;k < m - 1;k++)
		{
			for (j = 0;j < m - 1 - k;j++)
			{
				 if (b[j] > b[j + 1])
				 {
					  e = b[j];
					  b[j] = b[j + 1];
					  b[j + 1] = e;
				 }
			}
		}
		for (j = 0;j < m;j++)
		{
			if (j < m - 1)
			{
			System.out.printf("%d,",b[j]);
			}
			else
			{
			System.out.printf("%d",b[j]);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			1 = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

