package <missing>;

public class GlobalMembers
{
	//*************************************
	//* ????3.cpp *
	//* ??????1200012844 *
	//* ?????2012?11?13? *
	//* ???????13 *
	//**************************************

	public static int Main()
	{
		int i;
		int r;
		String num = new String(new char[1000]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = num.length(); //???????len
		if (len == 1 || ((len == 2) && (num.charAt(0) == '1') && (num.charAt(1) < '3')))
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num);
			System.out.print("\n");
		}
		else
		{
			if (((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')) / 13 != 0)
			{
				System.out.print(((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')) / 13);
				r = ((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')) % 13; //???????????13???????13???
			}
			else
			{
				r = ((num.charAt(0) - '0') * 10 + (num.charAt(1) - '0')); //???????????13????????
			}
			for (i = 2; i < len; i++) //????????????
			{
				System.out.print((r * 10 + num.charAt(i) - '0') / 13);
				r = (r * 10 + num.charAt(i) - '0') % 13;
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}
}

