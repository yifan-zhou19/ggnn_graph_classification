package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] area = new int[1000][1000];
	int i;
	int j;
	int n;
	int i1;
	int j1;
	int i2;
	int a;
	int b;
	int j2;
	int J1 = 0;
	int J2 = 0;
	int I1 = 0;
	int I2 = 0;
	int GESHU;
	GESHU = 0;
	a = 1;
	b = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(area[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i1 = 0;i1 < n;i1++)
		{
			for (j1 = 0;j1 < n;j1++)


			{
				if (area[i1][j1] == 0 && a == 1)
				{
				a = 2;
	J1 = j1;
	I1 = i1;
				}
			}
		}

		for (i2 = n - 1;i2 >= 0;i2--)
		{
			for (j2 = n - 1;j2 >= 0;j2--)
			{
					if (area[i2][j2] == 0 && b == 1)
					{
		J2 = j2;
	I2 = i2;
	b = 2;
					}
			}
		}
	GESHU = (J2 - J1 + 1) * (I2 - I1 + 1) - 2 * (J2 - J1 + I2 - I1 + 2) + 4;
	System.out.printf("%d",GESHU);
	return 0;
	}



}

