package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int m;
	int l;
	int k = 1;
	int[] c = new int[100];
	int e;
	int j;
	int a = 0;
	String s = new String(new char[100]);
	String v = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	l = s.length();
	for (i = 0;i < l;i++)
	{
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		{
			c[i] = s.charAt(i) - 87;
		}
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		{
			c[i] = s.charAt(i) - 55;
		}
		if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
		{
			c[i] = s.charAt(i) - 48;
		}
	}
	for (i = l - 1;i >= 0;i--)
	{
		a = a + c[i] * k;
	if (i == 0)
	{
		break;
	}
	k = k * n;
	}
	j = 0;
	if (a == 0)
	{
		System.out.print("0");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
	}
	while (a > 0)
	{
	e = a % m;
	if (e >= 0 && e <= 9)
	{
		v = tangible.StringFunctions.changeCharacter(v, j, e+48);
	}
	if (e >= 10)
	{
		v = tangible.StringFunctions.changeCharacter(v, j, e+55);
	}
	j++;
	a = a / m;
	}
	for (i = j - 1;i >= 0;i--)
	{
		System.out.printf("%c",v.charAt(i));
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}
}

