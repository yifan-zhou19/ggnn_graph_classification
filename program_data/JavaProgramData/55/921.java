package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int d;
	int i;
	int l;
	int m;
	int n;
	int s = 0;
	String c = new String(new char[32]);
	String e = new String(new char[32]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (c.charAt(0) == '0')
	{
	System.out.printf("%d\n",0);
	}
	else
	{
	l = c.length();
	for (i = 0;i <= l - 1;i++)
	{
	if (c.charAt(i) < 'A')
	{
	d = c.charAt(i) - '0';
	}
	else if (c.charAt(i) < 'a')
	{
	d = c.charAt(i) - 'A' + 10;
	}
	else
	{
	d = c.charAt(i) - 'a' + 10;
	}
	s = s * a + d;
	}
	for (i = 0;s > 0;i++)
	{
	n = s % b;
	if (n < 10)
	{
	e = tangible.StringFunctions.changeCharacter(e, i, n + '0');
	}
	else
	{
	e = tangible.StringFunctions.changeCharacter(e, i, n - 10 + 'A');
	}
	s = s / b;
	}
	for (m = i - 1;m > 0;m--)
	{
	System.out.printf("%c",e.charAt(m));
	}
	System.out.printf("%c\n",e.charAt(0));
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}
}

