package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		int i;
		int kao;
		int[][] mn = new int[100000][2];
		for (kao = 1;kao <= 1000000;kao++)
		{
			mn[kao][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mn[kao][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int t = 0;
			 n = mn[kao][0];
			 m = mn[kao][1];
			 if (n != 0)
			 {
			 for (i = 1;i <= n;i++)
			 {
				 a[i] = i;
			 }
			int p = 1;
			while (t < (n - 1) * m)
			{
				if (a[p] != 0)
				{
					t = t + 1;
				}
				else
				{
					t = t;
				}
			   if (t % m == 0 && a[p] != 0)
			   {
				   a[p] = 0;
			   }
			   if (p == n)
			   {
				   p = 1;
			   }
				else
				{
					p++;
				}
			}
		   for (i = 1;i <= n;i++)
		   {
				if (a[i] != 0)
				{
					System.out.print(a[i]);
					System.out.print("\n");
				}
		   }
			 }
			 else
			 {
				 break;
			 }
		}

			return 0;
	}



}

