package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *????????
	 *  Created on: 2012-11-6
	 *      Author: ???
	*/
	public static int Main()
	{
		int N;
		int k;
		int i;
		int j = 0;
		int i1;
		int s = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				s++;
			}
		}
		   for (i = 0;i < n;)
		   {
			   if (j < s)
			   {
					if (a[i] == k)
					{
						for (i1 = i;i1 < n - 1;i1++)
						{
					a[i1] = a[i1 + 1];
						}
					a[n - 1] = k;
					j++;
					}
				else
				{
					i++;
				}
			   }
			   else
			   {
				   break;
			   }
		   }
		System.out.print(a[0]);
		for (i = 1;i < n - s;i++)
		{
		System.out.print(" ");
		System.out.print(a[i]);
		}

	}




}

