package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] DNA = new char[N1][N2];
		int n;
		int i;
		int k;
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
			   DNA[i] = tempVar2.charAt(0);
		   }
		   for (k = 0;DNA[i][k] != 0;k++)
		   {
		   if (DNA[i][k] == 'A')
		   {
			  DNA[i][k] = 'T';
		   }
			  else if (DNA[i][k] == 'T')
			  {
				  DNA[i][k] = 'A';
			  }
				else if (DNA[i][k] == 'G')
				{
					DNA[i][k] = 'C';
				}
				  else
				  {
					  DNA[i][k] = 'G';
				  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",DNA[i]);
		}
		return 0;
	}
}

