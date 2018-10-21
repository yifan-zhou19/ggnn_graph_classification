package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_c = new String(new char[501]);
String c1 = new String(new char[501]);
String c2 = new String(new char[501]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char c[501],c1[501],c2[501];
		int n;
		int i;
		int j;
		int p;
		int q;
		int k;
		int s;
		Main_c = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
		if (Main_c.charAt(i) == 0)
		{
			n = i;
			break;
		}
		}
		for (i = 2;i <= n;i++)
		{
		for (j = 0;j <= n - i;j++)
		{
			for (p = 0;p < i;p++)
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, p, Main_c.charAt(j + p));
				c2 = tangible.StringFunctions.changeCharacter(c2, p, Main_c.charAt(j + i - p - 1));
			}
			for (;p < 501;p++)
			{
				c1 = c1.substring(0, p);
				c2 = c2.substring(0, p);
			}
			s = 0;
			for (k = 0;s == 0 && k < 501;k++)
			{
			s = c1.charAt(k) - c2.charAt(k);
			}
			if (s == 0)
			{
			System.out.printf("%s\n",c1);
			}
		}
		}
	}
}

