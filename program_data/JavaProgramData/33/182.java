package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String DNA0 = new String(new char[256]);
			String DNA1 = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				DNA0 = tempVar2.charAt(0);
			}
			for (j = 0;j < DNA0.length();j++)
			{
				if (DNA0.charAt(j) == 'A')
				{
					DNA1 = tangible.StringFunctions.changeCharacter(DNA1, j, 'T');
				}
				if (DNA0.charAt(j) == 'T')
				{
					DNA1 = tangible.StringFunctions.changeCharacter(DNA1, j, 'A');
				}
				if (DNA0.charAt(j) == 'C')
				{
					DNA1 = tangible.StringFunctions.changeCharacter(DNA1, j, 'G');
				}
				if (DNA0.charAt(j) == 'G')
				{
					DNA1 = tangible.StringFunctions.changeCharacter(DNA1, j, 'C');
				}
			}
			DNA1 = tangible.StringFunctions.changeCharacter(DNA1, DNA0.length(), '\0');
			System.out.printf("%s\n",DNA1);
		}
		return 0;
	}
}

