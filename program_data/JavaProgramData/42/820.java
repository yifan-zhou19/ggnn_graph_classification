package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int n;
		 int[] a = new int[100000];
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0 ; i <= n - 1 ; i++)
		 {
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0 ; i <= n - 1 ;)
		 {
			   if (a[i] == k)
			   {
					   for (j = i ; j <= n - 1 ; j++)
					   {
							 a[j] = a[j + 1];
					   }
					   n--;
			   }
			   else
			   {
				   i++;
			   }
		 }
		 for (i = 0 ; i <= n - 2 ; i++)
		 {
			   System.out.print(a[i]);
			   System.out.print(" ");

		 }
			   System.out.print(a[n - 1]);
		 return 0;
	}
}

