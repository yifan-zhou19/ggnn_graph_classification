package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] start = new int[50000];
		int[] end = new int[50000];
		int st = 10000;
		int e = 0;
		int i;
		int point = 0;
		double j;
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
				start[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
			if (start[i] < st)
			{
				st = start[i];
			}
			if (end[i] > e)
			{
				e = end[i];
			}
		}
		for (j = st + 0.5;j < e;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j > start[i] && j < end[i])
				{
					point++;
					break;
				}
			}
		}
		if (point == e - st)
		{
			System.out.printf("%d %d",st,e);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

