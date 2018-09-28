package <missing>;

public class GlobalMembers
{
	public static int min(int[] a, int n)
	{
		int min = a[1];
		int i;
		for (i = 0;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
		}
		return min;
	}
	public static void Main()
	{
		int[] T = new int[1100];
		int[] Q = new int[1100];
		int n = 1;
		int i;
		int k;
		int e;
		int s;
		int money = 0;
		int first;
		int endT;
		int endQ;
		while (n != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			first = 0,endT = n - 1,endQ = n - 1;
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					T[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					Q[i] = Integer.parseInt(tempVar3);
				}
			}
			for (k = 1;k < n;k++)
			{
				for (i = 0;i < n - k;i++)
				{
					if (T[i] < T[i + 1])
					{
						e = T[i];
						T[i] = T[i + 1];
						T[i + 1] = e;
					}
					if (Q[i] < Q[i + 1])
					{
						e = Q[i];
						Q[i] = Q[i + 1];
						Q[i + 1] = e;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (T[first] > Q[i])
				{
					first++;
					money += 200;
				}
				else if (T[first] < Q[i])
				{
					endT--;
					money -= 200;
				}
				else if (T[first] == Q[i])
				{
					for (k = endT,s = endQ;k >= first;k--,s--)
					{
						if (T[k] > Q[s])
						{
							money += 200;
							endT--;
							endQ--;
						}
						else
						{
							if (T[k] < Q[i])
							{
							money -= 200;
							}
							endT = k - 1;
							endQ = s;
							break;
						}
					}
				}
				if (first > endT)
				{
					break;
				}
			}
			System.out.printf("%d\n",money);
			money = 0;
		}
	}
}

