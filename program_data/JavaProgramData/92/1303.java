package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i;
		int j;
		int win;
		int draw;
		int lose;
		int t;
		int k;
		int p;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			win = 0;
			draw = 0;
			lose = 0;
			max = -9999;
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 1;i <= n - 1;i++)
			{
				for (j = 1;j <= n - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						 t = a[j];
						 a[j] = a[j + 1];
						 a[j + 1] = t;
					}
					if (b[j] < b[j + 1])
					{
						t = b[j];
						b[j] = b[j + 1];
						b[j + 1] = t;
					}
				}
			}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (j + i > n)
				{
					k = j + i - n;
				}
				else
				{
					k = j + i;
				}
				if (a[k] > b[j])
				{
					win = win + 1;
				}
				else if (a[k] == b[j])
				{
					draw = draw + 1;
				}
				else
				{
					lose = lose+1;
				}
			}
			p = 200 * (win - lose);
			if (p > max)
			{
				max = p;
			}
			win = 0;
			draw = 0;
			lose = 0;
		}
			System.out.printf("%d\n",max);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}


}

