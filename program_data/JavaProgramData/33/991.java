package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		String a = new String(new char[2000]);
		for (i = 0;i <= n;i++)
		{
		   a = new Scanner(System.in).nextLine();
	int j;
		   for (j = 0;j < a.length();j++)
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
			int k;
			for (k = 0;k < a.length();k++)
			{
				System.out.printf("%c",a.charAt(k));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

