package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int y;
			int m1;
			int m2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				int j;
				int n1 = 0;
				int n2 = 0;
				int M = 0;
				for (j = 1;j < m1;j++)
				{
					if (j == 2)
					{
						n1 += 29;
					}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
						n1 += 31;
				}
					else
					{
						n1 += 30;
					}
				}
				for (j = 1;j < m2;j++)
				{
					if (j == 2)
					{
						n2 += 29;
					}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
						n2 += 31;
				}
					else
					{
						n2 += 30;
					}
				}
				if (n1 < n2)
				{
					M = n2 - n1;
					if (M % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				if (n1 > n2)
				{
					M = n1 - n2;
					if (M % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
			else
			{
				int j;
				int n1 = 0;
				int n2 = 0;
				int M = 0;
				for (j = 1;j < m1;j++)
				{
					if (j == 2)
					{
						n1 += 28;
					}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
						n1 += 31;
				}
					else
					{
						n1 += 30;
					}
				}
				for (j = 1;j < m2;j++)
				{
					if (j == 2)
					{
						n2 += 28;
					}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)

				{
						n2 += 31;
				}
					else
					{
						n2 += 30;
					}
				}
				if (n1 < n2)
				{
					M = n2 - n1;
					if (M % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				if (n1 > n2)
				{
					M = n1 - n2;
					if (M % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
		}


		return 0;
	}
}

