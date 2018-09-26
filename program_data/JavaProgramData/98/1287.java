package <missing>;

public class GlobalMembers
{
	/*
	 * ???1.cpp
	 * Created on: 2012-12-11
	 * Author: ???
	 * ??: ????????????
	 */
	public static int Main()
	{
		int a = 0; //??????
		int n; //????
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sum=&a;
		int sum = a;
		int len1;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[n][50]; //????
		for (i = 0;i < n;i++) //??????
		{
		   str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		i = 0;
		while (i < n - 1) //??????
		{
			len1 = String.valueOf(str[i]).length(); //??????
			len2 = String.valueOf(str[i + 1]).length(); //???????
			if (sum + len1 <= 80 && sum + len1 + len2 + 1 <= 80) //??????????
			{
			  System.out.print(str[i]);
			  System.out.print(" ");
			  sum = sum + len1 + 1; //????
			}
			else if (sum + len1 <= 80 && sum + len1 + len2 + 1>80) //??????
			{
				System.out.print(str[i]);
				System.out.print("\n");
				sum = null; //???0
			}
			i++; //?i?1
		}
		len1 = String.valueOf(str[n - 1]).length(); //?????????
		if (sum + len1 > 80)
		{
			System.out.print("\n");
			System.out.print(str[n - 1]);
		}
		if (sum + len1 <= 80)
		{
			System.out.print(str[n - 1]);
		}
	return 0; //????
	}

}

