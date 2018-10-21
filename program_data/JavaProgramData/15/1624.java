package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[1000][1000];
	public static int Main()
	{
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int m;
		int n;
		int p;
		int q;
		int s;
		int w;
		w = 0;
		for (i = 0;i < k && w == 0;i++)
		{
			for (j = 0;j < k && w == 0;j++)
			{
				if (num[i][j] == 0)
				{
					m = i;
					p = j;
					w = 1;
				}
			}
		}
		n = 0;
		q = 0;
		for (i = m,j = p;j < k;j++)
		{
			if (num[i][j] == 0)
			{
				n++;
			}
		}
		for (i = m,j = p;i < k;i++)
		{
			if (num[i][j] == 0)
			{
				q++;
			}
		}
		s = (n - 2) * (q - 2);
		System.out.printf("%d", s);
		return 0;
	}

}

