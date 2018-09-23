package <missing>;

public class GlobalMembers
{
	public static int max(int[] s, int n)
	{
		int i;
		int d = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] > d)
			{
				d = s[i];
			}
		}
		return d;
	}
	public static void bl(int[] h, int[] s, int m)
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			if (i == 0)
			{
				s[i] = 1;
			}
			else
			{
				s[i] = 1;
				for (j = 0;j < i;j++)
				{
					if (h[j] >= h[i] != 0 && (s[j] + 1) > s[i])
					{
						s[i] = s[j] + 1;
					}
				}
			}
		}
	}
	public static void Main()
	{
		int r;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] h = new int[26];
		int[] d = new int[26];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		bl(h, d, n);
		r = max(d, n);
		System.out.printf("%d",r);
	}

}

