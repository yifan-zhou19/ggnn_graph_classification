package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int num10 = 0;
		String pre = new String(new char[200]);

	int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pre = ConsoleInput.readToWhiteSpace(true).charAt(0);

		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < pre.length();i++)
		{
			int temp = 1;
			for (int j = 1;j < pre.length() - i;j++)
			{

				temp *= a;
			}

			if (pre.charAt(i) >= '0' && pre.charAt(i) <= '9')
			{
				num10 += (int)(pre.charAt(i) - '0') * temp;
			}
			if (pre.charAt(i) >= 'a' && pre.charAt(i) <= 'z')
			{
				num10 += (int)(pre.charAt(i) - 'a' + 10) * temp;
			}
			if (pre.charAt(i) >= 'A' && pre.charAt(i) <= 'Z')
			{
				num10 += (int)(pre.charAt(i) - 'A' + 10) * temp;
			}
		}




	String num2 = new String(new char[50]);
		int j = 0;
		int length2 = 0;
		while (num10 >= b)
		{
			if (num10 % b <= 9)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, j, num10 % b + '0');
			}
			else
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, j, num10 % b - 10 + 'A');
			}
			num10 /= b;
			j++;
			length2++;
		}
		if (num10 % b <= 9)
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, j, num10 % b + '0');
		}
		else
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, j, num10 % b - 10 + 'A');
		}
		for (i = length2;i >= 0;i--)
		{
			System.out.print(num2.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

