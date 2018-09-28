package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n = 0;
	int m;
	int a;
	int b;
	int i;
	int j;
	int k;
	int l;
	int t = 0;
	String s = new String(new char[20]);
	String d = new String(new char[20]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	l = s.length();
	for (i = 0;i < l;i++)
	{
	if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
	{
	   k = s.charAt(i) - '0';
	}
	if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	{
	   k = s.charAt(i) - 'a' + 10;
	}
	if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	{
	   k = s.charAt(i) - 'A' + 10;
	}
	m = k;
	for (j = 1;j < l - i;j++)
	{
	m = m * a;
	}
	n = n + m;
	}
	if (n == 0)
	{
	System.out.print("0");
	}
	for (i = 0;n > 0;i++)
	{
	if (n % b < 10)
	{
		d = tangible.StringFunctions.changeCharacter(d, i, n % b + '0');
	}
	else
	{
		d = tangible.StringFunctions.changeCharacter(d, i, n % b + 'A' - 10);
	}
	n = n / b;
	}
	for (j = i - 1;j >= 0;j--)
	{
	System.out.printf("%c",d.charAt(j));
	}
	}
}

