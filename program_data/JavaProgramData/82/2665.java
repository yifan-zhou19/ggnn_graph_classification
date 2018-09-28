package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int i;
		int j = 0;
		int max = 0;
		int n;
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (x <= 140 && x >= 90 && y <= 90 && y >= 60)
		{
		j = j + 1;
		}
		else
		{
			if (j > max)
			{
				max = j;
			}
		j = 0;
		}
		}
		if (j > max)
		{
		System.out.printf("%d",j);
		}
		else
		{
			System.out.printf("%d",max);
		}
	}
}

