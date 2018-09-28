package <missing>;

public class GlobalMembers
{
	public static void order(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int k;
		int e;
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (*(p.argValue + i) < *(p.argValue + i + 1))
				{
					e = (p.argValue + i);
					*(p.argValue + i) = *(p.argValue + i + 1);
					*(p.argValue + i + 1) = e;
				}
			}
		}
	}
	public static void Main(String[] args)
	{
		int n;
		int[] king = new int[1000];
		int[] minister = new int[1000];
		int i;
		int k;
		int money = 0;
		int money_plus = 0;
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
					minister[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					king[i] = Integer.parseInt(tempVar3);
				}
			}
		tangible.RefObject<Integer> tempRef_king = new tangible.RefObject<Integer>(king);
			order(tempRef_king, n);
			king = tempRef_king.argValue;
		tangible.RefObject<Integer> tempRef_minister = new tangible.RefObject<Integer>(minister);
			order(tempRef_minister, n);
			minister = tempRef_minister.argValue;
			i = 0;
			k = 0;
			int m = n;
			while (i < n && k < m)
			{
				if (king[i] > minister[k])
				{
					i++;
					m--;
					money -= 200;
				}
				else if (king[i] == minister[k])
				{
					if (king[n - 1] > minister[m - 1])
					{
						i++;
						m--;
						money -= 200;
					}
					else if (king[n - 1] < minister[m - 1])
					{
						n--;
						m--;
						money += 200;
					}
					else
					{
						if (king[i] == king[n - 1])
						{
							break;
						}
						else
						{
							i++;
							m--;
							money -= 200;
						}
					}
				}
				else
				{
					i++;
					k++;
					money += 200;
				}
			}
			System.out.printf("%d\n",money);
					money = 0;
		}
	}
}

