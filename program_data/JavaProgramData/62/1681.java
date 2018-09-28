package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[200]);
		String c = new String(new char[200]);
		int i;
		int j = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122))
			{
				j++;
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
			}
			else if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) != ' ')
				{
					j++;
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
				}
			}
			else
			{
				j++;
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
			}
		}
		for (i = 1;i <= j;i++)
		{
		System.out.printf("%c",c.charAt(i));
		}
	}


}

