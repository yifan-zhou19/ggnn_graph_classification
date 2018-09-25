package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int c;
		int[] y = new int[300];
		int[] m1 = new int[300];
		int[] m2 = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
			if (m1[i] > m2[i])
			{
				c = m1[i];
				m1[i] = m2[i];
				m2[i] = c;
			}

			for (j = m1[i];j < m2[i];j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					a = a + 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					a = a + 30;
				}
				else if (j == 2)
				{
					if ((y[i] % 4 == 0 && y[i] % 100 != 0) || y[i] % 400 == 0)
					{
						a = a + 29;
					}
					else
					{
						a = a + 28;
					}
				}
			}
			if (a % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}




		return 0;
	}



}

