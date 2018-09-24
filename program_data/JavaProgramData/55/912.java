package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int x = 0;
		int y;
		String num1 = new String(new char[100]);
		String num2 = new String(new char[100]);
		char c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0; i < num1.length(); i++)
		{
			if (num1.charAt(i) >= 'a' && num1.charAt(i) <= 'z')
			{
				x = x * a + num1.charAt(i) - 'a' + 10;
			}
			 if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'Z')
			 {
				 x = x * a + num1.charAt(i) - 'A' + 10;
			 }
			 if (num1.charAt(i) >= '0' && num1.charAt(i) <= '9')
			 {
				 x = x * a + num1.charAt(i) - '0';
			 }
		}
		if (x == 0)
		{
			System.out.print("0");
			return 0;
		}
		i = 0;
		while (x > 0)
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, i++, x % b);
			x = x / b;
		}
		for (; i > 0; i--)
		{
			if (num2.charAt(i - 1) >= 0 && num2.charAt(i - 1) <= 9)
			{
				System.out.printf("%d", num2.charAt(i - 1));
			}
			if (num2.charAt(i - 1) > 9)
			{
				System.out.printf("%c", num2.charAt(i - 1) - 10 + 'A');
			}
		}
		System.out.print("\n");

		return 0;
	}

}

