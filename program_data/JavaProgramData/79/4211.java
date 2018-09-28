package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		while (true)
		{
			int m;
			int n;
			int i = 0;
			int a = 0;
			int b = 0;
			int[] sz = new int[1000];
			int numofking = 0;
			int c = 0;
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
			if (n == 0 || m == 0)
			{
				break;
			}
			c = n;
			for (i = 0; i < n; i++)
			{
				sz[i] = 1;
			}
			while (n > 1)
			{
				while (a < m)
				{
					if (sz[b] == 1)
					{
						a = a + 1;
						if (a == m)
						{
							sz[b] = 0;
						}
					}
					b++;
					b = b % c;
				}
				a = 0;
				n = n - 1;
			}
			for (i = 0; i < c; i++)
			{
				if (sz[i] == 1)
				{
					numofking = i + 1;
					break;
				}
			}
			System.out.printf("%d\n",numofking);
		}
		return 0;
	}

}

