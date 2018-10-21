package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	   char[][] m = new char[1000][1000];
	   char[][] t = new char[1000][1000];
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
			   m[i] = tempVar2.charAt(0);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
			for (j = 0;j != 1000;j++)
			{
				if (m[i][j] == 'A')
				{
					t[i][j] = 'T';
				}
				else if (m[i][j] == 'T')
				{
					t[i][j] = 'A';
				}
				else if (m[i][j] == 'G')
				{
					t[i][j] = 'C';
				}
				else if (m[i][j] == 'C')
				{
					t[i][j] = 'G';
				}
			}
	   }
		for (i = 0;i < n;i++)
		{
		  System.out.printf("%s\n",t[i]);
		}
		return 0;
	}

}

