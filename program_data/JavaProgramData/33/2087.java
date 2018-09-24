package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] len = new int[n];
		char[][] sz = new char[n][300];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = tempVar2.charAt(0);
		}
		}
		int j;
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(sz[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
			   if (sz[i][j] == 'A')
			   {
				 sz[i][j] = 'T';
			   }
			   else if (sz[i][j] == 'T')
			   {
				  sz[i][j] = 'A';
			   }
			   else if (sz[i][j] == 'C')
			   {
				  sz[i][j] = 'G';
			   }
			   else if (sz[i][j] == 'G')
			   {
				  sz[i][j] = 'C';
			   }
			}
			System.out.printf("%s\n",sz[i]);
		}
		 return 0;
	}


}

