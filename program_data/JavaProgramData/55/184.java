package <missing>;

public class GlobalMembers
{
	public static char ch(char a)
	{
	char c;
	if (a >= 'A' && a <= 'Z')
	{
		c = 'A' - 10;
	}
	else if (a >= 'a' && a <= 'z')
	{
		c = 'a' - 10;
	}
	else
	{
		c = '0';
	}
	return c;
	}
	public static void Main()
	{
	int a;
	int b;
	int i;
	int j;
	int sum = 0;
	final String n = "\0";
	final String m = "\0";
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 32;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, tempVar2);
		}
		if (n.charAt(i) == ' ')
		{
			break;
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	for (j = 0;j < i;j++)
	{
		sum = sum * a + n.charAt(j) - ch(n.charAt(j));
	}
	for (j = 0;j < 32;j++)
	{
		c = '0';
		if (sum % b > 9)
		{
			c = 'A' - 10;
		}
		m = tangible.StringFunctions.changeCharacter(m, j, sum % b + c);
		sum = sum / b;
		if (sum == 0)
		{
			break;
		}
	}
	for (i = 0;i <= j;i++)
	{
		System.out.printf("%c",m.charAt(j - i));
	}
	}
}

