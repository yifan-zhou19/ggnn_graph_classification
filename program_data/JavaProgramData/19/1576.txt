import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012730_wg3.cpp
	 *    ????
	 *  Created on: 2010-11-6
	 *      Author: ???
	 */

	public static int Main()
	{
		 String s = new String(new char[256]);
		 String a = new String(new char[100]);
		 String b = new String(new char[100]);
		 char c;
		 int i; //i,j??????length??????g???????????????
		 int j;
		 int lengths;
		 int lengtha;
		 int lengthb;
		 int g = 0;
		 int k = 0;
		 int m;
		 s = new Scanner(System.in).nextLine();
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 lengths = s.length();
		 lengtha = a.length();
		 lengthb = b.length();
		 a = tangible.StringFunctions.changeCharacter(a, lengtha, ' ');
		 for (i = lengtha + 1;i > 0;i--)
		 {
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1));
		 }
		 a = tangible.StringFunctions.changeCharacter(a, 0, ' ');
		 if (s.charAt(0) == a.charAt(1))
		 {
				 for (i = 0;i <= lengtha;i++)
				 {
					 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				 }
			 a = a.substring(0, lengtha + 1);
			 for (i = 0;i <= lengths - 1;i++)
			 {
						  for (j = 0;j <= lengtha;j++)
						  {
							  if (s.charAt(i + j) == a.charAt(j))
							  {
								  g = 1;
							  }
						  else
						  {
							  g = 0;
						  }
						  if (g == 0)
						  {
							  break;
						  }
						  else
						  {
							  k = i;
						  }
						  } //k???????????
					  if (g == 0)
					  {
						  System.out.print(s.charAt(i));
					  }
					  if (g == 1)
					  {
						  System.out.print(b);
						  i = i + lengtha - 1;
					  }
			 }
		 }
		 else
		 {
			 for (i = 0;i <= lengths - 1;i++)
			 {
				 for (j = 0;j <= lengtha + 1;j++)
				 {
					 if (s.charAt(i + j) == a.charAt(j))
					 {
						 g = 1;
					 }
				 else
				 {
					 g = 0;
				 }
				 if (g == 0)
				 {
					 break;
				 }
				 else
				 {
					 k = i;
				 }
				 } //k???????????
			 if (i + lengtha + 1 == lengths)
			 {
				 for (m = 0;m <= lengtha - 1;m++)
				 {
							  if (s.charAt(i + m) == a.charAt(m))
							  {
								  g = 1;
							  }
						  else
						  {
							  g = 0;
						  }
						  if (g == 0)
						  {
							  break;
						  }
				 }
			 if (g == 1)
			 {
				 System.out.print(' ');
				 System.out.print(b);
				 break;
			 }
			 else
			 {
				 System.out.print(s.charAt(i));
			 }
			 }
			 else
			 {
				 if (g == 0)
				 {
					 System.out.print(s.charAt(i));
				 }
				  if (g == 1)
				  {
					  System.out.print(' ');
					  System.out.print(b);
					  i = i + lengtha;
				  }
			 }
			 }
		 }
		 return 0;
	}

}

