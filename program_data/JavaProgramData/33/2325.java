package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void hanshu();
		int n;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			hanshu();
		}

		return 0;

	}


	public static void hanshu()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int z;
		int c;

		a = new Scanner(System.in).nextLine();
		c = a.length();

		for (z = 0;z <= c;z++)
		{
			if (a.charAt(z) == 'A')
			{
				b = tangible.StringFunctions.changeCharacter(b, z, 'T');
			}

			if (a.charAt(z) == 'T')
			{
				b = tangible.StringFunctions.changeCharacter(b, z, 'A');
			}

			if (a.charAt(z) == 'C')
			{
				b = tangible.StringFunctions.changeCharacter(b, z, 'G');
			}



			if (a.charAt(z) == 'G')
			{
				b = tangible.StringFunctions.changeCharacter(b, z, 'C');
			}

			if (a.charAt(z) == '\0' || a.charAt(z) == ' ' || a.charAt(z) == '\n')
			{
				b = tangible.StringFunctions.changeCharacter(b, z, '\0');
				break;
			}
		}

		System.out.println(b);

	}


}

