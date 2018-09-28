package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		char[][] zfc = new char[1000][1000];
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
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(zfc[i]).length();
			for (j = 0;j < m - 1;j++)
			{
				if (zfc[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (zfc[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (zfc[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (zfc[i][j] == 'G')
				{
					System.out.print("C");
				}
			}
			if (zfc[i][m - 1] == 'A')
			{
					System.out.print("T\n");
			}
			if (zfc[i][m - 1] == 'T')
			{
					System.out.print("A\n");
			}
			if (zfc[i][m - 1] == 'C')
			{
					System.out.print("G\n");
			}
			if (zfc[i][m - 1] == 'G')
			{
					System.out.print("C\n");
			}
			m = 0;
		}
		return 0;
	}
}

