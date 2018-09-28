package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String number = new String(new char[100]);
		char[] quotient = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int r = 0;
		int i;
		for (i = 0;number.charAt(i) != '\0';i++)
		{
			quotient[i] = (r * 10 + (number.charAt(i) - '0')) / 13 + '0';
			r = (r * 10 + (number.charAt(i) - '0')) % 13;
		}
		int len = quotient.length();
		if (Integer.parseInt(number) < 13)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
		if (quotient[1] != '0')
		{
			System.out.print(quotient[1]);
		}
		 for (i = 2;i <= len - 1;i++)
		 {
			 System.out.print(quotient[i]);
		 }
		System.out.print('\n');
		}
		System.out.print(r);
		System.out.print('\n');

		return 0;
	}

}

