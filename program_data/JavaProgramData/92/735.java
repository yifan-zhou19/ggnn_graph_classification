package <missing>;

public class GlobalMembers
{
	// #include <conio.h>
	public static int[] tian = new int[1004];
	public static int[] qi = new int[1004];
	public static int cmp(Object c1, Object c2)
	{
		return *(int)c2 - (int)c1;
	}
	public static int Main()
	{
		int n;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n <= 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian[i] = Integer.parseInt(tempVar2);
				}
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qi[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(tian,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),cmp);
			int ts = 0;
			int te = n - 1;
			int qs = 0;
			int qe = n - 1;
			int nMoney = 0;
			while (ts <= te)
			{
				if (tian[ts] > qi[qs])
				{
					ts++;
					qs++;
					nMoney += 200;
				}
				else if (tian[ts] < qi[qs])
				{
					nMoney -= 200;
					qs++;
					te--;
				}
				else
				{
					if (tian[te] > qi[qe])
					{
						nMoney += 200;
						te--;
						qe--;
					}
					else if (tian[te] < qi[qe])
					{
						nMoney -= 200;
						te--;
						qs++;
					}
					else
					{
						if (tian[te] > qi[qs])
						{
							nMoney += 200;
							te--;
							qs++;
						}
						else
						{
							if (tian[te] < qi[qs])
							{
								nMoney -= 200;
							}
							te--;
							qs++;
						}
					}
				}
			}
			System.out.printf("%d\n",nMoney);
		}
	// 	getch();
		return 0;
	}
}

