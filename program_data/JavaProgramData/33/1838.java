package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String a = new String(new char[260]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			for (i = 0;a.charAt(i) != 0;i++)
			{
				switch (a.charAt(i))
				{
				case 'A':
					a = tangible.StringFunctions.changeCharacter(a, i, 'T');
					break;
				case 'T':
					a = tangible.StringFunctions.changeCharacter(a, i, 'A');
					break;
				case 'C':
					a = tangible.StringFunctions.changeCharacter(a, i, 'G');
					break;
				case 'G':
					a = tangible.StringFunctions.changeCharacter(a, i, 'C');
					break;
				}
			}
			System.out.print(a);
			System.out.print("\n");
			n--;
		}
		return 0;
	}


}

