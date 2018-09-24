import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ???? on 13-12-25.
	//  Copyright (c) 2013? ????. All rights reserved.
	//

	public static int Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct author_book
	//	{
	//		int count;
	//		int book[999];
	//	}
	//	au[26];

		for (int k = 0;k < 26;k++)
		{
			au[k].count = 0;
		}


		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		for (int i = 1;i <= m;i++)
		{
			int num;
			String a = new String(new char[26]);
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.in.read();
			a = new Scanner(System.in).nextLine();
			for (int k = 0;k < a.length();k++)
			{
				int author_r = (int)(a.charAt(k) - 'A'); //?????
				au[author_r].book[au[author_r].count] = num;
				au[author_r].count++;
			}
		}

		//find the max
		int max = 0;
		int the_one = 0;
		for (int i = 0;i < 26;i++)
		{
			//cout<<au[i].count<<endl;
			if (au[i].count > max)
			{
				max = au[i].count;
				the_one = i;
			}
		}

		//cout author
		char maxau = 'A' + the_one;
		System.out.print(maxau);
		System.out.print("\n");
		System.out.print(au[the_one].count);
		System.out.print("\n");
		//cout his books
		for (int i = 0;i < au[the_one].count;i++)
		{
			System.out.print(au[the_one].book[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

