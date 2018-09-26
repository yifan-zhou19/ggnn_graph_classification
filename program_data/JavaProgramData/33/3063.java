package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] z = new char[10000][255];
	   for (i = 0;i < n;i++)
	   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   z[i] = tempVar2.charAt(0);
			   }
		  for (m = 0;m < 255;m++)
		  {
			 if (z[i][m] == 'A')
			 {
				 z[i][m] = 'T';
				 continue;
			 }
		  if (z[i][m] == 'T')
		  {
			  z[i][m] = 'A';
			  continue;
		  }
		  if (z[i][m] == 'G')
		  {
			  z[i][m] = 'C';
			  continue;
		  }
		  if (z[i][m] == 'C')
		  {
			  z[i][m] = 'G';
			  continue;
		  }
		  }
		System.out.printf("%s\n",z[i]);
	   }
	return 0;
	}
}

