package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int up;
		int down;
		int temp1;
		int temp2;
		double temp3;
		up = 2;
		down = 1;
		int n;
		int m;
		double c;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		int a7;
		int a8;
		int a9;
		int a10;
		for (int i = 0;i <= n - 1;i++)
		{
			c = (float)2 / (float)1;
			sum = c;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 1)
			{
				System.out.print("2.000\n");
			}
			else
			{
				for (a1 = 0;a1 <= m - 2;a1++)
				{
					c = 1 + 1 / c;
					sum = sum + c;
				}
			}
			if (m != 1)
			{
				System.out.printf("%.3f\n",sum);
			}
		}







	}



}

