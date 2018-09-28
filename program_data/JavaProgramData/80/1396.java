package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int m;
		int[][] Ori = new int[2][3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Ori[0][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			Ori[0][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			Ori[0][2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			Ori[1][0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			Ori[1][1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			Ori[1][2] = Integer.parseInt(tempVar6);
		}
		int sy;
		int sm = Ori[0][1];
		int ey = Ori[1][0];
		int em = Ori[1][1];
		for (sy = Ori[0][0];sy < Ori[1][0];sy++)
		{
			if (Ori[0][1] <= 2)
			{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 100 == 0 && sy % 400 == 0))
			{
				a += 366;
			}
			else
			{
				a += 365;
			}
			}
			else
			{
			if (((sy + 1) % 4 == 0 && (sy + 1) % 100 != 0) || ((sy + 1) % 100 == 0 && (sy + 1) % 400 == 0))
			{
				a += 366;
			}
			else
			{
				a += 365;
			}
			}
		}
		int[] D = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((Ori[0][1] < Ori[1][1]) || (Ori[0][1] == Ori[1][1] && Ori[0][2] < Ori[1][2]))
		{
			if (Ori[0][1] != Ori[1][1])
			{
				for (m = 1;m <= 12;m++)
				{
					if (m == sm && m < Ori[1][1])
					{
						a += D[m - 1];
						sm++;
					}
				}
			}
		a += (Ori[1][2] - Ori[0][2]);
		if (((ey % 4 == 0 && ey % 100 != 0) || (ey % 100 == 0 && ey % 400 == 0)) && (Ori[0][1] <= 2 && Ori[1][1]>2))
		{
			a += 1;
		}
		System.out.printf("%d",a);
		}
		else
		{
			if (Ori[0][1] != Ori[1][1])
			{
				for (m = 1;m <= 12;m++)
				{
					if (m == em && m < Ori[0][1])
					{
						a -= D[m - 1];
						em++;
					}
				}
			}
		a -= (Ori[0][2] - Ori[1][2]);
		if (((ey % 4 == 0 && ey % 100 != 0) || (ey % 100 == 0 && ey % 400 == 0)) && (Ori[1][1] <= 2 && Ori[0][1]>2))
		{
			a -= 1;
		}
		System.out.printf("%d",a);
		}
		return 0;
	}

}

