package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		char c;
		int i = 0;
		int r = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		while (c != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '!');
		i = 0;
		while (a.charAt(i) != '!')
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (r * 10 + a.charAt(i) - '0') / 13 + '0');
			r = (r * 10 + a.charAt(i) - '0') % 13;
			i++;
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '!');
		i = 0;
		do
		{
			if (flag == 0)
			{
				if (b.charAt(i) >= '1' && b.charAt(i) <= '9')
				{
					System.out.printf("%c",b.charAt(i));
					flag = 1;
				}
			}
			else
			{
				System.out.printf("%c",b.charAt(i));
			}
			i++;
		}while (b.charAt(i) != '!');
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.printf("\n%d",r);
	}

}

