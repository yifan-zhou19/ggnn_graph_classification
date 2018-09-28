package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int p;
		int q;
		int k;
		int shuru;
		int[] a = new int[1000];
		for (shuru = 0;shuru < 1000;shuru++)
		{
			for (i = 0;i < 1000;i++)
			{
				a[i] = 0;
			}
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
			if (n == 1)
			{
				System.out.print("1\n");
				continue;
			}
			for (k = n,q = 1,i = 0;;i++)
			{
				p = i % n;
				if (a[p] == 0)
				{
					if ((q % m) != 0)
					{
						q = q + 1;
						continue;
					}
					if ((q % m) == 0)
					{
						a[p] = 1;
						q = q + 1;
						k = k - 1;
					}
					if (k == 1)
					{
						for (j = 0;j < n;j++)
						{
							if (a[j] == 0)
							{
								System.out.printf("%d\n",j + 1);
							}
						}
						break;
					}
				}
				if (a[p] == 1)
				{
					continue;
				}
			}
		}
	}
}

