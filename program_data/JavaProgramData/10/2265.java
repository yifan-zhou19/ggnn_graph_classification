package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[26];
		int maxnum = 1;
		int i;
		int j;
		int[] h = new int[26];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f[i] = 1;
		}
		for (i = 2 ; i <= n ; i++)
		{
		   for (j = 1 ; j < i ; j++)
		   {
			   if (h[j] >= h[i])
			   {
				   f[i] = Math.max(f[i], f[j] + 1);
			   }
		   }
		   maxnum = Math.max(maxnum, f[i]);
		}
		System.out.print(maxnum);
	}

}

