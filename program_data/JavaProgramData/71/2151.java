package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int y;
		int m1;
		int m2;
		int sum1 = 0;
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			int temp;
			if (m1 > m2)
			{
				temp = m1;
				m1 = m2;
				m2 = temp;
			}
			int sum1 = 0;
			for (j = m1;j < m2;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
				sum1 += 3;
				}
				 if (j == 4 || j == 6 || j == 9 || j == 11)
				 {
				sum1 += 2;
				 }
				if (j == 2 && ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)))
				{
					sum1 += 1;
				}
			}
					d = sum1 % 7;
					if (d == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}

		}
		return 0;
	}


}

