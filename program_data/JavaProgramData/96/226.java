package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String number = new String(new char[100]);
		int i;
		int toDevide;
		int tell = 0;
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		toDevide = number.charAt(0) - '0';
		for (i = 1; number.charAt(i) != '\0'; i++)
		{
			toDevide = toDevide * 10 + number.charAt(i) - '0';
			if (i > 1 || toDevide / 13 != 0)
			{
								System.out.print(toDevide / 13);
								tell++;
			}
			toDevide %= 13;
		}
			 if (tell == 0)
			 {
				  System.out.print('0');
			 }
		System.out.print("\n");
		System.out.print(toDevide);
		System.out.print("\n");
		return 0;
	}
}

