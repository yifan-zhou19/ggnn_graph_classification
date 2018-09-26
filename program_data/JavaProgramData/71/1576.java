package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int i;
		int j;
		int[] x = new int[12];
		int s;
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
		x[1] = 31;
		x[3] = 31;
		x[4] = 30;
		x[5] = 31;
		x[6] = 30;
		x[7] = 31;
		x[8] = 31;
		x[9] = 30;
		x[10] = 31;
		x[11] = 30;
		x[12] = 31;
		for (i = 0;i < n;i++)
		{
			s = 0;
			if (y[i] % 400 == 0 || (y[i] % 4 == 0 && y[i] % 100 != 0))
			{
				x[2] = 29;
			}
			else
			{
				x[2] = 28;
			}
			if (m1[i] < m2[i])
			{
				for (j = m1[i];j < m2[i];j++)
				{
					s = s + x[j];
				}
				if (s % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				for (j = m2[i];j < m1[i];j++)
				{
					s = s + x[j];
				}
				if (s % 7 == 0)
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
}

