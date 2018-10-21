package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int a;
			int b;
			int ten = 0;
		String num = new String(new char[1000]);
		String num1 = new String(new char[1000]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num.length(); i++)
		{ //??????????????
			if (num.charAt(i) >= (int)'A' && num.charAt(i) <= (int)'Z')
			{
				num.charAt(i) += 32;
			}
		}
		for (int i = 0; i < num.length(); i++)
		{ //????????????
			if (num.charAt(i) >= (int)'a' && num.charAt(i) <= (int)'z')
			{
				ten += ((int)num.charAt(i) - 87) * Math.pow((double)a, (double)num.length() - 1 - i);
			}
			else if (num.charAt(i) >= (int)'1' && num.charAt(i) <= (int)'9')
			{
				ten += ((int)num.charAt(i) - 48) * Math.pow((double)a, (double)num.length() - 1 - i);
			}
		}
		if (ten == 0)
		{
			System.out.print(0);
		}
		else
		{
			int j = 0;
			for (; ;)
			{ //?????????b???
			if (ten == 0)
			{
				break;
			}
			if (ten % b < 10)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, j, (char)(ten % b + 48));
			}
			else
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, j, (char)(ten % b + 55));
			}
			ten = ten / b;
			j++;
			}
		for (int i = j - 1; i >= 0; i--)
		{
			System.out.print(num1.charAt(i));
		}
		}
		return 0;
	}


}

