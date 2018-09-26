package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[max + 1]);
		String q = new String(new char[max + 1]);
		int i;
		int j;
		int n;
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
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j);j++)
			{

				if (s.charAt(j) == 'A')
				{
					q = tangible.StringFunctions.changeCharacter(q, j, 'T');
				}
				if (s.charAt(j) == 'T')
				{
					q = tangible.StringFunctions.changeCharacter(q, j, 'A');
				}
				if (s.charAt(j) == 'G')
				{
					q = tangible.StringFunctions.changeCharacter(q, j, 'C');
				}
				if (s.charAt(j) == 'C')
				{

					q = tangible.StringFunctions.changeCharacter(q, j, 'G');
				}

			}
			q = tangible.StringFunctions.changeCharacter(q, j, '\0');
			System.out.printf("%s\n",q);

		}


		return 0;
	}


}

