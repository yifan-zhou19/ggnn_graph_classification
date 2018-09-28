package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 char[][] dna = new char[n][256];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (m = 0;dna[i][m] != '\0';m++)
			{
				if (dna[i][m] == 'A')
				{
				   dna[i][m] = 'T';
				   continue;
				}
				if (dna[i][m] == 'G')
				{
				   dna[i][m] = 'C';
				   continue;
				}
				if (dna[i][m] == 'C')
				{
				   dna[i][m] = 'G';
				   continue;
				}
				if (dna[i][m] == 'T')
				{
				   dna[i][m] = 'A';
				   continue;
				}
			}
		}
		 for (i = 0;i < n;i++)
		 {
			System.out.printf("%s\n",dna[i]);
		 }
	   return 0;
	}


}

