package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);

	public static void power(int n)
	{
		int i;
		int j;
		if (n == 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, 1, '1');
			str = tangible.StringFunctions.changeCharacter(str, 0, '0');
		}
		else
		{
			power(n - 1);
			int len = str.length();
			int[] b = new int[100];
			b[len - 1] = 0;
			for (i = len - 1;i >= 1;i--)
			{
				if (2 * (str.charAt(i) - '0') + b[i] < 10)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 2 * (str.charAt(i) - '0') + b[i] + '0');
					b[i - 1] = 0;
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 2 * (str.charAt(i) - '0') + b[i] - 10 + '0');
					b[i - 1] = 1;
				}
			}
			if (b[0] == 1)
			{
				str = tangible.StringFunctions.changeCharacter(str, 0, '1');
				for (j = len;j >= 1;j--)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j - 1));
				}
			}

				str = tangible.StringFunctions.changeCharacter(str, 0, '0');
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		power(n);

		for (i = 1;i <= str.length() - 1;i++)
		{
		   System.out.print(str.charAt(i));
		}

	}


}

