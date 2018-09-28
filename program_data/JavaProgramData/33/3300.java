package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] sz = new char[n][300];
	char[][] zfc = new char[n][300];

	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[k] = tempVar2.charAt(0);
	}
	for (i = 0;sz[k][i] != '\0';i++)
	{
	if (sz[k][i] == 'A')
	{
		zfc[k][i] = 'T';
	}
	else if (sz[k][i] == 'T')
	{
		zfc[k][i] = 'A';
	}
	else if (sz[k][i] == 'G')
	{
		zfc[k][i] = 'C';
	}
	else
	{
		zfc[k][i] = 'G';
	}
	}
	System.out.printf("%s\n",zfc[k]);
	}
	return 0;
	}


}

