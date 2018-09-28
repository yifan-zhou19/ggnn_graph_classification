package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] s = new int[n];
		int[] b = new int[n];
		for (i = 1;i <= n;i++)
		{
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   int[] a = new int[m];
		   for (j = 0,s[i] = 60,b[i] = 0;j < m;j++)
		   {
							a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   b[i] = a[j] + 3 * j + 3;
		   if (b[i] <= 60)
		   {
			   s[i] -= 3;
		   }
		   else if (b[i] >= 63)
		   {
			   s[i] = s[i];
		   }
		   else
		   {
			   s[i] = a[j];
		   }
		   }
		   System.out.printf("%d\n",s[i]);
		}
		   return 0;
	}
}

