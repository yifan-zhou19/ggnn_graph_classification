package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int mbx = 0;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i >= 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			i--;
			if (i >= 0)
			{
				if (max > x && mbx < x)
				{
					mbx = x;
				}
				else if (mbx > x)
				{
					;
				}
				else if (max < x)
				{
					mbx = max;
					max = x;
				}
			}
		}
			System.out.printf("%d\n%d\n",max,mbx);
		return 0;
	}
}

