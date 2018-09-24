package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int digui = int n;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = digui(n);
		System.out.print("End\n");
	}
	public static int digui(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		else if (n % 2 == 1)
		{
			System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
			return digui(n * 3 + 1);
		}
		else if (n % 2 == 0)
		{
			System.out.printf("%d/2=%d\n",n,n / 2);
			return digui(n / 2);
		}
	}

}

