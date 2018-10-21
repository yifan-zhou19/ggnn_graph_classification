package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[1000][256];
		for (int a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[a] = tempVar2.charAt(0);
			}
		}
		for (int b = 0;b < n;b++)
		{
			len = String.valueOf(zfc[b]).length();
			for (int c = 0;c < len;c++)
			{
				if (zfc[b][c] == 'A')
				{
					zfc[b][c] = 'T';
				}
				else
				{
				if (zfc[b][c] == 'T')
				{
				zfc[b][c] = 'A';
				}
			else
			{
				if (zfc[b][c] == 'C')
				{
				zfc[b][c] = 'G';
				}
			else
			{
				if (zfc[b][c] == 'G')
				{
				zfc[b][c] = 'C';
				}
			}
			}
				}
			}
		}
	   for (int a = 0;a < n - 1;a++)
	   {
			System.out.printf("%s\n",zfc[a]);
	   }
		 System.out.printf("%s",zfc[n - 1]);
		return 0;
	}



}

