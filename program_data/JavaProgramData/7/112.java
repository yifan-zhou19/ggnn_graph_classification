package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sta = new String(new char[256]);
		String stb = new String(new char[256]);
		final String res = "";

		str = new Scanner(System.in).nextLine();
		sta = new Scanner(System.in).nextLine();
		stb = new Scanner(System.in).nextLine();

		String a = str;
		String b = null;

		if (b = tangible.StringFunctions.strStr(a,sta))
		{
			strncat(res,a,b - a);
			res += stb;
			a = b + sta.length();
		}

		res += a;

		System.out.printf("%s\n",res);

		return 0;
	}
}

