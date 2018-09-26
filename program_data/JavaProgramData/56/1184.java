package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[6]);
		char i;
		char a;
		char b = 0;
		char k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		a = num.length();
		for (i = 0;i < a / 2;i++)
		{
				b = num.charAt(i);
				num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(a - 1 - i));
				num = tangible.StringFunctions.changeCharacter(num, a - 1 - i, b);
		}
		System.out.printf("%s", num);
		return 0;
	}
}

