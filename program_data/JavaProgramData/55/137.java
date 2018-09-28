package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int n = 0;
		String na = new String(new char[40]);
		String nb = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			na = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int la;
		la = na.length();
		int i;
		int j;
		int s;
		int y;
		for (i = 0;i < la;i++)
		{
			if (na.charAt(i) - '0' < 10)
			{
				n = a * n + na.charAt(i) - '0';
			}
			else if ((na.charAt(i) - 'A' >= 0) && (na.charAt(i) - 'A' < 26))
			{
				n = a * n + na.charAt(i) - 'A' + 10;
			}
			else
			{
				n = a * n + na.charAt(i) - 'a' + 10;
			}
		}
		s = n;
		if (s == 0)
		{
			i = 1;
		}
		else
		{
			for (i = 1;s > 0;i++)
			{
			s = s / b;
			}
		i--;
		}
		for (j = 1;j <= i;j++)
		{
		y = n % b;
		n = n / b;
		if (y < 10)
		{
			nb = tangible.StringFunctions.changeCharacter(nb, i - j, y + '0');
		}
		else
		{
			nb = tangible.StringFunctions.changeCharacter(nb, i - j, y - 10 + 'A');
		}
		}
		nb = nb.substring(0, i);
		System.out.println(nb);
	}
}

