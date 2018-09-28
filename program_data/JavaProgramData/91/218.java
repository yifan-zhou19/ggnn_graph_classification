package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		n = 0;
			for (i = 0;i < 100;i++)
			{
				if (a.charAt(i) != '\0' || a.charAt(i) == ' ')
				{
					n++;
				}
				if (a.charAt(i) == '\0')
				{
					break;
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			b = tangible.StringFunctions.changeCharacter(b, n - 1, a.charAt(0) + a.charAt(n - 1));
			for (i = 0;i < n;i++)
			{
			System.out.printf("%c",b.charAt(i));
			}
			return 0;
	}

}

