package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int[] h = new int[26];
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static int f(int t,int l)
	{
		if (t == 1)
		{
			if (h[1] >= l)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}

		else if (h[t] < l)
		{
			return f(t - 1, l);
		}
		else
		{
			return max(f(t - 1, l), f(t - 1, h[t]) + 1);
		}

	}

		public static void Main()
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		h[i] = Integer.parseInt(tempVar2);
	}
	}

		System.out.printf("%d",f(n, 0));
		}

}

