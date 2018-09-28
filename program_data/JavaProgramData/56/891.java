package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		char t;
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		for (n = 0;a.charAt(n) != '\0';n = n + 1)
		{
			;
		}
		for (i = 0;i < n / 2;i = i + 1)
		{
			t = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(n - i - 1));
			a = tangible.StringFunctions.changeCharacter(a, n - i - 1, t);
		}
		for (i = 0;i < n;i = i + 1)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}

