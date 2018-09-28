package <missing>;

public class GlobalMembers
{
	/*
	 * 1110.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: wangyinzhi
	 */


	public static int f(int x)
	{
		 if (x == 1)
		 {
			 return 1;
		 }
		 if (x % 2 == 0)
		 {
			 System.out.print(x);
			 System.out.print("/2=");
			 System.out.print(x / 2);
			 System.out.print("\n");
			 return f(x / 2); //????????
		 }
		 if (x % 2 == 1)
		 {
			 System.out.print(x);
			 System.out.print("*3+1=");
			 System.out.print(3 * x + 1);
			 System.out.print("\n");
			 return f(3 * x + 1); //????????
		 }
	}

	 public static int Main()
	 {
		 int x;
		 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 f(x); //??
		 System.out.print("End");
		 System.out.print("\n");
		 return 0;
	 }

}

