package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_n = new String(new char[100]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char n[100];
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Main_n = tempVar.charAt(0);
		}
		int len = Main_n.length();
		int a = Main_n.charAt(0) - '0';
		int i;
		int b;
		int c;
		if (len == 1)
		{
		System.out.print("0\n");
		System.out.printf("%c\n",Main_n.charAt(0));
		}
		else
		{
		if (len == 2 && (Main_n.charAt(0) - '0') == 1 && (Main_n.charAt(1) - '0') < 3)
		{
		System.out.print("0\n");
		System.out.printf("%c",Main_n.charAt(0));
		System.out.printf("%c",Main_n.charAt(1));
		}
		else
		{
		for (i = 0;i < len - 1;i++)
		{
		b = Main_n.charAt(i + 1) - '0';
		c = a * 10 + b;
		d = c / 13;
		if (i == 0 && d == 0)
		{
			;
		}
		else
		{
		System.out.printf("%d",d);
		}
		a = c - d * 13;
		}
		System.out.print("\n");
		System.out.printf("%d\n",a);
		}
		}
	}

}

