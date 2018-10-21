package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:homework.cpp
	 *  Created on: 2012-12-10
	 *  Author: Meng Li
	 *  Function:????
	 */


	public static int Main()
	{ //???
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String start;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp;
		temp = start;
		for (i = 0;i < n;i++)
		{
			String word = new String(new char[40]);
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int length = word.length();
			if (temp - start.Substring(length) < 80)
			{
				if (temp - start != 0)
				{
					System.out.print(' ');
					temp++;
				}
				System.out.print(word);
				temp = temp + length;
			}
			else
			{
				start = temp;
				System.out.print("\n");
				System.out.print(word);
				temp = temp + length;
			}
		}
		return 0;
	}

}

