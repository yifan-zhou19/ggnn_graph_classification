package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int m)
	{
		int x;
		int i;
		int t = 0;
		x = a[m];
		if (m == 1)
		{
			return (1);
		}
		else
		{
			for (i = m - 1;i > 0;i--)
			{
				if (x >= a[i])
				{
					t = 1 + max(a, i);
				}
				if (t > s[m])
				{
					s[m] = t;
				}
			}
			return (s[m]);
		}
	}
	public static int[] s = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	public static void Main()
	{
		int[] a = new int[100];
		int k;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = k;i > 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		a[k + 1] = 100000;
		n = max(a, k + 1);
		System.out.printf("%d\n",n - 1);
	}
}

