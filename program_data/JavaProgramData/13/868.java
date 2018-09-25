package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: ??
	 */
	public static int Main()
	{
	   int n;
	   int l;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] m = new int[n]; //???
	   for (int i = 0;i < n;i++)
	   {
		 m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   int[] cishu = new int[101]; //?????,?????????????
	   for (int i = 0;i < n;i++) //??????????
	   {
		  cishu[m[i]]++;
		  if (cishu[m[i]] >= 2) //??????.???????
		  {
			 m[i] = 0;
		  }
	   }
	   for (int i = 0;i < n;i++) //??
	   {
		 if (i == 0)
		 {
		   System.out.print(m[i]);
		 }
		 else
		 {
		   if (m[i] != 0)
		   {
			 System.out.print(" ");
			 System.out.print(m[i]);
		   }
		 }
	   }
	   return 0;

	}


}

