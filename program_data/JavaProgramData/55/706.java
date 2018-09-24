package <missing>;

public class GlobalMembers
{
	public static int calc(char c)
	{
	if (c >= '0' && c <= '9')
	{
		return c - '0';
	}
	else if (c >= 'a' && c <= 'z')
	{
		return c - 'a' + 10;
	}
	else if (c >= 'A' && c <= 'Z')
	{
		return c - 'A' + 10;
	}
	}
	public static char form(int n)
	{
	if (n >= 0 && n <= 9)
	{
		return '0' + n;
	}
	else
	{
		return 'A' + n - 10;
	}
	}
	public static int Main()
	{
	int a;
	int b;
	int n;
	int len;
	int bs1;
	String s = new String(new char[200]);
	String p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	len = s.length() - 1;
	bs1 = 1;
	n = 0;
	int i;
	for (i = len;i >= 0;i--)
	{
	n += bs1 * (calc(s.charAt(i)));
	bs1 *= a;
	}
	if (n == 0)
	{
		System.out.print("0");
	}
	for (i = 0;n > 0;i++)
	{
	s = tangible.StringFunctions.changeCharacter(s, i, form(n % b));
	n /= b;
	}
	for (int j = --i;j >= 0;j--)
	{
	System.out.print(s.charAt(j));
	}
	System.out.print("\n");
	}

}

