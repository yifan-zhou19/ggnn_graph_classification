package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int[] y = new int[201];
		int[] m = new int[201];
		int[] d = new int[201];
		int sum = 0;
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
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			if ((y[i] % 4 == 0 && y[i] % 100 != 0) || (y[i] % 400 == 0))
			{
					days[2] = 29;
			}
			else
			{
				days[2] = 28;
			}
			if (m[i] < d[i])
			{
				for (j = m[i];j < d[i];j++)
				{
					sum = sum + days[j];
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
			else if (m[i] > d[i])
			{
				for (j = d[i];j < m[i];j++)
				{
					sum = sum + days[j];
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
		}
		return 0;
	}
}

