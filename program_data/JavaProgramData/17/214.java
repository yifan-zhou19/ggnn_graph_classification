import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[101]);
	 int i;
	 int n;
	 int p;
	 int q;
	 while (a = new Scanner(System.in).nextLine())
	 {
		 int[] b = new int[101];
		 p = 0;
		 q = 0;
		 n = a.length();
		 for (i = 0;i <= n - 1;i++)
		 {
			 if (a.charAt(i) == ')')
			 {
				 q++;

				 if (q > p)

				 {

					 b[i] = 1;
					 q = q - 1;

				 }
			 }
			 if (a.charAt(i) == '(')
			 {
				 p++;
			 }

		 }
		 p = 0;
		 q = 0;
		 for (i = n - 1;i >= 0;i--)
		 {
			 if (a.charAt(i) == ')')
			 {
				 q++;
			 }
			 if (a.charAt(i) == '(')
			 {
				 p++;

				 if (p > q)

				 {

					 b[i] = 2;
					 p = p - 1;

				 }
			 }

		 }
		 for (i = 0;i <= n - 1;i++)
		 {
			 System.out.print(a.charAt(i));
		 }
		 System.out.print("\n");
		 for (i = 0;i <= n - 1;i++)
		 {
			 if (b[i] == 0)
			 {
				 System.out.print(" ");
			 }
			 if (b[i] == 1)
			 {
				 System.out.print("?");
			 }
			 if (b[i] == 2)
			 {
				 System.out.print("$");
			 }
		 }
		 System.out.print("\n");
	 }
	 return 0;
	}

}
