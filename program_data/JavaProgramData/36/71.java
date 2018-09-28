package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	int m;
	int n;
	int i;
	int j;
	m = a.length();
	n = b.length();
	if (m != n)
	{
	System.out.print("NO");
	}
	else
	{
		for (i = 0;i < m;i++)
		{
		for (j = i;j < m;j++)
		{
		if (a.charAt(i) == b.charAt(j))
		{
		t = b.charAt(i);
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
	b = tangible.StringFunctions.changeCharacter(b, j, t);
	break;
		}
		}
	if (a.charAt(i) != b.charAt(i) && j == m)
	{
		System.out.print("NO");
	break;
	}
		}
	for (i = 0;i < m;i++)
	{
		if (a.charAt(i) != b.charAt(i))
		{
		System.out.print("NO");
		break;
		}
	}
	if (i == m)
	{
	System.out.print("YES");
	}
	}
	return 0;
	}
}

