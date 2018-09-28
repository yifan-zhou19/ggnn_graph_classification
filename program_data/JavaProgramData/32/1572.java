package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[101]);
	String b = new String(new char[101]);
	char k;
	int m;
	int i;
	int n;
	int j;
	int s = 102;
	int t = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}

	m = a.length() - b.length();


	for (j = a.length() - 1;j >= m;j--)
	{
	if (t != 0)
	{
		a.charAt(j)--;
	}
	if (a.charAt(j) >= b.charAt(j - m))
	{
	a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - m) + '0');
	t = 0;
	}
	else
	{
	a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j - m) + '0');
	t = 1;
	}
	}

	for (j = m - 1;j >= 0;j--)
	{
	if (t != 0)
	{
		a.charAt(j)--;
	}
	if (a.charAt(j) < '0')
	{
	a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10);
	t = 1;
	}
	else
	{
		t = 0;
	}
	}

	for (j = 0;j < a.length();j++)
	{
	if (a.charAt(j) != '0')
	{
	s = j;
	break;
	}
	}

	if (s == 102)
	{
		System.out.print("0\n");
	}
	else
	{
	for (j = s;j < a.length();j++)
	{
	System.out.printf("%c",a.charAt(j));
	}

	System.out.print("\n");
	String tempVar4 = ConsoleInput.scanfRead(null, 1);
	if (tempVar4 != null)
	{
		k = tempVar4.charAt(0);
	}
	}



	}

	}

}

