package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int c;
	int l;
	int i;
	int d;
	int[] b = new int[100];
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	l = a.length();
	if (l == 1)
	{
	System.out.printf("%d\n",0);
	System.out.printf("%c\n",a.charAt(0));
	}
	else
	{
	for (i = 1;i <= l - 1;i++)
	{
	d = 10 * (a.charAt(i - 1) - '0') + a.charAt(i) - '0';
	b[i - 1] = d / 13;
	a = tangible.StringFunctions.changeCharacter(a, i, d % 13 + '0');
	}
	c = a.charAt(l - 1) - '0';
	if (l == 2)
	{
	System.out.printf("%d\n",b[0]);
	System.out.printf("%d\n",c);
	}
	else
	{
	if (b[0] == 0)
	{
	for (i = 1;i <= l - 3;i++)
	{
	System.out.printf("%d",b[i]);
	}
	System.out.printf("%d\n",b[l - 2]);
	System.out.printf("%d\n",c);
	}
	else
	{
	for (i = 1;i <= l - 2;i++)
	{
	System.out.printf("%d",b[i - 1]);
	}
	System.out.printf("%d\n",b[l - 2]);
	System.out.printf("%d\n",c);
	}
	}
	}
	System.in.read();
	System.in.read();
	}
}

