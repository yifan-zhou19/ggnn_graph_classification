package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int[][] sz = new int[1000000][2];
			int i;
			int k;
			int s;
			int p = 0;
			int t;
			int m = 0;
			int f;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			sz[0][0] = 1;
			for (i = 0;1;i++)
			{
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						sz[i][0] = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[i][1] = Integer.parseInt(tempVar3);
					}
					p++;
					if ((sz[i][0] == 0) && (sz[i][1] == 0))
					{
						break;
					}
			}
			}

			for (k = 0;k < n;k++)
			{
				s = 0;
				t = 0;
				f = 0;

				for (i = 0;i < p - 1;i++)
				{
						if (sz[i][1] == k)
						{
							s++;
						}
						if (sz[i][0] == k)
						{
							f = 1;
							break;
						}

				}
				if ((s == n - 1) && (f == 0))
				{
					System.out.printf("%d",k);
					break;
				}
				else
				{
					m++;
				}
			}
			if (m == n)
			{
				System.out.print("NOT FOUND");
			}
			return 0;
		}



}

