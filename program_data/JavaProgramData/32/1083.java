package <missing>;

public class GlobalMembers
{
	/*
	 * POJ2736.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: wuch
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int l1;
		int l2;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] ans = new int[100];
		int[] aa = new int[100];
		int[] bb = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  l1 = a.length();
		  l2 = b.length();
		  for (j = 0;j < l1;j++)
		  {
			  aa[j] = a.charAt(l1 - j - 1) - '0';
		  }
		  for (j = 0;j < l2;j++)
		  {
			  bb[j] = b.charAt(l2 - j - 1) - '0';
		  }
		  if (l1 > l2)
		  {
			  for (j = l2;j < l1;j++)
			  {
				  bb[j] = 0;
			  }
		  }
		  for (j = 0;j < l1;j++)
		  {
			  ans[j] = aa[j] - bb[j];
		  }
		  for (j = 0;j < l1;j++)
		  {
			  if (ans[j] < 0)
			  {
			  ans[j] = ans[j] + 10;
			  ans[j + 1]--;
			  }
		  }
		  for (j = l1 - 1;j > -1;j--)
		  {
			  System.out.print(ans[j]);
		  }
		  System.out.print("\n");
		}
		return 0;
	}

}

