package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int n;
		int y;
		int m;
		int d;
		int x1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			days[2] = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 29 : 28;
			if (m > d)
			{
				x1 = d;
				d = m;
				m = x1;
			}
				int j;
				int sum = 0;
				for (j = m;j < d;j++)
				{
				 sum += days[j];
				}
				 if (sum % 7 == 0)
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

