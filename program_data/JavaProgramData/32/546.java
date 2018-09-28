package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		String num1 = new String(new char[101]);
		String num2 = new String(new char[101]);
		String r = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		g = 1;
		while (g <= a)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num2 = tempVar3.charAt(0);
		}
		System.out.print("\n");
		b = num1.length() - 1;
		c = num2.length() - 1;
		e = b;
		while (c >= 0)
		{
			if (num1.charAt(b) >= num2.charAt(c))
			{
				r = tangible.StringFunctions.changeCharacter(r, b, num1.charAt(b) - num2.charAt(c) + '0');
			}
			else
			{
				num1.charAt(b) += 10;
				d = b - 1;
			while (num1.charAt(d) == '0')
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, d, '9');
				d--;
			}
			num1.charAt(d) -= 1;
			r = tangible.StringFunctions.changeCharacter(r, b, num1.charAt(b) - num2.charAt(c) + '0');
			}
			b--;
			c--;
		}
		while (b >= 0)
		{
			r = tangible.StringFunctions.changeCharacter(r, b, num1.charAt(b));
		b--;
		}
		for (f = e;f >= 0;f--)
		{
			System.out.printf("%c",r.charAt(e - f));
		}
		System.out.print("\n");
		g++;
		}
	}
}

