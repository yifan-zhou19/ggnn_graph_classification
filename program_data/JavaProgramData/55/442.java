package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j = 0;
		int x = 0;
		int y;
		int z = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String a_shu = new String(new char[65]);
		String b_shu = new String(new char[65]);
		while (true)
		{
			if ((y = System.in.read()) != ' ')
			{
				a_shu = tangible.StringFunctions.changeCharacter(a_shu, j++, y);
			}
			else
			{
				if (j > 0)
				{
					a_shu = tangible.StringFunctions.changeCharacter(a_shu, j, '\0');
					break;
				}
			}
		}
		for (i = 0;a_shu.charAt(i) != '\0';i++)
		{
			if (a_shu.charAt(i) <= 'z' && a_shu.charAt(i) >= 'a')
			{
				a_shu.charAt(i) -= 'a' - 10;
			}
			else
			{
				if (a_shu.charAt(i) <= 'Z' && a_shu.charAt(i) >= 'A')
				{
					a_shu.charAt(i) -= 'A' - 10;
				}
				else
				{
					a_shu.charAt(i) -= 48;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i--;i >= 0;i--)
		{
			x += a_shu.charAt(i) * z;
			z = z * a;
		}
		for (i = 0;x >= b;i++)
		{
			b_shu = tangible.StringFunctions.changeCharacter(b_shu, i, x % b);
			x = x / b;
			if (b_shu.charAt(i) >= 10)
			{
				b_shu.charAt(i) += 'A' - 10;
			}
		}
		if (x >= 10)
		{
			x += 'A' - 10;
			System.out.printf("%c",x);
		}
		else
		{
			System.out.printf("%d",x);
		}
		for (i--;i >= 0;i--)
		{
			if (b_shu.charAt(i) >= 10)
			{
				System.out.printf("%c",b_shu.charAt(i));
			}
			else
			{
				System.out.printf("%d",b_shu.charAt(i));
			}
		}
	}

}

