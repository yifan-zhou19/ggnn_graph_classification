package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String base = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				base = tempVar2.charAt(0);
			}
			for (i = 0;base.charAt(i) != '\0';i++)
			{
				if (base.charAt(i) == 'A')
				{
					base = tangible.StringFunctions.changeCharacter(base, i, 'T');
				}
				else if (base.charAt(i) == 'T')
				{
					base = tangible.StringFunctions.changeCharacter(base, i, 'A');
				}
				else if (base.charAt(i) == 'C')
				{
					base = tangible.StringFunctions.changeCharacter(base, i, 'G');
				}
				else if (base.charAt(i) == 'G')
				{
					base = tangible.StringFunctions.changeCharacter(base, i, 'C');
				}
			}
			n--;
			System.out.printf("%s\n",base);
		}
		return 0;
	}
}

