package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int sum = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				sum = 0;
				p = i;
				while (p > 0)
				{
					sum = sum * 10 + p % 10;
					p = p / 10;
				}

				if (sum == i)
				{
					q = q + 1;
				  if (q == 1)
				  {
					System.out.printf("%d",i);
				  }
				  if ((q != 1) && (q != 0))
				  {
					  System.out.printf(",%d",i);
				  }

				}
			}
		}

		if (q == 0)
		{
			System.out.print("no");
		}
	}

}

