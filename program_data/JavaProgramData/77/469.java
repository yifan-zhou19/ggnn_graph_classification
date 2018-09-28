import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012826_????.cpp
	 *
	 *  Created on: 2011-1-5
	 *      Author: Administrator
	 */

	public static int k;
	public static int len;
	public static void pei(String a, int k)
	{
		  int i;
		  int j;
		  if (k == len / 2)
		  {
			  return; //?????????
		  }
		  for (i = 1;i < len;i++)
		  {
			  if (!a[i].equals(a[0]) && !a[i].equals('.'))
			  { //???????????
				  for (j = i;j >= 0;j--)
				  { //??????????
					  if (a[j].equals(a[0]))
					  {
						  System.out.print(j);
						  System.out.print(" ");
						  System.out.print(i);
						  System.out.print("\n");
					  a[i] = '.';
					  a[j] = '.'; //?????
					  break;
					  }
				  }
				  break;
			  }
		  }
		  k++; //???????
		  pei(a, k);
	}

	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		k = 0;
		pei(a, 0);
	}
}
