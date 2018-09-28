package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String dna = new String(new char[256]);
		String hubu = new String(new char[256]);
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna = tempVar2.charAt(0);
			}
			len = dna.length();
			for (int r = 0;r <= len;r++)
			{
				if (dna.charAt(r) - 'A' == 0)
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, r, 'T');
				}
				else if (dna.charAt(r) - 'T' == 0)
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, r, 'A');
				}
				else if (dna.charAt(r) - 'C' == 0)
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, r, 'G');
				}
				else if (dna.charAt(r) - 'G' == 0)
				{
					hubu = tangible.StringFunctions.changeCharacter(hubu, r, 'C');
				}
				else
				{
					hubu = hubu.substring(0, r);
				}
			}
			System.out.printf("%s\n",hubu);
		}
		return 0;
	}
}

