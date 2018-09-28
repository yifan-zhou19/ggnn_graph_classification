package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		final String a = "";
		final String b = "";
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 256;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
			a = new Scanner(System.in).nextLine();
			for (i = 0;a.charAt(i) != '\0' && i < 255;i++)
			{
				if (a.charAt(i) == 'A')
				{
				b = tangible.StringFunctions.changeCharacter(b, i, 'T');
				}
				if (a.charAt(i) == 'T')
				{
				b = tangible.StringFunctions.changeCharacter(b, i, 'A');
				}
				if (a.charAt(i) == 'C')
				{
				b = tangible.StringFunctions.changeCharacter(b, i, 'G');
				}
				if (a.charAt(i) == 'G')
				{
				b = tangible.StringFunctions.changeCharacter(b, i, 'C');
				}
			}
			System.out.println(b);
		}
		return 0;
	}

}

