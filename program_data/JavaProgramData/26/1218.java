package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int n;
		int p = 1;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				k++;
				p = 1;
			}
			else if (p != 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, ' ');
				k++;
				p = 0;
			}
		}
		b = b.substring(0, k);
		System.out.printf("%s",b);
		return 0;
	}
}

