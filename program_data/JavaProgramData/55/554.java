package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int a1;
		int a2;
		int x;
		String a = new String(new char[32]);
		String b = new String(new char[80]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Integer.parseInt(tempVar3);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				k = a1 * k + a.charAt(i) - '0';
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				k = a1 * k + a.charAt(i) - 'a' + 10;
			}
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			{
				k = a1 * k + a.charAt(i) - 'A' + 10;
			}
		}
		if (k == 0)
		{
			System.out.print("0");
		}
		for (i = 0;k != 0;i++)
		{
			x = k % a2;
			if (x >= 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, x - 10 + 'A');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, x + '0');
			}
				k = k / a2;
		}
		while (i != 0)
		{
			i--;
			System.out.printf("%c",b.charAt(i));
		}
		return 0;
	}
}

