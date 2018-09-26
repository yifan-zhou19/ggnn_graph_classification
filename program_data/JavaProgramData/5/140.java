package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m = 0;
		double sum = 0;
		double n;
		char[][] gene = new char[3][501];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			gene[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			gene[1] = tempVar3.charAt(0);
		}
		if (String.valueOf(gene[0]).length() != String.valueOf(gene[1]).length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0; i < 2; i++)
			{
				for (j = 0; gene[i][j] != '\0'; j++)
				{
					if (gene[i][j] != 'A' && gene[i][j] != 'T' && gene[i][j] != 'C' && gene[i][j] != 'G')
					{
						System.out.print("error");
						m = 1;
						break;
					}
				}
			}
			for (i = 0; gene[0][i] != '\0'; i++)
			{
				if (gene[0][i] == gene[1][i])
				{
					sum++;
				}
			}
			if (sum / String.valueOf(gene[0]).length() > n && m == 0)
			{
				System.out.print("yes");
			}
			else if (sum / String.valueOf(gene[0]).length() <= n != 0 && m == 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

