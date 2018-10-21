package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Character.SIZE / Byte.SIZE) * 300);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int ci = 299;
		int ai = a.length() - 1;
		int bi = b.length() - 1;
		int jinwei = 0;
		while (ai >= 0 && bi >= 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, ci, (jinwei + a.charAt(ai) + b.charAt(bi) - 2 * '0') % 10 + '0');
			jinwei = (jinwei + a.charAt(ai) + b.charAt(bi) - 2 * '0') / 10;
			ai--;
			bi--;
			ci--;
		}
		while (ai >= 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, ci, (jinwei + a.charAt(ai) - '0') % 10 + '0');
			jinwei = (jinwei + a.charAt(ai) - '0') / 10;
			ci--;
			ai--;
		}
		while (bi >= 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, ci, (jinwei + b.charAt(bi) - '0') % 10 + '0');
			jinwei = (jinwei + b.charAt(bi) - '0') / 10;
			ci--;
			bi--;
		}
		while (ci >= 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, ci, jinwei + '0');
			jinwei = 0;
			ci--;
		}
		int i;
		for (i = 0;i < 300;i++)
		{
			if (c.charAt(i) > '0')
			{
				break;
			}
		}
		if (i == 300)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (i; i < 300;i++)
			{
				System.out.print(c.charAt(i));
			}
			System.out.print("\n");

		}



		return 0;
	}
}

