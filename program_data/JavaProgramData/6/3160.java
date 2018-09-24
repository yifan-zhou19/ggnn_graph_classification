package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int b;
		 int c;
		 int d = 0;
		 int e = 0;
		 int i;
		 int j;
		 int k;
		 int l;
		 int m;
		 int n;
		 int[][] a = new int[101][101];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= k;i++)
		 {
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (b = 1;b <= m;b++)
			{
				 for (c = 1;c <= n;c++)
				 {
					 a[b][c] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 d = d + a[b][c];
				 }
			}
			 for (b = 2;b <= m - 1;b++)
			 {
				 for (c = 2;c <= n - 1;c++)
				 {
					 e = e + a[b][c];
				 }
			 }
		System.out.print(d - e);
		System.out.print("\n");
		d = 0;
		e = 0;
		 }


	}

}

