package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static int l;
	public static void f36(int i)
	{
		int j;
		for (j = i + 1;j < l;j++)
		{
			if (b.charAt(j) != 32)
			{
				if (b.charAt(j) == 63)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 32);
					b = tangible.StringFunctions.changeCharacter(b, i, 32);
				}
				break;
			}
		}
	}
	public static int g()
	{
		a = new Scanner(System.in).nextLine();
		if (a.charAt(0) == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void k()
	{
		l = a.length();
		int i;
		int n = 0;
		int p;
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, 32);
			if (a.charAt(i) == 40)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 36);
				n = n + 1;
			}
			if (a.charAt(i) == 41)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 63);
				n = n + 1;
			}
		}
		for (p = 1;p <= n;p++)
		{
		for (i = 0;i < l;i++)
		{
			if (b.charAt(i) == 36)
			{
				f36(i);
			}
		}
		}
		System.out.printf("%s\n",a);
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		a = null;
	}
	public static int Main()
	{
		int n = 1;
		while (n == 1)
		{
			n = g();
			if (n == 0)
			{
				break;
			}
			k();
		}
		return 0;
	}
}

