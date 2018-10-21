package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String b = new String(new char[100]);
		b = new Scanner(System.in).nextLine();
		n = Integer.parseInt(b);
		int i;
		for (i = 0;i < n;i++)
		{
			String dna = new String(new char[255]);
			int j;
			dna = new Scanner(System.in).nextLine();
			for (j = 0;(dna.charAt(j)) != '\0';j++)
			{
			//	scanf("%c",&dna[j]);
				if (dna.charAt(j) == 'A')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, j, 'T');
				}
				else if (dna.charAt(j) == 'T')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, j, 'A');
				}
				else if (dna.charAt(j) == 'C')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, j, 'G');
				}
				else
				{
					dna = tangible.StringFunctions.changeCharacter(dna, j, 'C');
				}
			}
			for (j = 0;(dna.charAt(j)) != '\0';j++)
			{
				System.out.printf("%c",dna.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

