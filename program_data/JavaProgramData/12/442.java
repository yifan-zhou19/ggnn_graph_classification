package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-10-17
	 *      Author: lenovo
	 */
	public static int Main()
	{
		 int i;
		 int j;
		 int[] a = new int[17];
		 int t;
		 int sum;
	do
	{
		   t = -1;
		   sum = 0;
		  for (i = 1;i <= 16;i++)
		  {
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  t++;
			 if (a[i] == 0 || a[i] == -1)
			 {
			   break;
			 }
		  }


		   for (i = 1;i <= t;i++)
		   {
			   for (j = 1;j <= t;j++)
			   {
				   if (a[j] == a[i] * 2)
				   {
					   sum++;
				   }
			   }
		   }
		  if (a[1] != -1)
		  {
		  System.out.print(sum);
		  System.out.print("\n");
		  }
	} while (a[1] != -1);
		   return 0;
	}



}

