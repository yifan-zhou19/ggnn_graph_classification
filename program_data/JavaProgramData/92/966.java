package <missing>;

public class GlobalMembers
{
	public static void sort(int[] p, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (p[j] < p[j + 1])
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
			}
		}
	}
	public static void Main()
	{
		/*l????????r???????*/
		int n;
		int i;
		int tl;
		int tr;
		int ql;
		int qr;
		int money;
		int[] tj = new int[2000];
		int[] qw = new int[2000];
		while (scanf("%d", n), n)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tj[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qw[i] = Integer.parseInt(tempVar2);
				}
			}
			/*??????*/
			sort(tj, n);
			sort(qw, n);
			/*??*/				
			money = 0;
			tl = ql = 0;
			tr = qr = n - 1;
			while (tl <= tr != 0 && ql <= qr)
			{
				if (tj[tl] > qw[ql])
				{
					money = money + 200;
					tl++;
					ql++;
				}
				else if (tj[tr] > qw[qr])
				{
					money = money + 200;
					tr--;
					qr--;
				}
				else
				{
					if (tj[tr] < qw[ql])
					{
						money = money - 200;
					}
					tr--;
					ql++;
				}
			}
			System.out.printf("%d\n",money);
		}
	}
}

