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
		String s = new String(new char[255]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}

		for (j = 0;s.charAt(j);j++)
		{
			 if (s.charAt(j) == 'A')
			 {
			s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'A'+'T');
			 }
			 else if (s.charAt(j) == 'T')
			 {
				 s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'T'+'A');
			 }
			 else if (s.charAt(j) == 'C')
			 {
				 s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'C'+'G');
			 }
			 else if (s.charAt(j) == 'G')
			 {
					  s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'G'+'C');
			 }
		}

			 System.out.printf("%s\n", s);

		}
		return 0;

	}
}

