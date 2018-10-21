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
			  int[] a = new int[100000];
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 0;i < n;i++)
			  {
				 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (a[0] == k)
			  {
				  for (i = 1;i < n;i++)
				  {
					  if (a[i] != k)
					  {
					  a[0] = a[i];
					  a[i] = k;
					  break;
					  }
				  }
			  }
			  System.out.print(a[0]);
			  for (i = 1;i < n;i++)
			  {
				  if (a[i] != k)
				  {
					  System.out.print(" ");
					  System.out.print(a[i]);
				  }
			  }
			  return 0;
	}
}

