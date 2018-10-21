package <missing>;

public class GlobalMembers
{
	public static int s(int[] f, int n)
	{
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += f[i];
		}
		return sum;
	}
	public static int dis(int x,int n,int sum)
	{
		int tp;
		if ((x * n) > sum)
		{
			tp = x * n - sum;
		}
		else
		{
			tp = sum - x * n;
		}
		return tp;
	}
	public static int max_d(int[] d, int n, int sum)
	{
		int i;
		int tp;
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		return max;
	}
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
		int sum;
		int l;
		int[] f = new int[300];
		int[] d = new int[300];
		int[] out = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f[i] = Integer.parseInt(tempVar2);
			}
		}
		sum = s(f, n);
		for (i = 0;i < n;i++)
		{
			d[i] = dis(f[i], n, sum);
		}
		l = max_d(d, n, sum);
		for (i = 0;i < n;i++)
		{
			if ((f[i] * n < sum) && (d[i] == l))
			{
				out[j] = f[i];
				j++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((f[i] * n > sum) && (d[i] == l))
			{
				out[j] = f[i];
				j++;
			}
		}
		System.out.printf("%d",out[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",out[i]);
		}
	}
}

