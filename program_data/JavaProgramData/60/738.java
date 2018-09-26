package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
	  int q;
	  int w;
	  int e = 0;

		for (q = 1;q <= x;q++)
		{
			if (x % q == 0)
			{
				e++;
			}
		}
		if (e == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int t = 0;
		int l = 0;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz[0] = 1;
		for (i = 1;i <= n;i++)
		{
			if (sushu(i) != 0)
			{
				t++;
				sz[t] = i;
			}
		}
		for (j = 0;j < t;j++)
		{
			if (sz[j + 1] - sz[j] == 2)
			{
				System.out.printf("%d %d\n",sz[j],sz[j + 1]);
				l++;
			}
		}
		if (l == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

