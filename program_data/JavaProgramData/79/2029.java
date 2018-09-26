package <missing>;

public class GlobalMembers
{
	public static int findking(int m, int n)
	{
		int i = 0;
		int num = 0;
		int zero = 0;
		int king;
		int[] sz = new int[300];
		while (true)
		{
			zero = 0;
			for (int j = 0;j < n;j++)
			{
				if (sz[j] == 0)
				{
					zero++;
				}
			}
			if (zero == 1)
			{
				break;
			}
			if (sz[i] == 1)
			{
					if (i == (n - 1))
					{
				i = 0;
					}
			else
			{
				i++;
			}
				continue;
			}
			num++;
			if (num == m)
			{
				sz[i] = 1;
				num = 0;
			}
			if (i == (n - 1))
			{
				i = 0;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				king = i + 1;
			}
		}
		return king;
	}
	public static int Main()
	{
		int[] m = new int[300];
		int[] n = new int[300];
		int[] king = new int[300];
		int i;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if ((m[i] == 0) && (n[i] == 0))
			{
				break;
			}
		}
		for (i = 0;i < 300;i++)
		{
			if (m[i] == 0 && n[i] == 0)
			{
				break;
			}
			king[i] = findking(m[i], n[i]);
		}
		for (i = 0;i < 300;i++)
		{
			if ((m[i] == 0) && (n[i] == 0))
			{
				break;
			}
			System.out.printf("%d\n",king[i]);
		}
		return 0;
	}

}

