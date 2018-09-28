import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 int[] t1 = new int[1000];
		 int[] t2 = new int[1000];
		 int[] x = new int[1000];
		 int l1;
		 int l2;
		 String c1 = new String(new char[1000]);
		 String c2 = new String(new char[1000]);
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 k = n;
		 while (k != 0)
		 {
			System.in.read();
			c1 = new Scanner(System.in).nextLine();
			c2 = new Scanner(System.in).nextLine();
			 l1 = c1.length();
			 l2 = c2.length();
			 for (i = 0; i < 1000; i++)
			 {
				 t2[i] = t1[i] = 0;
			 }
			 for (i = 0; i < l1; i++)
			 {
				 t1[i] = c1.charAt(l1 - 1 - i) - '0';
			 }
			 for (i = 0; i < l2; i++)
			 {
				 t2[i] = c2.charAt(l2 - 1 - i) - '0';
			 }
			 for (i = 0; i < l1; i++)
			 {
				x[i] = t1[i] - t2[i];
				 if (x[i] < 0)
				 {
					x[i] += 10;
					 t1[i + 1]--;
				 }
			 }
			for (i = l1 - 1; i >= 0; i--)
			{
				 if (x[i] != 0)
				 {
					 break;
				 }
			}
			for (j = i; j >= 0; j--)
			{
				 System.out.print(x[j]);
			}
			 System.out.print('\n');
			k--;
		 }



		return 0;
	}


}

