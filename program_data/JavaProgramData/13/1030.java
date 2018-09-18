package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *???
	 *  Created on: 2011-11-5
	 *      Author: ???
	 */
	public static int Main()
	{
	  int i;
	  int n;
	  int[] a = new int[1000];
	  int j;
	  int k;
	  int m;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 2,m = 2;m <= n;i++,m++)
	  {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (j = 1;j < i;j++)
		  {
			  if (a[i] == a[j])
			  {
				  i--;
				  break;
			  }
		  }
	  }
	  System.out.print(a[1]);
	  for (k = 2;k <= i - 1;k++)
	  {
		  System.out.print(' ');
		  System.out.print(a[k]);
	  }
		return 0;
	}

}

