package <missing>;

public class GlobalMembers
{
	/*
	 * wo.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int j;
		int temp;
		double ave = 0;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = (double)sum / (double)n;
	   for (i = 1;i < n;i++)
	   {
		  for (j = 0;j < n - i;j++)
		  {
			  if (a[j] > a[j + 1])
			  {
				  temp = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = temp;
			  }
		  }
	   }
	   if (a[0] == a[n - 1])
	   {
		   for (i = 0;i < n - 1;i++)
		   {
			   System.out.print(a[0]);
			   System.out.print(",");
		   }
	   System.out.print(a[0]);
	   System.out.print("\n");
	   }
	   else if ((ave - a[0]) > (a[n - 1] - ave))
	   {
		   System.out.print(a[0]);
	   }
	   else if ((ave - a[0]) < (a[n - 1] - ave))
	   {
		   System.out.print(a[n - 1]);
	   }
	   else if ((ave - a[0]) == (a[n - 1] - ave))
	   {
		   System.out.print(a[0]);
		   System.out.print(",");
		   System.out.print(a[n - 1]);
	   }
	   return 0;
	}

}

