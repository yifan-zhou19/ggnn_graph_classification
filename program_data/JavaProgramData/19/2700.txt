package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int begin;
		int end;
		String now = new String(new char[101]);
		String sen = new String(new char[1000]);
		String old = new String(new char[101]);
		String newone = new String(new char[101]);

		sen = new Scanner(System.in).nextLine();
		old = new Scanner(System.in).nextLine();
		newone = new Scanner(System.in).nextLine();
		while (sen.charAt(i) != '\0')
		{
			now = tangible.StringFunctions.changeCharacter(now, j, sen.charAt(i));
			if (j == 0)
			{
				begin = i;
			}
			if (now.charAt(j) == ' ' || sen.charAt(i + 1) == '\0')
			{

				end = i;
				if (sen.charAt(i + 1) == '\0')
				{
					now = tangible.StringFunctions.changeCharacter(now, j + 1, '\0');
				}
				else
				{
					now = tangible.StringFunctions.changeCharacter(now, j, '\0');
				}
				if (strcmp(now, old) == 0)
				{
					if (sen.charAt(i + 1) == '\0')
					{
						System.out.printf("%s", newone);
					}
					else
					{
						System.out.printf("%s ", newone);
					}

				}
				else
				{
					if (sen.charAt(i + 1) == '\0')
					{
						System.out.printf("%s", now);
					}
					else
					{
						System.out.printf("%s ", now);
					}
				}
				j = -1;
			}
			i++;
			j++;
		}
		System.out.print("\n");
		return 0;
	}
}

