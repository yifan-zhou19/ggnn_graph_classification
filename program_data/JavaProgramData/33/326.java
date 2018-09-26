package <missing>;

public class GlobalMembers
{
	public static char[][] chaina = new char[1000][260];
	public static char[][] chainb = new char[1000][260];
	public static int len;
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				chaina[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(chaina[i]).length();
			for (j = 0; j < len; j++)
			{
				switch (chaina[i][j])
				{
				   case 'A':
					   chainb[i][j] = 'T';
					   break;
				   case 'T':
					   chainb[i][j] = 'A';
					   break;
				   case 'C':
					   chainb[i][j] = 'G';
					   break;
				   case 'G':
					   chainb[i][j] = 'C';
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", chainb[i]);
		}
		return 0;
	}

}

