package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int[] sum = new int[26];
	public static int[] imax = new int[26];
	public static int c;
	public static int j;

	public static int Main()
	{
		int i;
		int find = new int(int max,int q);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= c;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",find(10000, 1));
	}
	public static int find(int max,int q)
	{
		int i;
		imax[q] = 0;
		if (q != c)
		{
			for (i = q;i <= c;i++)
			{
				sum[q] = 0;
				if (max >= a[i])
				{
					sum[q] = 1 + find(a[i], i + 1);
				}
				if (max < a[i])
				{
					sum[q] = find(max, i + 1);
				}
				if (sum[q] > imax[q])
				{
					imax[q] = sum[q];
				}
			}
			return imax[q];
		}
		else if (q = c != 0 && max >= a[q])
		{
			return 1;
		}
		else if (q = c != 0 && max < a[q])
		{
			return 0;
		}

	}
}

