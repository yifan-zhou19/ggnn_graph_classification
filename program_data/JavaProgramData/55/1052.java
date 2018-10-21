package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int a;
		int b;
		int c;
		int s;
		int m = 0;
		String n = new String(new char[32]);
		String x = new String(new char[32]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
			for (j = 1,s = 1;j <= i;j++)
			{
				s = s * a;
			}
			if (n.charAt(l - i - 1) >= 65 && n.charAt(l - i - 1) <= 90)
			{
				k = n.charAt(l - i - 1) - 55;
			}
			else
			{
				if (n.charAt(l - i - 1) >= 97 && n.charAt(l - i - 1) <= 122)
				{
					k = n.charAt(l - i - 1) - 87;
				}
			else
			{
				k = n.charAt(l - i - 1) - 48;
			}
			}
			k = k * s;
			m = m + k;
		}
		for (i = 0;;i++)
		{
			c = m % b;
			if (c <= 9)
			{
				x = tangible.StringFunctions.changeCharacter(x, i, c + 48);
			}
			else
			{
				x = tangible.StringFunctions.changeCharacter(x, i, c + 55);
			}
		if (m / b == 0)
		{
			break;
		}
		m = m / b;
		}
		for (j = 0;j <= i;j++)
		{
		System.out.printf("%c",x.charAt(i - j));
		}
	}


}

