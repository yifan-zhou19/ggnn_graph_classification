package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		for (k = 3;k <= n - 2;k = k + 2)
		{
			for (a = 2;a <= Math.sqrt(k);a++)
			{
			if (k % a == 0)
			{
			break;
			}
			}
			if (a > Math.sqrt(k))
			{
			p = k + 2;
			}
			for (b = 2;b <= Math.sqrt(p);b++)
			{
			if (p % b == 0)
			{
			break;
			}
			}
			if (b > Math.sqrt(p))
			{
			System.out.printf("%d %d\n",k,p);
			}
		}
	}
}

