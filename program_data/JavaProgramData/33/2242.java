package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] dna = new char[1000][256];
		char[][] cdna = new char[1000][256];
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
				dna[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(dna[i]).length();
			for (j = 0;j < len;j++)
			{
				if (dna[i][j] == 'A')
				{
					cdna[i][j] = 'T';
				}
				if (dna[i][j] == 'G')
				{
					cdna[i][j] = 'C';
				}
				if (dna[i][j] == 'C')
				{
					cdna[i][j] = 'G';
				}
				if (dna[i][j] == 'T')
				{
					cdna[i][j] = 'A';
				}
			}
			cdna[i][j] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",cdna[i]);
		}
		return 0;
	}


}

