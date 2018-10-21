package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int sum;
		int c = 0;
		String str = new String(new char[100]);
		String str1 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;str.charAt(i) != '\0';i++)
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				str.charAt(i) -= 32;
			}
		}
		sum = str.length();
		for (int i = 0;i < sum;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				c += (int)Math.pow((double)a,(double)(sum - 1 - i)) * (str.charAt(i) - 48);
			}
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				c += (int)Math.pow((double)a,(double)(sum - 1 - i)) * (str.charAt(i) - 55);
			}
		}
		int Len = 0;
		if (c == 0)
		{
			System.out.print("0");
		}
		else
		{
			while (c > 0)
			{
				int t = c % b;
				if (t >= 10)
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, Len, 'A' + t - 10);
				}
					else
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, Len, '0' + t);
					}
				c /= b;
				Len++;
			}
			for (int j = Len - 1;j >= 0;j--)
			{
				System.out.print(str1.charAt(j));
			}
		}
		return 0;
	}
}

