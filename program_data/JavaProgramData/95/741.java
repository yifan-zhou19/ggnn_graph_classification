import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 10.cpp
	 *  Created on: 2010-11-7
	 *      Author: lulan
	 *      ?????????????
	 */


	public static int Main()
	{
		int i; //????
		String a = new String(new char[100]); //??????
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine(); //?????a
		b = new Scanner(System.in).nextLine(); //?????b
		   for (i = 0;i < 81;i++)
		   {
			  if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			  {
				a.charAt(i) += 32;
			  }
			else
			{
				continue; //???????????????
			}
		   }
		   for (i = 0;i < 81;i++)
		   {
			  if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
			  {
				b.charAt(i) += 32;
			  }
			else
			{
				continue;
			}
		   }
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0; //?????
	}

}
