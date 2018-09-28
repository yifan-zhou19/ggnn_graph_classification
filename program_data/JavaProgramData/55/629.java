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
	public static char conv(int a)
	{
	if (a < 10)
	{
		return a + '0';
	}
	else
	{
		return a - 10 + 'A';
	}
	}
	public static int Main()
	{
	int a;
	int b;
	int n;
	int i;
	int j;
	int k;
	int ans;
	String c = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	n = c.length();
	n--;
	ans = calc(c.charAt(n));
	j = 1;
	for (i = n - 1;i >= 0;i--)
	{
	j *= a;
	ans += calc(c.charAt(i)) * j;
	}
	i = 0;
	while (ans > 0)
	{
	i++;
	c = tangible.StringFunctions.changeCharacter(c, i, conv(ans % b));
	ans /= b;
	}
	if (i == 0)
	{
		System.out.print("0");
	}
	while (i >= 1)
	{
	System.out.printf("%c",c.charAt(i));
	i--;
	}
	}

}

