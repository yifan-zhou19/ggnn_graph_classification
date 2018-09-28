package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long shuz1,shuz2,total=0;
		int shuz1;
		int shuz2;
		int total = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int length;
		String n = new String(new char[33]);
		String result = new String(new char[33]);
		shuz1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		shuz2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 33;i++)
		{
			if (n.charAt(i) == '\0')
			{
				 length = i;
			break;
			}
		}
		for (i = 0;i < length;i++)
		{
			if (n.charAt(i) > 60 && n.charAt(i) < 93)
			{
				total += (n.charAt(i) - 55) * Math.pow((double)shuz1,length - i - 1);
			}
			else if (n.charAt(i) > 93)
			{
				total += (n.charAt(i) - 87) * Math.pow((double)shuz1,length - i - 1);
			}
			else
			{
				total += (n.charAt(i) - 48) * Math.pow((double)shuz1,length - i - 1);
			}
		}
			if (total == 0)
			{
				System.out.print(0);
				System.out.print("\n");
				return 0;
			}
		for (j = 0;total > 0;j++)
		{
			result = tangible.StringFunctions.changeCharacter(result, j, total % shuz2);
			total = (total - result.charAt(j)) / shuz2;
		}
		for (k = 0;k < 33;k++)
		{
		if (result.charAt(k) < 10)
		{
			result = tangible.StringFunctions.changeCharacter(result, k, result.charAt(k) + 48);
		}
		else
		{
			result = tangible.StringFunctions.changeCharacter(result, k, result.charAt(k) + 55);
		}
		}
		for (k = j - 1;k >= 0;k--)
		{
			System.out.print(result.charAt(k));
		}
			System.out.print("\n");
		return 0;
	}

}

