package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num = 0;
	String s = new String(new char[50]);
	String t = new String(new char[50]);
	int a;
	int b;
	int i;
	int x = 0;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	for (i = 0;s.charAt(i) != '\0';i++)
	{
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a' + 10);
		}
	else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	{
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A' + 10);
	}
	else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
	{
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
	}
	}
	for (i = 0;s.charAt(i) != '\0';i++)
	{
	num = num * a + s.charAt(i);
	}
	for (i = 49;i >= 0;i--)
	{
		t = tangible.StringFunctions.changeCharacter(t, i, num % b);
	num = num / b;
	}
	i = 0;
	while (x == 0)
	{
		if (t.charAt(i) == 0)
		{
			i++;
		}
	else
	{
		x++;
	}
	if (i == 50)
	{
		System.out.print("0");
		x++;
	}
	}
	for (j = i;j <= 49;j++)
	{
		if (t.charAt(j) >= 10 && t.charAt(j) <= 35)
		{
	t = tangible.StringFunctions.changeCharacter(t, j, t.charAt(j) + 'A' - 10);
		}
	else
	{
		t = tangible.StringFunctions.changeCharacter(t, j, t.charAt(j) + '0');
	}
	System.out.printf("%c",t.charAt(j));
	}

	}
}

