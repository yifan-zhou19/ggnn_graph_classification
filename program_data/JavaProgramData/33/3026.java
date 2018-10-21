package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int t;
	char[][] a = new char[1000][260];
	char[][] b = new char[1000][260];
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
		a[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
		for (t = 0;a[i][t] != '\0';t++)
		{
		if (a[i][t] == 'A')
		{
			b[i][t] = 'T';
		}
		else if (a[i][t] == 'T')
		{
			b[i][t] = 'A';
		}
		else if (a[i][t] == 'G')
		{
			b[i][t] = 'C';
		}
		else if (a[i][t] == 'C')
		{
			b[i][t] = 'G';
		}
		}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",b[i]);
	}
	return 0;

	}
}

