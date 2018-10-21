package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String dna = new String(new char[1000]);
		String hubu = new String(new char[1000]);
		int n;
		int length;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna = tempVar2.charAt(0);
			}
			length = dna.length();
			for (int j = 0;j < length;j++)
			{
				if (dna.charAt(j) == 'A')
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, j, 'T');
				}
				else if (dna.charAt(j) == 'T')
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, j, 'A');
				}
				else if (dna.charAt(j) == 'G')
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, j, 'C');
				}
				else if (dna.charAt(j) == 'C')
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, j, 'G');
				}

			System.out.printf("%c",hubu.charAt(j));
			}
			System.out.print("\n");
		}

	}



}

