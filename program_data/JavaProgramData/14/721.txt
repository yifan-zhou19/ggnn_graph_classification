package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int id;
		int chinese;
		int math;
		int total;

		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			total = chinese + math;
			if (total > a)
			{
				c = b;
				z = y;
				b = a;
				y = x;
				a = total;
				x = id;

			}
			else if (total <= a != 0 && total> b)
			{
				c = b;
				z = y;
				b = total;
				y = id;
			}
			else if (total <= b != 0 && total> c)
			{
				c = total;
				z = id;
			}

		}

		System.out.printf("%d %d\n",x,a);
		System.out.printf("%d %d\n",y,b);
		System.out.printf("%d %d\n",z,c);
		return 0;
	}
}

