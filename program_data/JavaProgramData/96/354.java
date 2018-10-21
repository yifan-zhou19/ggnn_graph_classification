package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[101]);
		String num2 = new String(new char[101]);
		int i;
		int j;
		int r = 0;
		int l1;
		num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = num1.length();
		if (((l1 == 2) && ((num1.charAt(0) - '0') == 1) && ((num1.charAt(1) - '0') > 2)) || (l1 > 2) || ((l1 == 2) && ((num1.charAt(0) - '0') > 1)))
		{
		for (i = 0; i < l1; i++)
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, i, (((r * 10) + num1.charAt(i) - '0') / 13) + '0');
			r = (r * 10 + num1.charAt(i) - '0') % 13;
		}
		if (num2.charAt(1) == '0')
		{
			for (j = 2; j < l1; j++)
			{
				System.out.print(num2.charAt(j));
			}
		}
		else
		{
			for (j = 1; j < l1; j++)
			{
				System.out.print(num2.charAt(j));
			}
		}
			System.out.print("\n");
			System.out.print(r);
		}
		if ((l1 == 2) && ((num1.charAt(0) - '0') == 1) && ((num1.charAt(1) - '0') <= 2))
		{
			System.out.print((10 + num1.charAt(1) - '0') / 13);
			System.out.print("\n");
			System.out.print((10 + num1.charAt(1) - '0') % 13);
		}
		if (l1 == 1)
		{
			System.out.print((num1.charAt(0) - '0') / 13);
			System.out.print("\n");
			System.out.print((num1.charAt(0) - '0') % 13);
		}

		return 0;
	}
}

