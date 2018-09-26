package <missing>;

public class GlobalMembers
{
	/*
	 * wenzi.cpp
	 *
	 *  Created on: 2012-12-7
	 *      Author: ada
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][41];
		for (int i = 0 ; i <= n ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int len = (int)String.valueOf(a[0]).length();

		System.out.print(a[0]);
		 for (int i = 1 ; i < n ; i++)
		 {
			 len = len + (int)String.valueOf(a[i]).length() + 1;
			 if (len <= 80)
			 {

				 System.out.print(" ");
				 System.out.print(a[i]);
			 }
			 else
			 {
				 System.out.print("\n");
				 System.out.print("\n");
				 System.out.print(a[i]);
				 len = (int)String.valueOf(a[i]).length();

			 }
		 }
		 return 0;
	}

}

