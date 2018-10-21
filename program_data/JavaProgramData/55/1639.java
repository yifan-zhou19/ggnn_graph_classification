package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String num = new String(new char[12000]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ln = num.length();
		int sum = 0;
		for (int i = 0;i < ln - 1;i++)
		{
			if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
			{
				sum = (sum + (num.charAt(i) - '0')) * a;
			}
			if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
			{
				sum = (sum + (num.charAt(i) - 'a' + 10)) * a;
			}
			if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
			{
				sum = (sum + (num.charAt(i) - 'A' + 10)) * a;
			}
		}
		if (num.charAt(ln - 1) >= '0' && num.charAt(ln - 1) <= '9')
		{
			sum += num.charAt(ln - 1) - '0';
		}
		if (num.charAt(ln - 1) >= 'a' && num.charAt(ln - 1) <= 'z')
		{
			sum += num.charAt(ln - 1) - 'a' + 10;
		}
		if (num.charAt(ln - 1) >= 'A' && num.charAt(ln - 1) <= 'Z')
		{
			sum += num.charAt(ln - 1) - 'A' + 10;
		}
		int j = 0;
		String output = new String(new char[11000]);
		if (sum == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			while (sum != 0)
			{
				if (sum % b >= 0 && sum % b <= 9)
				{
					output = tangible.StringFunctions.changeCharacter(output, j, sum % b + '0');
				}
				else if (sum % b >= 10)
				{
					output = tangible.StringFunctions.changeCharacter(output, j, sum % b + 'A' - 10);
				}
				sum = sum / b;
				j++;
			}
			for (int i = j - 1;i >= 0;i--)
			{
				System.out.print(output.charAt(i));
			}
		}
		return 0;
	}
}

