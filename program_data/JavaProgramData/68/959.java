package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int x;
	public static int[] a = new int[1001];

	public static int Main()
	{
		int sushu = int n;
		void jiafa(int x);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j += 2)
		{
			jiafa(j);
		}
		return 0;
	}

	public static int sushu(int n)
	{
		if (n % 2 == 1)
		{
			for (k = 3;k <= Math.sqrt(n);k += 2)
			{
				if (n % k == 0)
				{
					return 0;
				}
			}
				return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void jiafa(int n)
	{
		for (i = 3;i <= n / 2;i += 2)
		{
			if (sushu(i) != 0)
			{
				if (sushu(n - i) != 0)
				{
					System.out.printf("%d=%d+%d\n",n,i,n - i);
					break;
				}
			}
		}
	}

}

