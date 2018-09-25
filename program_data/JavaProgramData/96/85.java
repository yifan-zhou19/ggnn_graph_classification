package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int a;
	int shang;
	int yu;
	int l;
	int i;
	int j;
	int k;
	j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	l = s.length();
	for (j = 0;l > 9;j++)
	{
		a = 0;
	for (i = 8;i >= 0;i--)
	{
	a += (s.charAt(i) - '0') * (int)Math.pow(10,8 - i);
	}
	shang = a / 13;
	System.out.printf("%d",shang);
	yu = a % 13;
	if (yu >= 10)
	{
	s = tangible.StringFunctions.changeCharacter(s, 0, yu / 10 + '0');
	s = tangible.StringFunctions.changeCharacter(s, 1, yu % 10 + '0');
	for (k = 2;k <= 100;k++)
	{
	s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k + 7));
	}
	}
	else if (yu > 0)
	{
	s = tangible.StringFunctions.changeCharacter(s, 0, yu + '0');
	for (k = 1;k <= 100;k++)
	{
	s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k + 8));
	}
	}
	else if (yu == 0)
	{
	for (k = 0;k <= 100;k++)
	{
	s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k + 9));
	}
	}
	l = s.length();
	}
	a = 0;
	for (i = l - 1;i >= 0;i--)
	{
	a += (s.charAt(i) - '0') * (int)Math.pow(10,l - 1 - i);
	}
	shang = a / 13;
	System.out.printf("%d\n",shang);
	yu = a % 13;
	System.out.printf("%d",yu);
	}
}

