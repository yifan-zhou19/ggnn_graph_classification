package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char qpstr = char a[];
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		qpstr(str);
		return 0;
	}
	public static char qpstr(String a)
	{
		 int i;
		 int j;
		 int k;
		 int len;
		 String b = new String(new char[101]);
		 for (i = 0;i < a.length() - 1;i++)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, i, a[i] + a[i + 1]);
		 }
		 b = tangible.StringFunctions.changeCharacter(b, a.length() - 1, a[a.length() - 1] + a[0]);
		 b = tangible.StringFunctions.changeCharacter(b, a.length(), '\0');
		 System.out.println(b);
	}
}

