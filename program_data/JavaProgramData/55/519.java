package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int temp = 0;
		int a;
		int b;
		int k;
		int i;
		int o;
		int p;
		int j;
		String c = new String(new char[40]);
		String s = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = c.length();
		for (i = 0;i < k;i++)
		{
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				temp = a * temp + 10 + c.charAt(i) - 'a';
			}
			else if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				temp = a * temp + 10 + c.charAt(i) - 'A';
			}
			else if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				temp = a * temp + c.charAt(i) - '0';
			}
		}
		if (temp < b)
		{
			if (temp <= 9)
			{
			System.out.printf("%c",temp + '0');
			}
			else
			{
				System.out.printf("%c",temp - 10 + 'A');
			}
		}
		else
		{
			for (p = 0;;p++)
			{

			o = temp % b;
			if (o <= 9)
			{
			s = tangible.StringFunctions.changeCharacter(s, p, o + '0');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, p, o - 10 + 'A');
			}
			temp = temp / b;
			if (temp < b)
			{
				break;
			}

			}


		if (temp <= 9)
		{
		s = tangible.StringFunctions.changeCharacter(s, p + 1, temp + '0');
		}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, p + 1, temp - 10 + 'A');
		}
		for (j = 0;j <= p + 1;j++)
		{
			System.out.printf("%c",s.charAt(p + 1 - j));
		}
		}
		System.out.print("\n");
	}

}

