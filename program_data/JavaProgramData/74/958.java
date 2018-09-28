package <missing>;

public class GlobalMembers
{
	public static int sushu(int N)
	{
		int i;
		if (N == 2 || N == 3)
		{
			return 1;
		}
		else
		{
			for (i = 2;i <= Math.sqrt(N);i++)
			{
				if (N % i == 0)
				{
				 return 0;
				}
			}
				return 1;
		}
	}
	public static int huiwen(int N)
	{
		int i;
		int[] a = new int[100];
		int n;
		int m = 0;
		int p = 1;
		int t;
		n = N;
		for (i = 0;i <= 4;i++)
		{
			a[i] = N % 10;
			N = N / 10;
			if (N == 0)
			{
				t = i;
				break;
			}
		}
		for (;i >= t / 2;i--)
		{
			if (a[i] != a[t - i])
			{
			return 0;
			}
		}
			return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
				if (a == 0)
				{
					System.out.printf("%d",i);
					a = 1;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
	}
}

