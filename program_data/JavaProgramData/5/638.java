package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int h;
		int f;
		double n;
		double sum;
		double k;
		char[][] sz = new char[2][501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[1] = tempVar3.charAt(0);
		}
		sum = 0;
		f = 1;
		j = String.valueOf(sz[0]).length();
		h = String.valueOf(sz[1]).length();
		if (j != h)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if ((sz[0][i] == 'A' || sz[0][i] == 'T' || sz[0][i] == 'C' || sz[0][i] == 'G') && (sz[1][i] == 'A' || sz[1][i] == 'T' || sz[1][i] == 'C' || sz[1][i] == 'G'))
				{
					if (sz[0][i] == sz[1][i])
					{
						sum += 1.0;
					}
				}
				else
				{
					System.out.print("error\n");
					f = 0;
					break;
				}
			}
			if (f != 0)
			{
				k = sum / (j * 1.0);
				if (k >= n)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

