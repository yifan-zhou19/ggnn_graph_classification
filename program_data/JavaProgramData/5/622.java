package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		char[][] s = new char[2][510];
		int i;
		int j;
		int k;
		k = 0;
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		if (String.valueOf(s[0]).length() != String.valueOf(s[1]).length())
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (j = 0;s[0][j] != '\0';j++)
			{
				if (s[0][j] == s[1][j])
				{
					k++;
				}
				if ((s[0][j] != 'A' && s[0][j] != 'T' && s[0][j] != 'C' && s[0][j] != 'G') || (s[1][j] != 'A' && s[1][j] != 'T' && s[1][j] != 'C' && s[1][j] != 'G'))
				{
					System.out.print("error");
					return 0;
				}
			}
		}
		int q;
		q = String.valueOf(s[0]).length();
		double w;
		w = 1.0 * k / q;
		if (w >= n)
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

