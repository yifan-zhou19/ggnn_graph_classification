package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int start;
		int[] num = new int[110];
		int mod;
		String number = new String(new char[110]);
		int i;
		int len;
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = number.length();
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print((number.charAt(0) - '0') % 13);
			System.out.print("\n");
		}
		else if (len == 2 && number.charAt(0) == '1' && number.charAt(1) >= '0' && number.charAt(1) <= '2')
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print((10 + number.charAt(1) - '0') % 13);
			System.out.print("\n");
		}
		else
		{
		mod = (number.charAt(0) - '0') % 13;
		num[0] = (number.charAt(0) - '0') / 13;
		for (i = 1 ; i < len ; i++)
		{
			num[i] = (mod * 10 + number.charAt(i) - '0') / 13;
			mod = (mod * 10 + number.charAt(i) - '0') % 13;
		}
		for (i = 0 ; i < len ; i++)
		{
			if (num[i] != 0)
			{
				start = i;
				break;
			}
		}
		for (i = start ; i < len ; i++)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		System.out.print(mod);
		System.out.print("\n");
		}
		return 0;
	}
}

