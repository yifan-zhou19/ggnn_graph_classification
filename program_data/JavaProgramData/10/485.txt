package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[26];
	public static int[] b = new int[26];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int tmax;
		int ti;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f[0] = 1;
		for (i = 1;i < n;i++)
		{
			tmax = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (b[j] >= b[i] != 0 && f[j] + 1 >= tmax)
				{
					tmax = f[j] + 1;
				}
			}
			f[i] = tmax;
		}
		tmax = -1;
		for (i = 0;i < n;i++)
		{
		//	cout<<f[i]<<endl;
			if (f[i] > tmax)
			{
				tmax = f[i];
			}
		}

		System.out.print(tmax);
		System.out.print("\n");
		return 0;
	}

}

