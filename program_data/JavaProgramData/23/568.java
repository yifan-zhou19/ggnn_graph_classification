import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 11.1613.cpp
	 *
	 *  Created on: 2012-11-14
	 *      Author: ???
	 */
	public static int Main()
	{
		String x = new String(new char[10000]);
		char[][] a = new char[1000][1000];
		String temp = new String(new char[1000]);
		x = new Scanner(System.in).nextLine(); //????
		int i;
		int lenth;
		int j = 0;
		int k = 0;
		lenth = x.length();
		for (i = 0;i < lenth;i++) //????
		{
			if (x.charAt(i) != ' ')
			{
				a[j][k] = x.charAt(i);
				k++;
			}
			if (x.charAt(i) == ' ')
			{
				a[j][k] = '\0';
				j++;
				k = 0;
			}
		}
	for (i = 0,k = j;k > i;i++,k--) //????
	{
		temp = a[i];
		a[i] = a[k];
		a[k] = temp;

	}
	System.out.print(a[0]);
	for (i = 1;i <= j;i++)
	{
		System.out.print(" ");
		System.out.print(a[i]);
	}
	}


}
