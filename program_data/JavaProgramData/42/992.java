package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int i;
	 int j;
	 int l;
	 int m;
	 int o;
	 int b = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[n];
	 for (i = 0 ; i <= n - 1 ; i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (j = 0 ; j <= n - 1 ; j++)
	 {
	   if (a[j] == k)
	   {
		 for (l = j ; l <= n - 1 ; l++)
		 {
		   a[l] = a[l + 1];
		 }
		   j--;
		 b++;
	   }
	 }
	  for (m = 0 ; m <= n - b - 1 ; m++)
	  {
		if (m != n - b - 1)
		{
		System.out.print(a[m]);
		System.out.print(" ");
		}
		else
		{
		System.out.print(a[m]);
		}
	  }
	 return 0;
	}
}

