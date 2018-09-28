package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]);
		int a;
		int b;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (num.charAt(1) == '\0')
		{
			System.out.print('0');
			System.out.print('\n');
			System.out.print(num.charAt(0));
		}
		else
		{
			a = ((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')) / 13;
			b = ((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')) % 13;
			if (a != 0 || num.charAt(2) == '\0')
			{
				System.out.print(a);
			}
			for (int i = 2; num.charAt(i) != '\0'; i++)
			{
				a = (b * 10 + (num.charAt(i) - '0')) / 13;
				b = (b * 10 + (num.charAt(i) - '0')) % 13;
				System.out.print(a);
			}
			System.out.print('\n');
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}

}

