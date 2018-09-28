package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sr = new char[n][256];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sr[i] = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			int m = String.valueOf(sr[i]).length();
			for (int j = 0;j < m;j++)
			{
				if (sr[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (sr[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (sr[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (sr[i][j] == 'G')
				{
					System.out.print("C");
				}
				if (j == m - 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

