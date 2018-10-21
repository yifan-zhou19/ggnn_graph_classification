package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l = 0;
		int e;
		int f;
		double n;
		double m;
		double k = 0;
		char[][] num = new char[2][LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
			for (i = 0;i < 2;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i] = tempVar2.charAt(0);
				}
			}
	e = String.valueOf(num[0]).length();
	f = String.valueOf(num[1]).length();
			for (i = 0;i < 2;i++)
			{
			m = String.valueOf(num[i]).length();
			for (j = 0;j < m;j++)
			{
				if (((num[i][j] != 'A') && (num[i][j] != 'C') && (num[i][j] != 'G') && (num[i][j] != 'T')) || (e != f))
				{
				System.out.print("error\n");
				l++;
				break;
				}
			}
			if (l > 0)
			{
			break;
			}
			}
			for (j = 0;j < m;j++)
			{
				if (l == 0)
				{
					if (num[0][j] == num[1][j])
					{
			k++;
					}
				}
			}
			if ((l == 0) && (k / m) > n)
			{
			System.out.print("yes\n");
			}
			else if ((l == 0) && (k / m) <= n)
			{
			System.out.print("no\n");
			}
	return 0;
	}
}

