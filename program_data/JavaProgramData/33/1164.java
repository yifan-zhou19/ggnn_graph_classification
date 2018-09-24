package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	char[][] jj = new char[1000][260];
	char[][] pdj = new char[1000][260];
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
			jj[i] = tempVar2.charAt(0);
		}
	}
	for (i = 0; i < n; i++)
	{
		int m = String.valueOf(jj[i]).length();
		for (k = 0;k < m;k++)
		{
			if (jj[i][k] == 'A')
			{
				pdj[i][k] = 'T';
			}
		else if (jj[i][k] == 'T')
		{
			pdj[i][k] = 'A';
		}
			else if (jj[i][k] == 'G')
			{
				pdj[i][k] = 'C';
			}
			else if (jj[i][k] == 'C')
			{
				pdj[i][k] = 'G';
			}
		}
	}
			for (i = 0; i < n; i++)
			{
				System.out.printf("%s\n",pdj[i]);
			}
	return 0;
	}

}

