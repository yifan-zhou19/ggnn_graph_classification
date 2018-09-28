package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2011-12-10
	 *      Author: llx
	 */

	public static int Main()
	{
		int i; //i?????num??????length??????sumlen????????
		int num;
		int length;
		int sumlen = 0;
		String word = new String(new char[41]); //????
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num;i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length = word.length();
			if (sumlen != 0)
			{
						  sumlen = sumlen + length; //????????
						  if (sumlen < 79) //????????80??
						  {
																 System.out.print(" ");
																 System.out.print(word);
																 sumlen++; //?????
																 continue; //?????????
						  }
						  if ((sumlen == 80) || (sumlen == 79)) //?????80
						  {
																		System.out.print(" ");
																		System.out.print(word);
																		System.out.print("\n");
																		sumlen = 0; //??
						  }
						  if (sumlen > 80) //????80
						  {
													 System.out.print("\n");
													 System.out.print(word);
													 sumlen = length + 1;
						  }
			}
			else
			{
				System.out.print(word);
				sumlen = length + 1;
			}
		}
			System.in.read();
			System.in.read();
			System.in.read();
			System.in.read();
		return 0;
	}

}

