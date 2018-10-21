package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] lian = new char[1000][260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				lian[i] = tempVar2.charAt(0);
			}
			int m = 0;
			while (lian[i][m] != '\0')
			{
				if (lian[i][m] == 'A')
				{
					lian[i][m] = 'T';
				}
				else if (lian[i][m] == 'T')
				{
					lian[i][m] = 'A';
				}
				else if (lian[i][m] == 'G')
				{
					lian[i][m] = 'C';
				}
				else if (lian[i][m] == 'C')
				{
					lian[i][m] = 'G';
				}
				m++;
			}
			System.out.printf("%s\n", lian[i]);
		}
		return 0;
	}
}

