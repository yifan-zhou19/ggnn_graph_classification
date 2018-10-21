package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		float x;
		float y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		x = b / (float)a;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			y = b / (float)a;
			if (y - x > 0.05F)
			{
				  c = 0;
			}
			else if (x - y > 0.05F)
			{
				  c = 1;
			}
			else
			{
				c = 2;
			}

		if (c == 0)
		{
			System.out.print("better\n");
		}
		if (c == 1)
		{
			System.out.print("worse\n");
		}
		if (c == 2)
		{
			System.out.print("same\n");
		}
		}
			return 0;
	}
}

