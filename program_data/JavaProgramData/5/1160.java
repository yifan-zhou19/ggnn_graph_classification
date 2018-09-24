package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int f = 1;
		char[][] a = new char[2][255];
		double x;
		double k;
		double t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		k = String.valueOf(a[0]).length();
		for (j = 0;j < k;j++)
		{
				if ((a[0][j] != 'A' && a[0][j] != 'C' && a[0][j] != 'T' && a[0][j] != 'G') || (a[1][j] != 'A' && a[1][j] != 'T' && a[1][j] != 'C' && a[1][j] != 'G'))
				{
					System.out.print("error");
					f = 0;
					break;
				}
				if (a[0][j] == a[1][j])
				{
					t++;
				}
		}
		if (f == 1)
		{
			if (t / k > x)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}

		return 0;
	}
}

