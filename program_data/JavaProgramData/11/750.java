package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
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
		if (b >= 2)
		{
			d = d + 31;
		}
		if (b >= 3)
		{
			d = d + 28;
		}
		if (b >= 4)
		{
			d = d + 31;
		}
		if (b >= 5)
		{
			d = d + 30;
		}
		if (b >= 6)
		{
			d = d + 31;
		}
		if (b >= 7)
		{
			d = d + 30;
		}
		if (b >= 8)
		{
			d = d + 31;
		}
		if (b >= 9)
		{
			d = d + 31;
		}
		if (b >= 10)
		{
			d = d + 30;
		}
		if (b >= 11)
		{
			d = d + 31;
		}
		if (b >= 12)
		{
			d = d + 31;
		}
		d = d + c;
		if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && b > 2)
		{
			d = d + 1;
		}
		System.out.printf("%d",d);
	}

}

