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
			temp = (a.Substring(i)) + *(a.Substring(i) + 1);
			*(b.Substring(i)) = temp;
		}
		temp = (a.Substring(0)) + a.charAt(a.length() - 1);
		b = tangible.StringFunctions.changeCharacter(b, a.length() - 1, temp);
		for (i = 0;i < a.length();i++)
		{
			System.out.print((b.Substring(i)));
		}
		return 0;
	}
}

