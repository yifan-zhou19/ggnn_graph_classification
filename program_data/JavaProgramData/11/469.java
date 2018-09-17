package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int[] e = new int[12];
		int i;
		e[1] = e[3] = e[5] = e[7] = e[8] = e[10] = e[12] = 31;
		e[2] = 28;
		e[4] = e[6] = e[9] = e[11] = 30;
		d = 0;
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
		if ((a % 4 != 0) || (a % 100 == 0 && a % 400 != 0))
		{
			for (i = 1;i < b;i++)
			{
				d = d + e[i];
			}
			d = d + c;
		}
		else if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			for (i = 1;i < b;i++)
			{
				e[2] = 29;
				d = d + e[i];
			}
			d = d + c;
		}
		System.out.printf("%d",d);
		return 0;
	}
}

