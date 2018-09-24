package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int k;
		char[][] zfc = new char[50][33];
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
			l = String.valueOf(zfc[i]).length();

			if (zfc[i][l - 1] == 'r' || zfc[i][l - 1] == 'y')
			{
			   for (k = 0;k < l - 2;k++)
			   {
					System.out.printf("%c",zfc[i][k]);
					if (k == l - 3)
					{
						System.out.print("\n");
					}
			   }
			}
			 if (zfc[i][l - 1] == 'g')
			 {
				for (k = 0;k < l - 3;k++)
				{
					System.out.printf("%c",zfc[i][k]);
					if (k == l - 4)
					{
						System.out.print("\n");
					}
				}
			 }
		}
		return 0;
	}




}

