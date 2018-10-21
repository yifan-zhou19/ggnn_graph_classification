package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x1 = n;

		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}

				if (a == 0 && j < x1)
				{
					x1 = j;
					y1 = i;
				}
				if (a == 0)
				{
					x2 = j;
					y2 = i;
				}
			}
		}

		int area = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n%d\n%d", area,x2 - x1 - 1, y2 - y1 - 1);


		return (0);



	}
}

