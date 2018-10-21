package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum = 0;
		for (;;)
		{
			a = b = c = d = e = f = sum = 0;
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
			if (a == 0 && b == 0 && c == 0 & d == 0 && e == 0 && f == 0)
			{
				break;
			}
				d += 12;
			if (f >= c)
			{
				sum += f - c;
			}
			else
			{
				sum += f + 60 - c;
				e -= 1;
			}
			if (e >= b)
			{
				sum += 60 * (e - b);
			}
			else
			{
				sum += 60 * (e+60 - b);
				d -= 1;
			}
			sum += 3600 * (d - a);
			System.out.printf("%d\n",sum);
		}



			return 0;

	}


}

