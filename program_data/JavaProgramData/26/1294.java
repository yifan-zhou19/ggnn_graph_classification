package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			while (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (k = i;a.charAt(k) != '\0';k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
				}
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}



}

