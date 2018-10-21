package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] zfc = new char[9999][256];
	char[][] jg = new char[9999][256];
	int n;
	int l;
	int i;
	int j;
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
	l = String.valueOf(zfc[i]).length();
	for (j = 0;j < l;j++)
	{
				if (zfc[i][j] == 'A')
				{
					jg[i][j] = 'T';
				}
				else if (zfc[i][j] == 'T')
				{
					jg[i][j] = 'A';
				}
				else if (zfc[i][j] == 'G')
				{
					jg[i][j] = 'C';
				}
				else
				{
					jg[i][j] = 'G';
				}
						  jg[i][l] = '\0';
	}
	}
	for (i = 0;i < n;i++)
	{
	   System.out.printf("%s\n",jg[i]);
	}

	return 0;
	}

}

