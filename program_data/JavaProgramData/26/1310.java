package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		String x = new String(new char[200]);
		String y = new String(new char[200]);
		x = new Scanner(System.in).nextLine();
		a = x.length();
		if (a != 1)
		{
			y = tangible.StringFunctions.changeCharacter(y, 0, x.charAt(0));
			j = 1;
			for (i = 1;i < a - 1;i++)
			{
				while (true)
				{
					if (x.charAt(i) != ' ' || (x.charAt(i) == ' ' && x.charAt(i - 1) != ' '))
					{
						y = tangible.StringFunctions.changeCharacter(y, j, x.charAt(i));
						j++;
						break;
					}
					else
					{
						break;
					}
				}
			}
			y = tangible.StringFunctions.changeCharacter(y, j, x.charAt(a - 1));
			y = tangible.StringFunctions.changeCharacter(y, j + 1, '\0');
		}
		if (a == 1)
		{
			y = tangible.StringFunctions.changeCharacter(y, 0, x.charAt(0));
			y = tangible.StringFunctions.changeCharacter(y, 1, '\0');
		}
		System.out.println(y);
		return 0;
	}


}

