import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * y3.cpp
	 *
	 *  Created on: 2010-11-26
	 *      Author: ???
	 *      Function??????C????????     
	 */
	public static int Main()
	{ // ???
		String a = new String(new char[81]);
		int n; //????
		int p1;
		int p2;
		int p3;
		int q;
		int b = 0;
		int i;
		int l;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine(); //?cin.getline?????
		while (n > 0)
		{
			a = new Scanner(System.in).nextLine(); //?????
		 l = a.length(); //????
		 if (l == 1)
		 {
			 b = 1;
		 }
		 else
		 {
				for (i = 1;i < l;i++) //???????????????????????
				{
					t = a.charAt(i); //??????????????1??????0
					 p1 = (t >= 'a') && (t <= 'z');
					 p2 = (t >= 'A') && (t <= 'Z');
					 p3 = (t >= '0') && (t <= '9');
					 q = (t == '_');
				 if (p1 != 0 || p2 != 0 || p3 != 0 || q != 0)
				 {
					 b = 1;
				 }
				 else
				 {
					 b = 0;
					 break;
				 }
				}
		 }
		  t = a.charAt(0);
			 p1 = (t >= 'a') && (t <= 'z');
			   p2 = (t >= 'A') && (t <= 'Z');
			   p3 = (t >= '0') && (t <= '9');
			   q = (t == '_');
		  if ((p1 != 0 || p2 != 0 || q != 0) && b != 0)
		  {
			 System.out.print(1);
			 System.out.print("\n");
		  }
		 else
		 {
			 System.out.print(0);
			 System.out.print("\n");
		 }
		 n--;
		}
		return 0;
	}

}

