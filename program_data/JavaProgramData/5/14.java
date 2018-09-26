package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[2][501];
		double n;
		double sum = 0;
		double x;
		double Len;
		int len;
		int i;
		int len2;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[1] = tempVar3.charAt(0);
		}
		len = String.valueOf(s[0]).length();
		len2 = String.valueOf(s[1]).length();
		if (len != len2)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < 2;i++)
			{
				for (j = 0;j < len;j++)
				{
					if (s[i][j] != 'A' && s[i][j] != 'T' && s[i][j] != 'G' && s[i][j] != 'C')
					{
						System.out.print("error");
						return 0;
					}
					else
					{
						continue;
					}
				}
			}
		}


		for (i = 0;i < len;i++)
		{
			if (s[0][i] == s[1][i])
			{
				sum = sum + 1;
			}
		}
		Len = (double)len;
		x = sum / Len;
		if (x >= n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

