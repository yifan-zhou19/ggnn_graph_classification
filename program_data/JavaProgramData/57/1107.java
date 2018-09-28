package <missing>;

public class GlobalMembers
{
	public static int sc(String a)
	{
	int l;
	l = a.length();
	if ((a[l - 3].equals('i')) && (a[l - 2].equals('n')) && (a[l - 1].equals('g')))
	{
		a[l - 3] = null;
	}
	if ((a[l - 2].equals('e')) && (a[l - 1].equals('r')))
	{
		a[l - 2] = null;
	}
	if ((a[l - 2].equals('l')) && (a[l - 1].equals('y')))
	{
		a[l - 2] = null;
	}
	return 0;
	}
	public static int Main()
	{
	String a = new String(new char[32]);
	int n;
	int i;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	q = sc(a);
	System.out.printf("%s\n",a);
	}
	return 0;
	}

}

