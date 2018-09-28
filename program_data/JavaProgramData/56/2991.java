package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, l - 1 - i, a.charAt(i));
		}
		b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		System.out.println(b);
	}
}

