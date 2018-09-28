package <missing>;

public class GlobalMembers
{
	/************************************
	5.cpp
	???Nov 2, 2011
	??(12-11) ??13
	?? 1100012886
	************************************/

	public static int Main()
	{
		int i = 0;
		int dividend = 0;
		String n = new String(new char[100]);
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		do
		{
			dividend = dividend * 10 + n.charAt(i) - '0';
			i++;
		} while ((dividend < 13) && (n.charAt(i) != '\0')); //????????
		while (n.charAt(i) != '\0')
		{
			System.out.print(dividend / 13);
			dividend = (dividend % 13) * 10 + n.charAt(i) - '0'; //?????
			i++;
		}
		System.out.print(dividend / 13);
		System.out.print("\n");
		System.out.print(dividend % 13);
		System.out.print("\n");
		return 0;
	}

}

