package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		String str = new String(new char[100]);
		String revstr = new String(new char[100]);
		int i;
		int len;
		str = String.format("%d", num);
		len = str.length();
		if (str.charAt(0) == '-')
		{
			for (i = 1; i < len; i++)
			{
				revstr = tangible.StringFunctions.changeCharacter(revstr, i, str.charAt(len - i));
			}
			revstr = tangible.StringFunctions.changeCharacter(revstr, 0, '-');
			revstr = tangible.StringFunctions.changeCharacter(revstr, len, '\0');
		}
		else
		{
			for (i = 0; i < len; i++)
			{
				revstr = tangible.StringFunctions.changeCharacter(revstr, i, str.charAt(len - i - 1));
			}
			revstr = tangible.StringFunctions.changeCharacter(revstr, len, '\0');
		}
		return (Integer.parseInt(revstr));
	}

	public static void Main()
	{
		int i;
		int num;
		for (i = 0; i < 6; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n", reverse(num));
		}
	}

}

