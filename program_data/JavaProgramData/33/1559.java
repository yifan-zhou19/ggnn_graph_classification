package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int e;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[n][256];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			p = String.valueOf(zfc[i]).length();
			for (m = 0;m < p;m++)
			{
			  if (zfc[i][m] == 'A')
			  {
				  zfc[i][m] = 'T';
			  }
		 else if (zfc[i][m] == 'C')
		 {
			 zfc[i][m] = 'G';
		 }
		 else if (zfc[i][m] == 'G')
		 {
			 zfc[i][m] = 'C';
		 }
		 else if (zfc[i][m] == 'T')
		 {
			 zfc[i][m] = 'A';
		 }
			}

		 System.out.printf("%s\n",zfc[i]);
		 System.out.print("\n");
		}

	return 0;
	}




}

