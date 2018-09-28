package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] a = new int[200];
			int[] b = new int[200];
			int[] c = new int[200];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			int[] yue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int sum = 0;
			if (runnian(a[i]) != 0)
			{
				yue[1] = 29;
			}
			int max;
			int min;
			if (b[i] < c[i])
			{
				max = c[i];
				min = b[i];
			}
			if (b[i] > c[i])
			{
				max = b[i];
				min = c[i];
			}
			for (j = min - 1;j < max - 1;j++)
			{
				sum += yue[j];
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

