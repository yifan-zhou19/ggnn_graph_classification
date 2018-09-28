package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String DNA = new String(new char[256]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				DNA = tempVar2.charAt(0);
			}
			len = DNA.length();
			for (j = 0;j < len;j++)
			{
				if (DNA.charAt(j) == 'A')
				{
					DNA = tangible.StringFunctions.changeCharacter(DNA, j, 'T');
				}
				else if (DNA.charAt(j) == 'T')
				{
					DNA = tangible.StringFunctions.changeCharacter(DNA, j, 'A');
				}
				else if (DNA.charAt(j) == 'C')
				{
					DNA = tangible.StringFunctions.changeCharacter(DNA, j, 'G');
				}
				else if (DNA.charAt(j) == 'G')
				{
					DNA = tangible.StringFunctions.changeCharacter(DNA, j, 'C');
				}
			}
			System.out.printf("%s\n",DNA);
		}
	}

}

