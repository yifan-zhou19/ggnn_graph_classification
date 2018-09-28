package <missing>;

public class GlobalMembers
{
	public static int first(int n,int k)
	{
		int total;
		int i;
		int j;
		int cons;
		for (i = 1;;i++)
		{
			total = i * n + k * n;
			for (j = 1;j < n;j++)
			{
				total = total * n / (n - 1);
				if (total % n != 0)
				{
					break;
				}
			}
			if (j == n)
			{
				cons = i * n + k;
				break;
			}
		}
		return cons;
	}
	public static int houzi(int n,int k,int m)
	{
		int num;
		if (n != 1)
		{
			num = (houzi(n - 1, k, m)) * m / (m - 1) + k;
		}
		if (n == 1)
		{
			num = first(m, k);
		}
		return num;
	}
	public static void Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",houzi(n, k, n));
	}
}

