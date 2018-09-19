package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = -1;
		int b = -1;
		int c;
		int d;
		int x;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				if (x == 0)
				{
					c = i;
					d = j;
					if ((a == -1) && (b == -1))
					{
						a = i;
						b = j;
					}
				}
			}
		}
		x = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",x);
		return 0;
	}
}

