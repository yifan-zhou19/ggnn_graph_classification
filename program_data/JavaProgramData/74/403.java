package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int i;
		int t;
		t = 1;
		for (i = 2;i <= k / 2;i++)
		{
			if (t == 1)
			{
				if (k % i == 0)
				{
					t = 0;
				}
			}
		}
		return (t);
	}
	public static int hw(int k)
	{
		int[] a = new int[10];
		int i;
		int len = 1;
		int ws;
		int t = 1;
		int n;
		for (i = 1;!(k / len > 0 && k / (len * 10) == 0);i++)
		{
			len *= 10;
		}
		ws = i;
		for (i = 1;i <= ws / 2 && t == 1;i++)
		{
			n = k / len;
			if (k % 10 != n)
			{
				t = 0;
			}
			k = k - n * len;
			k = k / 10;
			len /= 100;
		}
		return (t);
	}

	public static void Main()
	{
		int m;
		int n;
		int k;
		int bg;
		int[] ans = new int[1000];
		int j = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m >= 2)
		{
			bg = m;
		}
		else
		{
			bg = 2;
		}
		for (k = bg;k <= n;k++)
		{
			if (sushu(k) != 0 && hw(k) != 0)
			{
				ans[j++] = k;
			}
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",ans[i]);
			}
			System.out.printf("%d\n",ans[j - 1]);
		}
	}

}

