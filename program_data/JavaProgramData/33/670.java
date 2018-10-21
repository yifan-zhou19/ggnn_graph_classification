package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] dna1 = new char[1000][256];
		char[][] dna2 = new char[1000][256];
		int k;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			dna1[k] = new Scanner(System.in).nextLine();
			for (i = 0;dna1[k][i] != '\0';i++)
			{
				if (dna1[k][i] == 'A')
				{
					dna2[k][i] = 'T';
				}
				if (dna1[k][i] == 'T')
				{
					dna2[k][i] = 'A';
				}
				if (dna1[k][i] == 'G')
				{
					dna2[k][i] = 'C';
				}
				if (dna1[k][i] == 'C')
				{
					dna2[k][i] = 'G';
				}
			}
			dna2[k][i] = '\0';
		}

		for (k = 0;k < n;k++)
		{
				System.out.println(dna2[k]);
		}
		return 0;
	}

}

