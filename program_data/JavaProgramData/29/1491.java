package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			float sum = 0F;
			float x;
			float y;
			float t;
			x = 2F;
			y = 1F;
			for (int j = 1;j <= n;j++)
			{
				if (j == 1)
				{
				sum = 2F;
				}
				else
				{
					sum = (x + y) / x + sum;
					t = x;
					x = x + y;
					y = t;
				}
			}
			System.out.printf("%.3f\n",sum);
			sum = 0F;
		}
	}

}

