package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[60];
		int m = 0;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= n;i++)
		 {
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[j] < (64 - 3 * j))
					{
						l = j;
					}
				}
				if (a[l] <= (60 - 3 * l))
				{
					System.out.print(60 - 3 * l);
					System.out.print("\n");
				}
				else if (a[l] > (60 - 3 * l) && a[l] < (64 - 3 * l))
				{
					System.out.print(a[l]);
					System.out.print("\n");
				}
			}
		 }
		return 0;
	}
}

