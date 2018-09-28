package <missing>;

public class GlobalMembers
{
	public static int apple(int n, int k)
	{
		int[] num = new int[50];
		int i;
		int j;
		int a;
		for (i = 1;;i++)
		{
			num[1] = i * n + k;
			for (j = 1;j < n;j++)
			{
				if (num[j] % (n - 1) != 0)
				{
					a = 0;
					break;
				}
				num[j + 1] = num[j] / (n - 1) * n + k;
				a = 1;
			}
			if (a == 1)
			{
				break;
			}
		}

		return num[n];
	}

	public static void Main(String[] args)
	{
		int m;
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
		m = apple(n, k);
		System.out.printf("%d\n",m);

	}
}

