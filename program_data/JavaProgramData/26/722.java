package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j = 1;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
			{
				continue;
			}
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j++;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

