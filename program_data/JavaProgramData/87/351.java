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
		int j = 0;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			j = 0;
			if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
			{
				break;
			}
			d += 12;
			if (f - c < 0)
			{
				e--;
				j += 60 + f - c;
			}
			else
			{
				j += f - c;
			}
			if (e - b < 0)
			{
				d--;
				j += (e - b + 60) * 60;
			}
			else
			{
				j += (e - b) * 60;
			}
			j += (d - a) * 60 * 60;
			System.out.printf("%d\n",j);
		}
		return 0;
	}
}

