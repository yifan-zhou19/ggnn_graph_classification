package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		int sum = 0;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((y1 == y2) && (m1 == m2) && (d1 == d2))
		{
			System.out.print("0");
		}
		else
		{
		do
		{
			sum++;
			if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
			{
				month[2] = 29;
			}
			if (d1 < month[m1])
			{
			   d1++;
			}
			else
			{
				d1 = 1;
				if (m1 < 12)
				{
					m1++;
				}
				else
				{
				   y1++;
				   m1 = 1;
				}
			}
			month[2] = 28;
		}while (!((y1 == y2) && (m1 == m2) && (d1 == d2)));
		System.out.printf("%d",sum);
		}
		System.in.read();
		System.in.read();
	}

}

