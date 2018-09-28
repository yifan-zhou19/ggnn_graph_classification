package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year = int x;
		int diy = new int(int x,int y,int z);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int y1;
		int y2;
		int an;
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
	String tempVar4 = ConsoleInput.scanfRead();
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
	y1 = year(a) + diy(a, b, c);
	y2 = year(d) + diy(d, e, f);
	an = y2 - y1;
	System.out.printf("%d\n",an);
	}
	public static int year(int x)
	{
		int ay;
		int by;
		ay = (x - 1) / 4 - (x - 1) / 100 + (x - 1) / 400;
		by = 365 * (x - 1) + ay;
		return (by);
	}
	public static int diy(int x,int y,int z)
	{
		int day = 0;
		int c;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		a[1] = a[1] + c;
		if (y == 1)
		{
			day = z;
		}
		else
		{
			for (i = 0;i < y - 1;i++)
			{
				day = day + a[i];
			}
			day = day + z;
		}
		return (day);
	}
}

