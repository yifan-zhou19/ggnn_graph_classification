package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int LEN;
		for (i = 0,j = 0;j < a.length();i++,j++)
		{
			while (a.charAt(j) == ' ' && a.charAt(j + 1) == ' ')
			{
			j++;
			}
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
			LEN = i;
		}
		a = tangible.StringFunctions.changeCharacter(a, LEN + 1, '\0');
		System.out.printf("%s",a);
		return 0;
	}


}

