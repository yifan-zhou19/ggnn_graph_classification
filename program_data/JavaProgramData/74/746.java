package <missing>;

public class GlobalMembers
{
	public static int A(int k)
	{
		int i;
		for (i = 2;i < k;i++)
		{
			if (k % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int B(int k)
	{
		int s = 0;
		int t;
		t = k;
		while (k > 0)
		{
			s = s * 10 + (k % 10);
			k /= 10;
		}
		if (s == t)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int first = 1;
		int flag = 1;
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
		for (k = m;k <= n;k++)
		{
			if (A(k) != 0 && B(k) != 0)
			{
				if (first != 0)
				{
					System.out.printf("%d",k);
					first = 0;
				}
					 else
					 {
					System.out.printf(",%d",k);
					 }
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

