package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int k;
		int length;
		int i = 0;
		int j;
		int n = 0;
		int m = 0;
		int t = 1;
		char c;
		String str = new String(new char[34]);
		String str1 = new String(new char[34]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length = str.length();
		for (i = 1;i <= length;i++)
		{
			if ((str.charAt(i - 1) >= 48) && (str.charAt(i - 1) <= 57))
			{
				k = str.charAt(i - 1) - 48;
			}
			else if ((str.charAt(i - 1) >= 65) && (str.charAt(i - 1) <= 90))
			{
				k = str.charAt(i - 1) - 55;
			}
			else if ((str.charAt(i - 1) >= 97) && (str.charAt(i - 1) <= 122))
			{
				k = str.charAt(i - 1) - 87;
			}
			m = length - i;
			t = 1;
			for (j = 1;j <= m;j++)
			{
				t = t * a;
			}
			n = n + k * t;
		}
		i = 0;
		do
		{
			k = n % b;
			n = n / b;
			if ((k >= 0) && (k <= 9))
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, k + 48);
			}
			else if (k >= 10)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, k + 55);
			}
			i++;
		} while (n != 0);
		for (j = i;j >= 1;j = j - 1)
		{
			System.out.print(str1.charAt(j - 1));
		}
		return 0;
	}

}

