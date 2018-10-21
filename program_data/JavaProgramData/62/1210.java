package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int t;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
			{
				t = i;
				for (j = t;a.charAt(j - 1) != '\0';j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j));
				}
				i = i - 1;
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

