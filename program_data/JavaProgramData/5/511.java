package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l1;
		int l2;
		int j;
		int k = 1;
		char[][] d = new char[2][501];
		double g;
		double e;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d[1] = tempVar3.charAt(0);
		}
		l1 = String.valueOf(d[0]).length();
		l2 = String.valueOf(d[1]).length();
		if (l1 != l2)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 2;j++)
			{
				for (i = 0;i < l1;i++)
				{
					if (d[j][i] != 'A' && d[j][i] != 'T' && d[j][i] != 'C' && d[j][i] != 'G')
					{
						k = 0;
						break;
					}
					if (k == 0)
					{
						break;
					}
				}
			}
			if (k == 1)
			{
				for (i = 0;i < l1;i++)
				{
					if (d[0][i] == d[1][i])
					{
						e++;
					}
				}
			}
		}
		if (l1 == l2)
		{
			if (k == 1)
			{
				m = 1.0 * e / l1;
				if (m > g)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
			else
			{
				System.out.print("error");
			}
		}
		return 0;
	}

}

