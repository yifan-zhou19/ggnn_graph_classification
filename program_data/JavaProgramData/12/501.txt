package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[16];
	public static int n = 0;
	public static int do_LB()
	{
		int i;
		int j;
		int c = 0;
		for (i = 0; i < n; ++i)
		{
			for (j = i + 1; j < n; ++j)
			{
				if (a[i] == a[j] + a[j] || a[j] == a[i] + a[i])
				{
					c++;
				}
			}
		}
		n = 0;
		return c;
	}
	public static int Main()
	{
		int cin;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				cin = Integer.parseInt(tempVar);
			}
			if (cin == -1)
			{
				return;
			}
			if (cin == 0)
			{
				System.out.printf("%d\n", do_LB());
			}
			a[n++] = cin;
		}while (1 != 0);

	}

}

