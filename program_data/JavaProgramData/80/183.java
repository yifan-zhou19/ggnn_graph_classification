package <missing>;

public class GlobalMembers
{
	public static int days(int x,int y,int z)
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int d = 0;
		for (i = 1;i <= (x - 1);i++)
		{
			   if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			   {
				   d = d + 366;
			   }
			   else
			   {
				   d = d + 365;
			   }
		}
		if (y == 1)
		{
			d = d + z;
		}
		else if (y == 2)
		{
			d = d + 31 + z;
		}
		else if (y > 2)
		{
			   for (i = 1;i <= y - 1;i++)
			   {
				   d = d + a[i];
			   }
			   if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
			   {
				   d = d + 1 + z;
			   }
			   else
			   {
				   d = d + z;
			   }
		}
		return (d);
	}

	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int days = new int(int x,int y,int z);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		a = days(sy, sm, sd);
		b = days(ey, em, ed);
		System.out.printf("%d",b - a);
	}

}

