package <missing>;

public class GlobalMembers
{
	//
	// ????3.cpp
	// ?????13 
	// ?????? 1200012943
	// ??:2012.11.15
	//
	public static int Main()
	{
		int i;
		int r = 0;
		String num = new String(new char[100]);
		int[] quotient = new int[100];
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (i = 0; num.charAt(i) != '\0'; i++) //???????????
		{
			quotient[i] = (r * 10 + num.charAt(i) - '0') / 13; //???
			r = (r * 10 + num.charAt(i) - '0') % 13; //????
		}
		if (num.charAt(1) == '\0' || num.charAt(2) == '\0' && num.charAt(0) - '0' == 1 && num.charAt(1) - '0' < 3)
		{
			System.out.print(0);
		}
		else if (quotient[1] == 0)
		{
				for (i = 2; num.charAt(i) != '\0'; i++)
				{
					System.out.print(quotient[i]);
				}
		}
		else
		{
				for (i = 1; num.charAt(i) != '\0'; i++)
				{
					System.out.print(quotient[i]);
				}
		}
		System.out.print("\n");
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}
}

