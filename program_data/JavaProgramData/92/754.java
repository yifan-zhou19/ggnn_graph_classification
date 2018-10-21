package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return ((int)a - (int)b);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int max;
		int maxnum;
		int money;
		int[] t = new int[1001];
		int[] q = new int[1001];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			money = 0;
			//? 
			for (i = 0;i < n;i++)
			{
				flag = 0;
				max = -100;
				maxnum = -1;
				for (j = 0;j < n;j++)
				{
					if (q[j] < t[i] && q[j]> max)
					{
						max = q[j];
						maxnum = j;
						flag = 1;
					}
				}
				if (flag != 0)
				{
					t[i] = -100;
					q[maxnum] = -100;
					money += 200;
				}
			}
			//?
			for (i = 0;i < n;i++)
			{
				if (t[i] == -100)
				{
					continue;
				}
				for (j = 0;j < n;j++)
				{
					if (q[j] == -100)
					{
						continue;
					}
					if (t[i] == q[j])
					{
						t[i] = -100;
						q[j] = -100;
						break;
					}
				}
			}
			//?
			for (i = 0;i < n;i++)
			{
				if (q[i] != -100)
				{
					money -= 200;
				}
			}
			//print
			System.out.printf("%d\n",money);
		}
		return 0;
	}
}

