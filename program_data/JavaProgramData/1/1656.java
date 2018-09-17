package <missing>;

public class GlobalMembers
{
	public static int meide(int x,int y)
	{
		int sum = 1;
		int count = 0;
		int i;
		for (i = y;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				sum = sum + meide(x / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (m = 0;m < k;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n >= 3)
			{
				System.out.printf("%d\n",meide(n, 2));
			}
			else
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}



}

