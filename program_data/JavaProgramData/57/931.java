package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] zfc = new char[100][33];
	int i;
	int j;
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
		j = String.valueOf(zfc[i]).length();
		if (zfc[i][j - 1] == 'r' || zfc[i][j - 1] == 'y')
		{
		zfc[i][j - 2] = '\0';
		}
		else
		{
			zfc[i][j - 3] = '\0';
		}
	}


	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",zfc[i]);
	}




	return 0;
	}

}

