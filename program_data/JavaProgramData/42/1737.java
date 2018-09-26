package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-10-20
	 *      Author: ??
	 */
	public static int Main()
	{
			  int n;
			  int k;
			  int i;
			  int j;
			  int c = 0;
			  int[] a = new int[100000];
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 0;i < n;i++)
			  {
				 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 0;i < n;i++)
			  {
				 if (a[i] == k)
				 {
					 for (j = i;j < n - 1;j++)
					 {
						 a[j] = a[j + 1];
					 }
					 c += 1;
					 if (i == n - c)
					 {
						 break;
					 }
					 i--;
				 }
			  }
			  System.out.print(a[0]);
			  for (i = 1;i < n - c;i++)
			  {
				  System.out.print(" ");
				  System.out.print(a[i]);
			  }
			  return 0;
	}

}

