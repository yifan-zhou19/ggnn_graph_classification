package <missing>;

public class GlobalMembers
{
	public static double apple(float n,float k,int x,int m)
	{
		double i;
		if (x == n)
		{
			i = m * n + k;
		}
		else
		{
		i = n * apple(n, k, x + 1, m) / (n - 1) + k;
		}
		return i;
	}
	public static int Main()
	{
		float num;
		float extra;
		int j = 1;
		int i;
		int truth;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			extra = Float.parseFloat(tempVar2);
		}
		while (true)
		{
			truth = 1;
			for (i = num;i >= 1;i--)
			{
				if (apple(num, extra, i, j) - (int)apple(num, extra, i, j) != 0)
				{
					truth = 0;
					break;
				}
			}
				if (truth == 1)
				{
				System.out.printf("%d\n",(int)apple(num, extra, 1, j));
				return 0;
				}
			j++;
		}
	}

}

