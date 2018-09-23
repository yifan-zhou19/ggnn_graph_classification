import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String b = new String(new char[101]);
		while (b = new Scanner(System.in).nextLine())
		{
			j = 0;
			int[] c = new int[100];
			int[] a = new int[100];
			n = b.length();
			for (i = 0; i < n; i++)
			{
			   if (b.charAt(i) == '(')
			   {
				   a[j] = i + 1;
				   j++;
			   }
			   if (b.charAt(i) == ')')
			   {
				   if (j > 0)
				   {
					   j--;
					   a[j] = a[j + 1];
				   }
				   else
				   {
					   c[i] = 1;
				   }
			   }
			}
			for (i = 0; i < n; i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < j; i++)
			{
			   c[a[i] - 1] = 2;
			}
			for (i = 0; i < n; i++)
			{
				  if (c[i] == 1)
				  {
				   System.out.print("?");
				  }
			   else
			   {
				   if (c[i] == 2)
				   {
					   System.out.print("$");
				   }
				   else
				   {
					   System.out.print(" ");
				   }
			   }
			}
			System.out.print("\n");
		};
		return 0;
	}
}
