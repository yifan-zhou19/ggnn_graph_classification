package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int qa;
		int ra;
		int qb;
		int rb;
		int sum;
		while (scanf("%d", n) && n != 0)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}

			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a, n);
			sort(b, n);
			ra = 0;
			rb = 0;
			qa = n - 1;
			qb = n - 1;
			while (ra <= qa)
			{
				if (a[qa] > b[qb])
				{
					sum += 200,qa--,qb--;
				}
				else if (a[ra] > b[rb])
				{
					sum += 200,ra++,rb++;
				}
				else
				{
					if (a[ra] < b[qb])
					{
						sum -= 200;
					}
					ra++,qb--;
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

