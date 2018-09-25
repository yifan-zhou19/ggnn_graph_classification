package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String digit = new String(new char[100]);
		String result = new String(new char[100]);
		digit = new Scanner(System.in).nextLine();
		int i;
		int a;
		int n;
		int c;
		int s;
		n = digit.length();
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				a = digit.charAt(i) - '0';
			}
			else
			{
				a = c * 10 + digit.charAt(i) - '0';
			}
			result = tangible.StringFunctions.changeCharacter(result, i, a / 13 + '0');
			c = a % 13;
		}
		if ((result.charAt(0) == '0' && n == 1) || (result.charAt(1) == '0' && n == 2))
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i < 3;i++)
			{
			if (result.charAt(i) != '0')
			{
				s = i;
				break;
			}
			}
		for (i = s;i < n;i++)
		{
			System.out.printf("%c",result.charAt(i));
		}
		System.out.print("\n");
		}
		System.out.printf("%d",c);
		return 0;
	}
}

