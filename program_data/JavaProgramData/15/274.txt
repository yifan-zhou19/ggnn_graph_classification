package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int x1;
		int y1;
		int x2;
		int y2;
		int k;
		int i;
		int j;
		int x;
		for (i = 1;i <= n * n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}

			if (x == 0)
			{
			   break;
			}




		}
		for (j = 1;j <= n * n - i;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			if (x == 0)
			{
			k = j + i;
			}
		}
		x1 = (int)(i / n) + 1,y1 = i % n;
		x2 = (int)(k / n) + 1,y2 = k % n;
		int m;
		m = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",m);
		return 0;
	}


}

