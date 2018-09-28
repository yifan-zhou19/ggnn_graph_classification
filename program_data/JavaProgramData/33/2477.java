package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[256]);
		String b = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine(); //gets(a);
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				switch (a.charAt(j))
				{
					case 'A':
						a = tangible.StringFunctions.changeCharacter(a, j, 'T');
						break;
					case 'T':
						a = tangible.StringFunctions.changeCharacter(a, j, 'A');
						break;
					case 'C':
						a = tangible.StringFunctions.changeCharacter(a, j, 'G');
						break;
					case 'G':
						a = tangible.StringFunctions.changeCharacter(a, j, 'C');
						break;
				}
			}
			System.out.println(a);
			//printf("%s",a);
		}
		return 0;
	}


}

