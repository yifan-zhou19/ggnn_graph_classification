package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] d = new char[1000][260];
		char[][] r = new char[1000][260];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = tempVar2.charAt(0);
			}
		}
		int len;
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(d[i]).length();
			for (int j = 0;j < len;j++)
			{
				if (d[i][j] == 'A')
				{
					r[i][j] = 'T';
				}
				else if (d[i][j] == 'T')
				{
					r[i][j] = 'A';
				}
				else if (d[i][j] == 'C')
				{
					r[i][j] = 'G';
				}
				else if (d[i][j] == 'G')
				{
					r[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(d[i]).length();
			for (int j = 0;j < len;j++)
			{
				System.out.printf("%c",r[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

