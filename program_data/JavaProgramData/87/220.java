package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
			do
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
			if (a + b + c + d + e + f != 0)
			{
			m = (d + 12 - a) * 3600 + (e - b) * 60 + f - c;
			System.out.printf("%d\n",m);
			}
			if (a + b + c + d + e + f == 0)
			{
				continue;
			}
			} while (a + b + c + d + e + f != 0);


			return 0;
	}

}

