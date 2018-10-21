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
				if (x >= a[i] != 0 && t < max(a, i))
				{
					t = max(a, i);
				}
			}
			return (t + 1);
		}
	}
	public static int[] s = new int[30];
	public static void Main()
	{
		int[] a = new int[100];
		int k;
		int i;
		int n;
		for (i = 0;i < 30;i++)
		{
			s[i] = 1;
		}
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

