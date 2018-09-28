package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int d;
		int[] d1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] d2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			d = 0;
			if ((y[i] % 4 == 0 && y[i] % 100 != 0) || (y[i] % 100 == 0 && y[i] % 400 == 0))
			{
				if (m1[i] < m2[i])
				{
					for (j = m1[i];j < m2[i];j++)
					{
						d += d1[j];
					}
				}
				else
				{
					for (j = m2[i];j < m1[i];j++)
					{
						d += d1[j];
					}
				}
			}
			else
			{
				if (m1[i] < m2[i])
				{
					for (j = m1[i];j < m2[i];j++)
					{
						d += d2[j];
					}
				}
				else
				{
					for (j = m2[i];j < m1[i];j++)
					{
						d += d2[j];
					}
				}
			}
			if (d % 7 == 0)
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

