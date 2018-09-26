package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int c;
	int d;
	int i;
	int j;
	int m;
	int n;
	int l;
	int zeus;
	int athena;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	c = a.length();
	d = b.length();
	if (c != d)
	{
		athena = 0;
	}
	if (c == d)
	{
		for (i = 0;i < c;i++)
		{
		for (m = i;m < c;m++)
		{
			if (a.charAt(i) > a.charAt(m))
			{
				n = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(m));
				a = tangible.StringFunctions.changeCharacter(a, m, n);
			}
			if (b.charAt(i) > b.charAt(m))
			{
				l = b.charAt(i);
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(m));
				b = tangible.StringFunctions.changeCharacter(b, m, l);
			}
		}
		}
		zeus = 1;
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				athena = 0;
				zeus = 0;
				break;
			}
		}
		if (zeus != 0)
		{
			athena = 1;
		}
	}
	if (athena != 0)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}
	}
}

