package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] zfc = new char[1000][1000];
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
	for (j = 0;j < String.valueOf(zfc[i]).length();j++)
	{
				if (zfc[i][j] == 'A')
				{
					System.out.print("T");
				}
				else if (zfc[i][j] == 'T')
				{
					System.out.print("A");
				}
				else if (zfc[i][j] == 'G')
				{
					System.out.print("C");
				}
				else if (zfc[i][j] == 'C')
				{
					System.out.print("G");
				}

	}
	System.out.print("\n");

	}
		return 0;
	}



}

