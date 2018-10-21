import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		  int l1 = a.length();
		  int l2 = b.length();
		  int l3 = c.length();
		  for (i = 0; ;i++)
		  {
			  if (a.charAt(i) == ' ')
			  {
				  break;
			  }
		  }
		   for (j = 0;j <= i - 1;j++)
		   {
				  if (a.charAt(j) != b.charAt(j))
				  {
						  for (k = 0;k <= i - 1;k++)
						  {
						  System.out.print(a.charAt(k));
						  }
						  break;
				  }
				  if (j == i - 1)
				  {
					  System.out.print(c);
				  }
		   }


			 for (i = 0;i <= l1 - 1;i++)
			 {
				 if (a.charAt(i) != ' ')
				 {
					 continue;
				 }
				 for (j = 0;j <= l2 - 1;j++)
				 {
					 if (a.charAt(i + j + 1) != b.charAt(j))
					 {
						 System.out.print(" ");
						 for (k = i + 1; ;k++)
						 {
							 if (a.charAt(k) == ' ' || k == l1)
							 {
								 break;
							 }
							 else
							 {
								 System.out.print(a.charAt(k));
							 }
						 }
						 break;
					 }
					 if (j == l2 - 1)
					 {
						 System.out.print(" ");
						 System.out.print(c);

					 }
				 }
			 }
			 return 0;
	}

}
