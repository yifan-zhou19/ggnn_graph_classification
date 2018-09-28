package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		String st = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st = tempVar2.charAt(0);
			}
			for (i = 0;i < 256;i++)
			{
				if (st.charAt(i) == 'A')
				{
					st = tangible.StringFunctions.changeCharacter(st, i, 'T');
				}
				else if (st.charAt(i) == 'T')
				{
					st = tangible.StringFunctions.changeCharacter(st, i, 'A');
				}
				else if (st.charAt(i) == 'C')
				{
					st = tangible.StringFunctions.changeCharacter(st, i, 'G');
				}
				else if (st.charAt(i) == 'G')
				{
					st = tangible.StringFunctions.changeCharacter(st, i, 'C');
				}
				if (st.charAt(i) == '\0')
				{
					break;
				}
			}
			System.out.printf("%s",st);
			System.out.print("\n");
		}
		return 0;
	}

}

