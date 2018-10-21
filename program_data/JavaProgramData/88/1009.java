package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		String b = new String(new char[31]);
		int j = 0;
		int n;
		int x;
		a = new Scanner(System.in).nextLine();
		j = 0;
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else
			{
				if (j == 0)
				{
					continue;
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				System.out.printf("%s\n",b);
				j = 0;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s\n",b);
		return 0;
	}

}

