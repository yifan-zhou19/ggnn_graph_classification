package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum;
		sum = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
			{
				break;
			}
			else
			{
			sum = (60 - c) + (60 - b - 1) * 60 + (12 - a - 1) * 60 * 60 + f + e * 60 + d * 60 * 60;
			System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}

}

