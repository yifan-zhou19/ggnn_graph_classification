import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		int j;
		int k;
		int s;
		int[] b = new int[31];
		a = new Scanner(System.in).nextLine();
		s = a.length();
	   for (i = 0;i < s;i++)
	   {
		   if (a.charAt(i) < '0' || a.charAt(i)>'9')
		   {
			   b[i] = 1;
		   }
		   else
		   {
			   b[i] = 0;
		   }
	   }

	   for (i = 0;i < s;i++)
	   {
		   if (b[i] == 0)
		   {
			   for (j = i;j < s;j++)
			   {
				   if (b[j] == 1)
				   {
				   break;
				   }
			   }
			   for (k = i;k < j;k++)
			   {
					System.out.print(a.charAt(k));
			   }
			   System.out.print("\n");
			   i = j;
		   }
	   }
	  return 0;
	}


}
