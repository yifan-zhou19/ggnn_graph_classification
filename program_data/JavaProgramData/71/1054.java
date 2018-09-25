package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m1;
		int m2;
		int n;
		int i;
		int j;
		int[] d1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] d2 = new int[12];
		int[] e1 = new int[12];
		int[] e2 = new int[12];
		for (i = 0;i < 12;i++)
		{
			if (i != 1)
			{
				d2[i] = d1[i],e1[i] = e2[i] = 0;
			}
			else
			{
				d2[i] = 28,e1[i] = e2[i] = 0;
			}
		}
		for (i = 0;i < 12;i++)
		{
			for (j = 0;j < i;j++)
			{
				e1[i] += d1[j];
				e2[i] += d2[j];
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
				int f1 = (e1[m1 - 1] >= e1[m2 - 1])?(e1[m1 - 1] - e1[m2 - 1]):(e1[m2 - 1] - e1[m1 - 1]);
				 if (f1 % 7 == 0)
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
				int f2 = (e2[m1 - 1] >= e2[m2 - 1])?(e2[m1 - 1] - e2[m2 - 1]):(e2[m2 - 1] - e2[m1 - 1]);
				if (f2 % 7 == 0)
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

