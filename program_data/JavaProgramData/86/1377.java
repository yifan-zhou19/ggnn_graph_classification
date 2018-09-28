package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int m;
	public static int j;
	public static int k;
	public static int p;
	public static int q;
	public static int r;
	public static int[] t = new int[99];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			r = 0;
			for (j = 1;j <= 90;j++)
			{
				t[j] = 1;
			}
			for (j = 1;j <= m;j++)
			{
				p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				q = 0;
				k = 1;
				do
				{
					q = q + t[k];
					k++;
				} while (q != p);
				t[k] = 0;
			k++;
				t[k] = 0;
				k++;
				t[k] = 0;
			}
			for (j = 1;j <= 60;j++)
			{
				r = r + t[j];
			}
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}

}

