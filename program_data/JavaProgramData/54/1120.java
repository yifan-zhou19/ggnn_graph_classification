package <missing>;

public class GlobalMembers
{
	public static int minnum(int n,int k)
	{
		int i = 1;
		double a;
		while (true)
		{
			int x = 1;
			a = i * n + k;
			while (x < n)
			{
				a = a * n / (n - 1) + k;
				x++;
				if ((int)a != a)
				{
					break;
				}
			}
			i++;
			if ((int)a == a)
			{
				break;
			}
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int sum;
		sum = minnum(n, k);
		System.out.printf("%d\n",sum);
		return 0;
	}
}

