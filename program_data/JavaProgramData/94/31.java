package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		int j = 1;
		int i;
		int n;
		int[] a = new int[501];
		int[] b = new int[501];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[i] % 2 != 0)
		   {
			   b[j] = a[i];
			   j++;
		   }

	   }
	   for (i = 1;i <= j - 2;i++)
	   {
		 for (k = 1;k <= j - i - 1;k++)
		 {
			 if (b[k] > b[k + 1])
			 {
				 t = b[k];
				b[k] = b[k + 1];
				b[k + 1] = t;
			 }
		 }
	   }
	   for (i = 1;i <= j - 1;i++)
	   {
		   if (i == 1)
		   {
			   System.out.print(b[i]);
		   }
		   else
		   {
		   System.out.print(",");
		   System.out.print(b[i]);
		   }
	   }
		 return 0;
	}
}

