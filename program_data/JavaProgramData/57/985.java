package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] zfc = new char[50][33];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int z = 0;z < n;z++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[z] = tempVar2.charAt(0);
			}
			if (zfc[z][String.valueOf(zfc[z]).length() - 1] == 'g')
			{
				  zfc[z][String.valueOf(zfc[z]).length() - 3] = '\0';
			}
			else
			{
				zfc[z][String.valueOf(zfc[z]).length() - 2] = '\0';
			}
		}
		for (int x = 0;x < n;x++)
		{
			System.out.printf("%s\n",zfc[x]);
		}


	return 0;
	}

}

