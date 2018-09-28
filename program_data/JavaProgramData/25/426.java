package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 1;
		int i;
		int j;
		int temp = 0;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[40]);
		for (i = 0; i < 40; i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '0');
		}
		str = tangible.StringFunctions.changeCharacter(str, 0, '1');
		for (i = 1; i <= n; i++)
		{
			temp = 0;
			for (j = 0; j < 40; j++)
			{
				if (2 * (str.charAt(j) - '0') + temp >= 10)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, 2 * (str.charAt(j) - '0') - 10 + temp + '0');
					temp = 1;
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, j, 2 * (str.charAt(j) - '0') + temp + '0');
					temp = 0;
				}
			}
		}
		for (i = 0; i < 40; i++)
		{
			if (str.charAt(i) == '0' && str.charAt(i + 1) == '0' && str.charAt(i + 2) == '0')
			{
				l = i;
				break;
			}
		}
		for (i = l - 1; i >= 0;i--)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}

