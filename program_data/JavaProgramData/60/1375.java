package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int flag = 0;
		int sushu = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 4;a <= n;a++)
		{
					if (sushu(a) == 1 && sushu(a - 2) == 1)
					{
					System.out.printf("%d %d\n",a - 2,a);
					flag = 1;
					}
		}
		if (flag == 0)
		{
		System.out.print("empty\n");
		}
		return 0;
	}
	public static int sushu(int x)
	{
		int k = 1;
		double t = Math.sqrt(x);
		for (int i = 2;i <= t;i++)
		{
			if (x % i == 0)
			{
			k = 0;
			}
		}
		return k;
	}

}

