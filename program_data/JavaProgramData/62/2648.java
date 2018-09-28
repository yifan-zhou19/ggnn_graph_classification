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
			int k = 0;

				a = new Scanner(System.in).nextLine();

				for (i = 0;a.charAt(i) != '\0';i++)
				{
					if ((a.charAt(i) != ' ') || ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' ')))
					{
						b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));

						k++;
					}


					if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
					{
						b = tangible.StringFunctions.changeCharacter(b, k, ' ');
						k++;
						x = i;
						for (y = x + 1;a.charAt(y) == ' ';y++)
						{
							i++;
						}

					}
				}
				b = tangible.StringFunctions.changeCharacter(b, k, '\0');

				System.out.println(b);


			return 0;
		}
}

