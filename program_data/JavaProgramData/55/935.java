package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int x;
		int n;
		int i;
		int j = 0;
		int k;
		int h;
		int m;
		int num1 = 0;
		String str = new String(new char[100]);
		String num = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = str.length();
		for (i = 0; i < n; i++)
		{
			int y = 1;
			for (m = 0; m < n - 1 - i;m++)
			{
				y = y * a;
			}
			if (str.charAt(i) <= 57)
			{
				num1 = num1 + (str.charAt(i) - 48) * y;
			}
			if ((str.charAt(i) >= 65) && (str.charAt(i) < 97))
			{
				num1 = num1 + (str.charAt(i) - 55) * y;
			}
			if (str.charAt(i) >= 97)
			{
				num1 = num1 + (str.charAt(i) - 87) * y;
			}
		}
		x = num1;
		do
		{
			num1 = num1 / b;
			j++;
		}while (num1 > 0);
		for (k = 0 ; k < j; k++)
		{
			if (x % b < 10)
			{
				num = tangible.StringFunctions.changeCharacter(num, j - 1 - k, x % b + 48);
			}
			if (x % b >= 10)
			{
				num = tangible.StringFunctions.changeCharacter(num, j - 1 - k, x % b + 55);
			}
			x = x / b;
		}
		for (h = 0; h < j ; h++)
		{
			System.out.print(num.charAt(h));
		}
		return 0;
	}
}

