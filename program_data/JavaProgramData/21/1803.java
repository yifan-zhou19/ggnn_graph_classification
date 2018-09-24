package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author:???
	 */

	public static int Main()
	{
	   int n;
	   int[] a = new int[300];
	   int i;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int min = a[1]; //?????????
	   int max = a[1];
	   double sum = a[1] + 0.0; //???
	   for (i = 1;i < n;i++)
	   { //???????????????
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   sum += a[i];
		   if (a[i] < min)
		   {
			   min = a[i];
		   }
		   else if (a[i] > max)
		   {
			   max = a[i];
		   }
	   }
	   if (2 * sum / n > max + min)
	   {
		   System.out.print(min);
		   System.out.print("\n");
	   }
	   else if (2 * sum / n < max + min)
	   {
		   System.out.print(max);
		   System.out.print("\n");
	   }
	   else
	   {
		   System.out.print(min);
		   System.out.print(",");
		   System.out.print(max);
	   }
	   return 0;
	}

}

