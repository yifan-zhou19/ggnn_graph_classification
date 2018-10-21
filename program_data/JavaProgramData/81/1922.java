package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[6][6];
	public static int n;
	public static int m;

	public static int Main()
	{
		for (int i = 0;i < 5;i++)
		{
				for (int j = 0;j < 5;j++)
				{
						a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		if (n >= 0 && n <= 4)
		{
				if (m >= 0 && m <= 4)
				{
				k = 1;
				}
		}
		if (k != 0)
		{
			 for (int i = 0;i < 5;i++)
			 {
					 int u;
					 if (i == n)
					 {
					 u = m;
					 }
					 else if (i == m)
					 {
					 u = n;
					 }
					 else
					 {
					 u = i;
					 }
					 for (int j = 0;j < 5;j++)
					 {
									 if (j != 4)
									 {
									 System.out.print(a[j][u]);
									 System.out.print(' ');
									 }
									 else
									 {
									 System.out.print(a[j][u]);
									 System.out.print("\n");
									 }
					 }
			 }
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}

}

