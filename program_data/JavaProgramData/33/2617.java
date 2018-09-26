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
		char[][] zfc = new char[1000][1000];
		int i;
		int j;
		int len;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			len = (strlen)(zfc[i]);
			for (j = 0;j < len;j++)
			{
				if (zfc[i][j] == 65)
				{
					zfc[i][j] = 84;
					continue;
				}
				if (zfc[i][j] == 84)
				{
					zfc[i][j] = 65;
					continue;
				}
				if (zfc[i][j] == 67)
				{
					zfc[i][j] = 71;
					continue;
				}
				if (zfc[i][j] == 71)
				{
					zfc[i][j] = 67;
					continue;
				}


			}
			System.out.printf("%s\n",zfc[i]);
		}


		return 0;
	}


}

