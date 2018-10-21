package <missing>;

public class GlobalMembers
{
	public static float a(int x)
	{
		if (x == 1)
		{
			return 2F;
		}
		else if (x == 2)
		{
			return 3F;
		}
		else
		{
			return a(x - 1) + a(x - 2);
		}
	}
	public static float b(int y)
	{
		if (y == 1)
		{
			return 1F;
		}
		else if (y == 2)
		{
			return 2F;
		}
		else
		{
			return b(y - 1) + b(y - 2);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < 1 + n;j++)
			{
				sum += a(j) / b(j);
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

