package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i <= a.length();i++)
		{
			if (a.charAt(i) != ' ' || a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < b.length();i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

