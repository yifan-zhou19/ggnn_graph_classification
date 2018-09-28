import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	   int i;
	   int j;
	   int k;
	   int l;
	   int p;
	   int t;
	   String a = new String(new char[501]);
	   a = new Scanner(System.in).nextLine();
	   l = a.length();
		p = l - n + 1;
		int[] b = new int[501];
	   for (i = 0;i < 501;i++)
	   {
		 b[i] = 1;
	   }
	   char[][] c =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0'}
	   };
	   for (i = 0;i < p;i++)
	   {
		  for (t = 0;t < n;t++)
		  {
			c[i][t] = a.charAt(i + t);

		  }
	   }

	   for (i = 0;i < p;i++)
	   {
		  for (j = 0;j < p;j++)
		  {
			 if ((strcmp(c[i],c[j]) == 0) && (b[i] != 0) && (i != j) && (b[j] != 0))
			 {
			   b[i] = b[i] + 1;

			   b[j] = 0;
			 }
		  }
	   }
	   int s = b[0];
	   for (i = 0;i < p;i++)
	   {
		 if (b[i] >= s)
		 {
		   s = b[i];
		 }
	   }
	   if (s == 1)
	   {
		   System.out.print("NO");
		   System.out.print("\n");
	   }
	   else
	   {
		   System.out.print(s);
		   System.out.print("\n");
		  for (i = 0;i < p;i++)
		  {
			if (b[i] == s)
			{
			  for (j = 0;j < n;j++)
			  {
				System.out.print(c[i][j]);
			  }
			  System.out.print("\n");
			}
		  }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}


}

