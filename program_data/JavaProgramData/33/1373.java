package <missing>;

public class GlobalMembers
{
	public static char[][] mb = new char[30000][300];
	public static char[][] fy = new char[30000][300];
	public static int Main()
	{

		int i = 0;
		int j = 0;
		int n;
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
				mb[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(mb[i]).length();j++)
			{
				if (mb[i][j] == 'A')
				{
					fy[i][j] = 'T';
				}
				else if (mb[i][j] == 'T')
				{
					fy[i][j] = 'A';
				}
				else if (mb[i][j] == 'C')
				{
					fy[i][j] = 'G';
				}
				else
				{
					fy[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(mb[i]).length();j++)
			{
				System.out.printf("%c",fy[i][j]);
			}
			System.out.print("\n");
		}
	 return 0;
	}

}

