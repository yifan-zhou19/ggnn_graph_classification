package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		char[][] zfc = new char[1000][25];
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
			if ((zfc[i][0] >= 'a' && zfc[i][0] <= 'z') || (zfc[i][0] >= 'A' && zfc[i][0] <= 'Z') || zfc[i][0] == '_')
			{
				for (j = 1;zfc[i][j] != '\0';j++)
				{
				   if ((zfc[i][j] >= 'a' && zfc[i][j] <= 'z') || (zfc[i][j] >= 'A' && zfc[i][j] <= 'Z') || (zfc[i][j] >= '0' && zfc[i][j] <= '9' || zfc[i][j] == '_'))
				   {
				   m = 1;
				   }
				   else
				   {
					   m = 0;
					   System.out.print("no\n");
					   break;
				   }
				}
				 if (m == 1)
				 {
					   System.out.print("yes\n");
				 }
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

