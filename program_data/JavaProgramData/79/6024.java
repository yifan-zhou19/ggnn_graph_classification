package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] sz = new int[300];
		int n;
		int m;
		int i;
		int k;
		int j;
		int szhe = 0;
		int add = 0;
		int XS;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
			break;
			}
			for (i = 0;i < n;i++)
			{
			sz[i] = 1;
			}
			for (i = 0;i < n;i++)
			{
				szhe = 0;
				for (k = 0;k < n;k++)
				{
				szhe = szhe + sz[k];
				}
				if (szhe != 1)
				{
					if (sz[i] != 0)
					{
						add++;
					if (add == m)
					{
					sz[i] = 0;
					add = 0;
					}
					}
				}
				else if (szhe == 1)
				{
					for (j = 0;j < n;j++)
					{
						if (sz[j] == 1)
						{
							XS = j + 1;
						}
					}
				System.out.printf("%d\n",XS);
				break;

				}
				if (i == n - 1)
				{
				i = -1;
				}
			}
		}

	}

}

