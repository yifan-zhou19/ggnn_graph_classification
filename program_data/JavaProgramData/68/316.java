package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
			int a = 2;
			int b = 1;
			if (n % a == 0)
			{
				b = 0;
				return (b);
			}
			for (a = 3;a < Math.sqrt(n) + 1;a += 2)
			{
				if (n % a == 0)
				{
					b = 0;
					break;
				}
			}
			return (b);
	}
	public static void Main(String[] args)
	{
		int m;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (m = 6;m < p + 1;m += 2)
		{
			for (i = 3;i < m;i += 2)
			{
				if (sushu(i) == 1 && sushu(m - i) == 1)
				{
					System.out.printf("%d=%d+%d\n",m,i,m - i);
				break;
				}
			}
		}
	}


}

