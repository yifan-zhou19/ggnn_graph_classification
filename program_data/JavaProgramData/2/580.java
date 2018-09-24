package <missing>;

public class GlobalMembers
{
	/*
	 * most books.cpp
	 * ??:?????????
	 *  Created on: 2012-12-30
	 *      Author: ???
	 */



	public static int Main()
	{
		int m = 0; //??????,??,????,?????
		int num = 0;
		int wnum = 0;
		int max = 0;
		int i = 0;
		int j = 0;
		int[][] books = new int[26][30]; //??26??????????
		String writer = new String(new char[26]); //????????
		char name;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(books,0,(Integer.SIZE / Byte.SIZE)); //???
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++) //???????????
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			writer = ConsoleInput.readToWhiteSpace(true).charAt(0);
			wnum = writer.length();
			for (j = 0;j < wnum;j++) //??????????,?????
			{
				books[writer.charAt(j) - 65][0]++;
				books[writer.charAt(j) - 65][books[writer.charAt(j) - 65][0]] = num;
			}
		}
		for (j = 0;j < 26;j++) //??
		{
			if (max < books[j][0])
			{
				max = books[j][0];
				name = j + 65;
			}
		}
		System.out.print(name);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (j = 1;j <= max;j++)
		{
		System.out.print(books[name-65][j]);
		System.out.print("\n");
		}
		return 0;
	}
}

