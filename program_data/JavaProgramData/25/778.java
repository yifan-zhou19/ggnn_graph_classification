package <missing>;

public class GlobalMembers
{
	public static String number = new String(new char[100]);
	public static String transnum = new String(new char[100]);
	public static void inttochar(int num)
	{
		int i = 0;
		String temp = new String(new char[100]);
		do
		{
			temp = tangible.StringFunctions.changeCharacter(temp, i, num % 10 + '0');
			num = num / 10;
			i++;
		}while (num != 0);
		for (int j = i - 1; j >= 0; j--)
		{
			number = tangible.StringFunctions.changeCharacter(number, i - 1 - j, temp.charAt(j));
		}
		return;
	}
	public static void multiply(String number, int k)
	{
		int t = 0;
		for (int j = number.length() - 1; j >= 0; j--)
		{
			transnum = tangible.StringFunctions.changeCharacter(transnum, j + 1, ((number[j] - '0') * k + t) % 10 + '0');
			t = ((number[j] - '0') * k + t) / 10;
		}
		transnum = tangible.StringFunctions.changeCharacter(transnum, 0, t + '0');
		number = transnum;
		return;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 31)
		{
			System.out.print((int)Math.pow((double)2, n));
			System.out.print("\n");
		}
		else
		{
			int num = (int)Math.pow((double)2, 30);
			inttochar(num);
			n = n - 30;
			while (n != 0)
			{
				if (n <= 3)
				{
					int k = (int)Math.pow((double)2, n);
					multiply(number, k);
					n = 0;
				}
				else
				{
					multiply(number, 8);
					n = n - 3;
				}
			};
			int i = 0;
			do
			{
				if (number.charAt(i) != '0')
				{
					break;
				}
				else
				{
					i++;
				}
			}while (1 != 0);
			for (int j = i; j < number.length(); j++)
			{
				System.out.print(number.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

