package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[100][100];
		for (int i = 0;i < r;i++)
		{
			for (int j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int i = 0;
		int j = 0;
		int p = 0;
		int q = 0;
		int n = 0;
		while (i <= r / 2 && j <= c / 2)
		{
		while (q < c - j)
		{
			 System.out.printf("%d\n",sz[p][q]);
			 q++;
			 n++;
		}
		if (n >= r * c)
		{
			 break;
		}
			 q = q - 1;
			 p = p + 1;
		while (p < r - i)
		{
			 System.out.printf("%d\n",sz[p][q]);
			 p++;
			 n++;
		}
		if (n >= r * c)
		{
			 break;
		}
			 p = p - 1;
			 q = q - 1;
		while (q >= j)
		{
			 System.out.printf("%d\n",sz[p][q]);
			 q--;
			 n++;
		}
		if (n >= r * c)
		{
			 break;
		}
			 q = q + 1;
			 p = p - 1;
			 i = i + 1;
		while (p >= i)
		{
			  System.out.printf("%d\n",sz[p][q]);
			  p--;
			  n++;
		}
		if (n >= r * c)
		{
			 break;
		}
			  p = p + 1;
			  q = q + 1;
			  j = j + 1;
		}
		return 0;
	}
}

