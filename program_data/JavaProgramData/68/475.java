package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int p = 1;
		for (int i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				p = 0;
			}
		}
		return p;
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("6=3+3");
		for (i = 8;i <= n;i = i + 2)
		{
			for (k = 3;;k = k + 2)
			{
				a = prime(k);
				b = prime(i - k);
				if (a == 1 && b == 1)
				{
					System.out.printf("\n%d=%d+%d",i,k,(i - k));
					break;
				}
			}
		}
	}
}

