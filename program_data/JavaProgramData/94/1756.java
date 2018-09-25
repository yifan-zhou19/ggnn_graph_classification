package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an = new int[500];
		int n;
		int i;
		int max = 1;
		int point = 1;
		char x;
		x = ',';
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
				an[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (an[i] > max && an[i] % 2 == 1)
			{
				max = an[i];
			}
		}
		while (point <= max - 2)
		{
			for (i = 0;i < n;i++)
			{
				if (an[i] == point)
				{
					System.out.printf("%d%c",an[i],x);
					break;
				}
			}
			point += 2;
		}
		for (i = 0;i < n;i++)
		{
			if (an[i] == point)
			{
				System.out.printf("%d",an[i]);
				break;
			}
		}
		return 0;
	}

}

