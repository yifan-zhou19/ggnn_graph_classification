package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[101]);
		String t = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		for (i = 0;a.charAt(i) != '\0';i++,j++)
		{
			if (a.charAt(i) != ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, a.charAt(i));
			}
			if (a.charAt(i) == ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, '\0');
				if (strcmp(t,b) == 0)
				{
					t = c;
					System.out.printf("%s ",t);
				}
				else
				{
					System.out.printf("%s ",t);
				}
				j = -1;
			}
		}
		t = tangible.StringFunctions.changeCharacter(t, j, '\0');
		if (strcmp(t,b) == 0)
		{
			t = c;
			System.out.printf("%s",t);
		}
		else
		{
			System.out.printf("%s",t);
		}
	}


}

