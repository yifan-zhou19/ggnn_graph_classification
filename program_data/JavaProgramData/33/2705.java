package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		String dna = new String(new char[256]);
		String change = new String(new char[256]);
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
				dna = tempVar2.charAt(0);
			}
			l = dna.length();
			for (j = 0;j < l;j++)
			{
				if (dna.charAt(j) == 'A')
				{
					change = tangible.StringFunctions.changeCharacter(change, j, 'T');
				}
				else if (dna.charAt(j) == 'T')
				{
					change = tangible.StringFunctions.changeCharacter(change, j, 'A');
				}
				else if (dna.charAt(j) == 'C')
				{
					change = tangible.StringFunctions.changeCharacter(change, j, 'G');
				}
				else
				{
					change = tangible.StringFunctions.changeCharacter(change, j, 'C');
				}
			}
			change = tangible.StringFunctions.changeCharacter(change, l, '\0');
			System.out.printf("%s\n",change);
		}
		return 0;
	}
}

