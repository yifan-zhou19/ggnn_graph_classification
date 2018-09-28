package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		a = new Scanner(System.in).nextLine();
		int i;
		int temp;
		for (i = 0;i < a.length() - 1;i++)
		{
			temp = a.charAt(i) + a.charAt(i + 1);
			b = tangible.StringFunctions.changeCharacter(b, i, temp);
		}
		temp = a.charAt(0) + a.charAt(a.length() - 1);
		b = tangible.StringFunctions.changeCharacter(b, a.length() - 1, temp);
		for (i = 0;i < a.length();i++)
		{
			System.out.print(b.charAt(i));
		}
		return 0;
	}
}

