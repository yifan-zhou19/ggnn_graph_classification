package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int b;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		b = a.length();
		i = 0;
		if (b % 2 == 0)
		{
			while (i <= (b / 2 - 1))
			{
				c = a.charAt(b - 1 - i);
				a = tangible.StringFunctions.changeCharacter(a, b - 1 - i, a.charAt(i));
				a = tangible.StringFunctions.changeCharacter(a, i, c);
				i++;
			}
		}
		else
		{
				while (i <= ((b - 1) / 2 - 1))
				{
					c = a.charAt(b - 1 - i);
					a = tangible.StringFunctions.changeCharacter(a, b - 1 - i, a.charAt(i));
					a = tangible.StringFunctions.changeCharacter(a, i, c);
					i++;
				}
		}
		System.out.printf("%s\n",a);
		return 0;
	}

}

