package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int j;
		int l;
		int a;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] aa = new int[k + 1];
		for (i = 1;i <= k;i++)
		{
		  aa[i] = 0;
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (j = 1;j <= m;j++)
		   {
			 for (l = 1;l <= n;l++)
			 {
			   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   if (j == 1 || j == m || l == 1 || l == n)
			   {
					 aa[i] = aa[i] + a;
			   }
			 }
		   }
		}
			 for (i = 1;i <= k;i++)
			 {
			 System.out.print(aa[i]);
			 System.out.print("\n");
			 }
				  return 0;
	}
}

