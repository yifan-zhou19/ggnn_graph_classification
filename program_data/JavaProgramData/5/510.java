package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int g = 0;
		int j;
		int e;
		int k;
		int flag = 1;
		double n;
		double m;
		char[][] s = new char[2][502];
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
				s[i] = tempVar2.charAt(0);
			}
		}
		e = String.valueOf(s[1]).length();
		k = String.valueOf(s[0]).length();
		if (e != k)
		{
			flag = 0;
		}
		if (flag == 1)
		{
			for (i = 0;i < 2;i++)
			{
				for (j = 0;s[i][j];j++)
				{
					if ((s[i][j] != 'A') && (s[i][j] != 'G') && (s[i][j] != 'C') && (s[i][j] != 'T'))
					{
						flag = 0;
					}
				}
			}
		}
		for (j = 0;s[0][j];j++)
		{
			if (s[0][j] == s[1][j])
			{
				g++;
			}
		}
		m = 1.0 * g / e;
		if (flag == 1)
		{
			if (m > n)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}

}

