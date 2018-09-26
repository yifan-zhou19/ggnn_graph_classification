package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  short[] a = new short[310];
		  int n;
		  int m;
		  int i;
		  int j;
		  int k;
		  int st;

		  a[0] = 1;
		  do
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
				if (0 == n && 0 == m)
				{
					break;
				}
				for (i = 1;i <= n;i++)
				{
					a[i] = 0;
				}
				st = 0;
				for (i = 1;i <= n;i++)
				{
					for (j = 1;j <= m;j++)
					{
						st++;
						if (st == n + 1)
						{
							st = 1;
						}
						while (a[st] == 1)
						{
							st++;
							if (n + 1 == st)
							{
								st = 1;
							}
						}
					}
					a[st] = 1;
					if (i == n)
					{
						System.out.printf("%d\n",st);
					}
				}
		  }while (0 != n || 0 != m);
		  return 0;
	}

}

