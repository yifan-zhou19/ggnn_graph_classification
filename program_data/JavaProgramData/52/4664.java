package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] ary = new int[m];
		for (i = 0; i < m; i++)
		{
				 ary[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j <= n; j++)
		{
				 int temp;
				 temp = ary[m - 1];
				 for (k = m - 1; k > 0; k--)
				 {
						  ary[k] = ary[k - 1];
				 }
				 ary[0] = temp;
		}
		for (i = 0; i < m; i++)
		{
				 System.out.print(ary[i]);
				 if (i != m - 1)
				 {
					 System.out.print(" ");
				 }
		}


		return EXIT_SUCCESS;
	}

}

