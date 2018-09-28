package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static void Main(String[] args)
	{
		int n;
		int[] tian = new int[1001];
		int[] king = new int[1001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int finish = 0;
		if (n == 0)
		{
			finish = 1;
		}
		while (finish == 0)
		{
			if (n == 0)
			{
				finish = 1;
				break;
			}
			int i;
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					king[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(tian, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(king, n, (Integer.SIZE / Byte.SIZE), cmp);
			int ltian;
			int rtian;
			int lking;
			int rking;
			ltian = 0;
			rtian = n - 1;
			lking = 0;
			rking = n - 1;
			int money = 0;
			for (i = 0; i < n; i++)
			{
				if (tian[rtian] > king[rking])
				{
					money += 200;
					rtian--;
					rking--;
				}
				else if (tian[ltian] > king[lking])
				{
					money += 200;
					ltian++;
					lking++;
				}
				else
				{
					if (tian[ltian] > king[rking])
					{
						money += 200;
						ltian++;
						rking--;
					}
					else if (tian[ltian] == king[rking])
					{
						ltian++;
						rking--;
					}
					else if (tian[ltian] < king[rking])
					{
						money -= 200;
						ltian++;
						rking--;
					}
				}
			}
			System.out.printf("%d",money);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
			if (n != 0)
			{
				System.out.print("\n");
			}
			else
			{
				finish = 1;
			}
		}
	}
}

