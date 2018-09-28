package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[256]);
	String sub = new String(new char[256]);
	String rep = new String(new char[256]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sub = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		rep = tempVar3.charAt(0);
	}
	int m;
	int n;
	int i;
	int j;
	int e;
	int k;
	n = str.length();
	m = sub.length();
	for (i = 0;i < n;i++)
	{
	e = 0;
	for (j = 0;j < m;j++)
	{
	if (str.charAt(i + j) == sub.charAt(j))
	{
		e++;
	}
	}
	if (e == m)
	{
		break;
	}
	}
	if (e == m)
	{
	for (k = 0;k < i;k++)
	{
		System.out.printf("%c",str.charAt(k));
	}
	System.out.printf("%s",rep);
	for (k = i + m;k < n;k++)
	{
		System.out.printf("%c",str.charAt(k));
	}
	}
	else
	{
		System.out.printf("%s",str);
	}
	return 0;
	}
}

