package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		if (l == 1)
		{
			System.out.printf("%c\n",(int)a.charAt(0));
		}
		else
		{
		for (i = 0;i < l - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (int)a.charAt(i) + (int)a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, l - 1, (int)a.charAt(0) + (int)a.charAt(l - 1));
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		}
		return 0;
	}


}

