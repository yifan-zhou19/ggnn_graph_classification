package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int k;
	char[][] zfc = new char[50][35];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 50;i++)
	{
		for (k = 0;k < 35;k++)
		{
		zfc[i][k] = '\0';
		}
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
		for (k = 0;k < 32;k++)
		{
			if (zfc[i][k] == 'e' && zfc[i][k + 1] == 'r' && zfc[i][k + 2] == '\0')
			{
			zfc[i][k] = '\0';
			}
			else if (zfc[i][k] == 'l' && zfc[i][k + 1] == 'y' && zfc[i][k + 2] == '\0')
			{
			zfc[i][k] = '\0';
			}
			else if (zfc[i][k] == 'i' && zfc[i][k + 1] == 'n' && zfc[i][k + 2] == 'g' && zfc[i][k + 3] == '\0')
			{
			zfc[i][k] = '\0';
			}
		}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",zfc[i]);
	}
	return 0;
	}

}

