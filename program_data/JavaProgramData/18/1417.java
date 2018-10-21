package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int[] p = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int nn = n;
		int min;
		int s;
		int i;
		int j;
		int nnn = n;
		while (nn-- != 0)
		{
			n = nnn;
			s = 0;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) + j = tempVar2;
			}
			}
			}
			while (n > 1)
			{
			for (i = 0;i < n;i++)
			{
				min = 1000000;
				for (j = 0;j < n;j++)
				{
				if (*(*(a + i) + j) < min)
				{
					min = (*(a + i) + j);
				}
				}
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) -= min;
				}
			}
			for (j = 0;j < n;j++)
			{
				min = 1000000;
				for (i = 0;i < n;i++)
				{
				if (*(*(a + i) + j) < min)
				{
					min = (*(a + i) + j);
				}
				}
				for (i = 0;i < n;i++)
				{
					*(*(a + i) + j) -= min;
				}
			}
			s = s + *(*(a + 1) + 1);
			for (i = 1;i < n - 1;i++)
			{
			*(a + i) = *(a + i + 1);
			}
	for (i = 1;i < n - 1;i++)
	{
			*(*(a + i)) = *(*(a + i + 1));
	}
			for (i = 1;i < n;i++)
			{
				for (j = 1;j < n;j++)
				{
					*(*(a + i) + j) = *(*(a + i + 1) + j + 1);
				}
			}

			n--;
			}
			System.out.printf("%d\n",s);
		}
	}

}

