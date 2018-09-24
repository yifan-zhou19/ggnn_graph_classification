package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			String a = new String(new char[3000]);
			String b = new String(new char[30000]);
			int i;
			int x = 0;
			int y;
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (y = 0;y <= n;y++)
			{
				a = new Scanner(System.in).nextLine();

				for (i = 0;a.charAt(i) != '\0';i++)
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
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
				System.out.println(b);
			}
			return 0;
		}
}

