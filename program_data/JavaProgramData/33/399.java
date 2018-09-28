package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int t;
		int k;
		String dna = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna = tempVar2.charAt(0);
			}
			t = dna.length();
			for (k = 0;k < t;k++)
			{
				if (dna.charAt(k) == 'A')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, k, 'T');
				}
				else if (dna.charAt(k) == 'T')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, k, 'A');
				}
				else if (dna.charAt(k) == 'C')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, k, 'G');
				}
				else if (dna.charAt(k) == 'G')
				{
					dna = tangible.StringFunctions.changeCharacter(dna, k, 'C');
				}
			}
			for (k = 0;k < t;k++)
			{
				if (k == t - 1)
				{
					System.out.printf("%c\n",dna.charAt(k));
				}
				else
				{
					System.out.printf("%c",dna.charAt(k));
				}
			}
		}
		return 0;
	}

}

