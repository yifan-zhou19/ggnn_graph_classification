package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int x;
		for (x = 0;;x++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		else
		{
		int[] sz = new int[300];

		int i;
		int j;
		int begin = 0;
		for (i = n;i > 1;i--)
		{
			int M;
			M = m % i;
			if (M == 0)
			{
				M = i; //??//
			}
			else
			{
				M = m % i;
			}
			int count = 0;
			for (j = begin;j < n;j++)
			{
				if (sz[j] == 0)
				{
					count++;
				}
			}

			int monkey_count = 0;
			if (count >= M)
			{
				for (j = begin;j < n;j++)
				{
					if (sz[j] == 0)
					{
						monkey_count++;

					if (monkey_count == M)
					{
						begin = j;
						sz[j] = 1;
						break;
					}
					}
				}
			}
			else
			{
				for (j = begin;j < n;j++)
				{
					if (sz[j] == 0)
					{
						monkey_count++;
					}
				}
				for (j = 0;j < n;j++)
				{
					if (sz[j] == 0)
					{
						monkey_count++;
						if (monkey_count == M)
						{
							begin = j;
							sz[j] = 1;
							break;
						}
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		}
		}

	}
}

