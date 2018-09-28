package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int ten = 0;
		String str = new String(new char[100]);
		String str2 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len = str.length();
		for (int i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				ten += (str.charAt(i) - '0') * Math.pow((double) a, (double)(len - 1 - i));
			}
			else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			{
				ten += (str.charAt(i) - 'a' + 10) * Math.pow((double) a, (double)(len - 1 - i));
			}
			else
			{
				ten += (str.charAt(i) - 'A' + 10) * Math.pow((double) a, (double)(len - 1 - i));
			}
		}
		int j = 0;
		if (ten == 0)
		{
			System.out.print(0);
		}
		else
		{
			while (ten != 0)
			{
				if (ten % b <= 9)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j++, (char)(ten % b + '0'));
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j++, (char)(ten % b - 10 + 'A'));
				}
				ten /= b;
			}
			j--;
			for (int i = j; i >= 0; i--)
			{
				System.out.print(str2.charAt(i));
			}
		}
		return 0;
	}









}

