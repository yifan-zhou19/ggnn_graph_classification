package <missing>;

public class GlobalMembers
{
	/*
	 * paiban.cpp
	 *?????
	 *  Created on: 2012-12-14
	 *      Author: ??
	 */


	public static int Main()
	{
		String p; //??????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * 4);
		int chang = 0; //????????n,????
		int n;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(p);
		chang = p.length(); //???????????
		n--; //????
		while (n > 0)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = p.length(); //???????
			chang += len + 1; //???????
			if (chang > 80)
			{
				System.out.print('\n');
				System.out.print(p);
				chang = len; //??????????????????
			}
			else
			{
				System.out.print(' ');
				System.out.print(p);
			}
			n--; //?????
		}
		return 0;
	}

}

