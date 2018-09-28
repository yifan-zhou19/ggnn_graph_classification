package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String k = new String(new char[33]);
	String l = new String(new char[33]);
	int[] j = new int[33];
	int a;
	int b;
	int d;
	int i;
	int s;
	int n = 0;
	i = 0;
	s = 1;
	n = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	d = k.length();
	while (i <= d - 1)
	{
		s = Math.pow(a,d - i - 1);
	if (k.charAt(i) >= 'A' && k.charAt(i) <= 'Z')
	{
	n = n + (k.charAt(i) - 'A' + 10) * s;
	}
	else if (k.charAt(i) >= 'a' && k.charAt(i) <= 'z')
	{
	n = n + (k.charAt(i) - 'a' + 10) * s;
	}
	else
	{
	n = n + (k.charAt(i) - 48) * s;
	}
	i++;
	s = 1;
	}
	j[0] = n;
	if (n == 0)
	{
	System.out.print("0");
	return 0;
	}
	for (i = 0;i <= 33;i++)
	{
	l = l.substring(0, i);
	}
	for (i = 0;j[i] != 0;i++)
	{
		l = tangible.StringFunctions.changeCharacter(l, i, j[i] % b + 1);
	j[i + 1] = (j[i] - l.charAt(i) + 1) / b;
	}
	d = l.length();
	for (i = 0;i <= d - 1;i++)
	{
		if (l.charAt(d - 1 - i) >= 11)
		{
		k = tangible.StringFunctions.changeCharacter(k, i, l.charAt(d - 1 - i) + 54);
		}
	else
	{
	k = tangible.StringFunctions.changeCharacter(k, i, l.charAt(d - 1 - i) + 47);
	}
	System.out.printf("%c",k.charAt(i));
	}
	return 0;
	}
}

