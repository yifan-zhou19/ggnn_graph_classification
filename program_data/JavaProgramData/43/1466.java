package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10001];
		int p;
		int m;
		int i;
		int j;
		int sm;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			a[i] = 0;
		}
		sm = Math.sqrt(m);
		for (i = 2; i <= sm; i++)
		{
		  if (a[i] == 0)
		  {
			for (j = 2; i * j < m; j++)
			{
			  a[i * j] = 1;
			}
		  }
		}
		for (i = 3; i <= m / 2; i++)
		{
		  if ((a[i] == 0) && (a[m - i] == 0))
		  {
			System.out.print(i);
			System.out.print(' ');
			System.out.print(m - i);
			System.out.print("\n");
		  }
		}
		return (0);
	}
}

