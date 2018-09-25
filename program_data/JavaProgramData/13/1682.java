package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[20000];
		 int i;
		 int n;
		 int k;
		 int t;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i <= n - 1;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 System.out.print(a[0]);
		 for (i = 1;i <= n - 1;i++)
		 {
			  t = 0;
			  for (k = 0;k <= i - 1;k++)
			  {
				   if (a[i] == a[k])
				   {
					   t = 1;
				   }
			  }
			  if (t == 0)
			  {
				  System.out.print(" ");
				  System.out.print(a[i]);
			  }
		 }
		 return 0;
	}
}

