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
	char[][] zfc = new char[n][260];
	char[][] hubu = new char[n][260];
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
		int len = String.valueOf(zfc[i]).length();
		for (int k = 0;k < len;k++)
		{
			if (zfc[i][k] == 'A')
			{
				hubu[i][k] = 'T';
			}
			else if (zfc[i][k] == 'T')
			{
				hubu[i][k] = 'A';
			}
			else if (zfc[i][k] == 'C')
			{
				hubu[i][k] = 'G';
			}
			else if (zfc[i][k] == 'G')
			{
				hubu[i][k] = 'C';
			}
		}
	}
	for (int k = 0;k < n - 1;k++)
	{
		System.out.printf("%s\n",(hubu[k]));
	}
	System.out.printf("%s",(hubu[n - 1]));
	return 0;
	}

}

