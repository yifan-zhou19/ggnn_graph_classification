package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int v = 0;v < n;v++)
		{
			int y;
			int m1;
			int m2;
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
			if (m1 > m2)
			{
			   int t = m1;
			   m1 = m2;
			   m2 = t;
			}
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
			{
				month[2] = 29;
			}
			int mp;
			int sum = 0;
			for (mp = m1;mp < m2;mp++)
			{
			   sum = sum + month[mp];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			month[2] = 28;
		}
		System.in.read();
		System.in.read();
	}
}

