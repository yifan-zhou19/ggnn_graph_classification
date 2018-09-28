package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t1;
		int t2;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[21];
		int[] b = new int[21];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			b[i] = 0;
			for (j = 1; j <= a[i]; j++)
			{
				if (j == 1 || j == 2)
				{
					t1 = 1;
					t2 = 1;
				}
				else
				{
					t = t1;
					t1 = t2;
					t2 = t2 + t;
				}
			}
			b[i] = t2;
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

