package <missing>;

public class GlobalMembers
{
	public static String number = new String(new char[100]);
	public static int Main()
	{
		number = tangible.StringFunctions.changeCharacter(number, 0, '0');
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void power(int);
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
		power(n - 1);
		int i;
		for (i = 1;i <= number.length() - 1;i++)
		{
			System.out.print(number.charAt(i));
		}
		}
		return 0;
	}

	public static void power(int n)
	{
		if (n == 0)
		{
			number = tangible.StringFunctions.changeCharacter(number, 1, '1');
		}
		else
		{
			power(n - 1);
		}
		int len = number.length();
		int[] a = new int[100];
		a[len - 1] = 0;
		int i;
		for (i = len - 1;i >= 1;i--)
		{
			if (2 * (number.charAt(i) - '0') + a[i] <= 9)
			{
				number = tangible.StringFunctions.changeCharacter(number, i, 2 * (number.charAt(i) - '0') + a[i] + '0',a[i - 1] = 0);
			}
			else
			{
				number = tangible.StringFunctions.changeCharacter(number, i, 2 * (number.charAt(i) - '0') + a[i] - 10 + '0',a[i - 1] = 1);
			}
		}
		if (a[0] == 1)
		{
			number = tangible.StringFunctions.changeCharacter(number, 0, '1');
		}
		else
		{
			number = tangible.StringFunctions.changeCharacter(number, 0, '0');
		}
		if (number.charAt(0) != '0')
		{
			for (i = len;i >= 1;i--)
			{
				number = tangible.StringFunctions.changeCharacter(number, i, number.charAt(i - 1));
			}
			number = tangible.StringFunctions.changeCharacter(number, 0, '0');
		}
	}




}

