package <missing>;

public class GlobalMembers
{
	public static int a(int n,int k,int i,int sum)
	{
		if (i == n)
		{
			sum = n * sum + k;
		}
		else if (sum % (n - 1) == 0)
		{
			sum = n * (sum) / (n - 1) + k;
		}
		else
		{
			return 0;
		}
		if (i == 1)
		{
			return sum;
		}
		else
		{
			sum = a(n, k, i - 1, sum);
		}
			return sum;
	}
	public static int Main()
	{
		int n;
		int k;
		int sum = 0;
		int su = 1;
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
		if (k >= n)
		{
			System.out.print("wrong!");
		}
		do
		{
		sum = a(n, k, n, su++);
		}while (sum == 0);
		System.out.printf("%ld",sum);
		return 0;
	}
}

