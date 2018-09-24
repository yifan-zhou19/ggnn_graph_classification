package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 25 + 2;
	public static int n;
	public static int[] a = new int[MAXN];
	public static int[] f = new int[MAXN];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			f[i] = 0;
			for (int j = 0;j < i;j++)
			{
			  if (a[j] >= a[i] != 0 && f[j] > f[i])
			  {
				f[i] = f[j];
			  }
			}
			f[i]++;
		}
		int max = 0;
		for (int i = 0;i < n;i++)
		{
		  if (f[i] > max)
		  {
			  max = f[i];
		  }
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

