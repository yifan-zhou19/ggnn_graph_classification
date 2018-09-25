package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int i = x;
		int j = y;
		while (i != 0 && j != 0)
		{
			if (i == j)
			{
				break;
			}
			else if (i > j)
			{
				i = i / 2;
			}
			else
			{
				j = j / 2;
			}
		}
		System.out.printf("%d\n",i);
	}
}

