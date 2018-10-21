package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String num = new String(new char[100]);
		String t = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int shi = 0;
		int i;
		for (i = 0; num.charAt(i) != '\0'; i++)
		{
			if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
			{
				shi = shi * a + num.charAt(i) - '0';
			}
			if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
			{
				shi = shi * a + num.charAt(i) - 'a' + 10;
			}
			if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
			{
				shi = shi * a + num.charAt(i) - 'A' + 10;
			}
		}
		for (i = 0; shi != 0; i++)
		{
			if ((shi % b) <= 9)
			{
				t = tangible.StringFunctions.changeCharacter(t, i, (shi % b) + '0');
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, i, (shi % b) - 10 + 'A');
			}
			shi = shi / b;
		}

		int j;
		for (j = i - 1; j >= 0; j--)
		{
			System.out.printf("%c", t.charAt(j));
		}
		System.out.print("\n");

		return 0;
	}
}

