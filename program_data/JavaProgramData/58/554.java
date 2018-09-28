import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012850_32.5.cpp
	 *  ?????C????????
	 *  Created on: 2010-11-24
	 *      Author: william
	 */
	public static int Main() //???
	{
		int n; //??????
		int i;
		int j;
		char[][] a = new char[101][256]; //??????a[][]
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n;i++)
		{
		 a[i] = new Scanner(System.in).nextLine();
		} //for??????n????
		 for (i = 1;i <= n;i++) //for???????i????????????
		 {
			 int k;
			 k = String.valueOf(a[i]).length(); //k?a[i]???
			 if ((a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] >= 'a' && a[i][0] <= 'z') || a[i][0] == '_') //?????????????
			 {
				 int m = 0;
				 for (j = 1;j < k;j++) //for????????2???????????
				 {
					 if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9'))
					 {
						 m++;
					 }
						 else
						 {
						 System.out.print('0');
						 System.out.print("\n");
						 break; //???  ???0 ?????
						 }
				 }
				 if (m == k - 1)
				 {
					 System.out.print('1');
					 System.out.print("\n");
				 }
			 }
			 else
			 {
				 System.out.print('0');
				 System.out.print("\n");
			 }
		 }
	  return 0; //??
	} //??



}

