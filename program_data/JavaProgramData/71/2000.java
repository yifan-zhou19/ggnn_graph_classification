package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int y;
	int n;
	int m1;
	int m2;
	int[] e1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] e2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] f1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int[] f2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	for (i = 0;i < 12;i++)
	{
		for (j = 0;j < i;j++)
		{
				f1[i] += e1[j];
				f2[i] += e2[j];
		}
	}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				int t1 = (f1[m1 - 1] - f1[m2 - 1] >= 0)?(f1[m1 - 1] - f1[m2 - 1]):(f1[m2 - 1] - f1[m1 - 1]);
				if (t1 % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				int t2 = (f2[m1 - 1] - f2[m2 - 1] >= 0)?(f2[m1 - 1] - f2[m2 - 1]):(f2[m2 - 1] - f2[m1 - 1]);
				if (t2 % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		return 0;
	}

}

