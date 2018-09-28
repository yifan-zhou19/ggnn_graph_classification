package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String t = new String(new char[256]);
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
				t = tempVar2.charAt(0);
			}
			for (j = 0;t.charAt(j) != '\0';j++)
			{
				if (t.charAt(j) == 'A')
				{
					t = tangible.StringFunctions.changeCharacter(t, j, 'T');
				}
				else if (t.charAt(j) == 'T')
				{
					t = tangible.StringFunctions.changeCharacter(t, j, 'A');
				}
				else if (t.charAt(j) == 'C')
				{
					t = tangible.StringFunctions.changeCharacter(t, j, 'G');
				}
				else if (t.charAt(j) == 'G')
				{
					t = tangible.StringFunctions.changeCharacter(t, j, 'C');
				}
			}
			System.out.println(t);
		}
		return 0;
	}
}

