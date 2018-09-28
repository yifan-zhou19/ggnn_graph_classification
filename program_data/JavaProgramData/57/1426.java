package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		char[][] zfc = new char[100][40];
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
			m = String.valueOf(zfc[i]).length();
			for (j = 0;zfc[i][j] != '\0';j++)
			{
				if (zfc[i][j] == 'r' && zfc[i][j + 1] == '\0')
				{
					zfc[i][j - 1] = '\0';
					System.out.printf("%s\n",zfc[i]);
					break;
				}
				else if (zfc[i][j] == 'y' && zfc[i][j + 1] == '\0')
				{
					zfc[i][j - 1] = '\0';
					System.out.printf("%s\n",zfc[i]);
					break;
				}
				else if (zfc[i][j] == 'g' && zfc[i][j + 1] == '\0')
				{
					zfc[i][j - 2] = '\0';
					System.out.printf("%s\n",zfc[i]);
					break;
				}
			}
		}
		return 0;
	}

}

