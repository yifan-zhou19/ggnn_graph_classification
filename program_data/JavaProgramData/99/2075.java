package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int age;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				p1++;
			}
			if (age > 18 && age <= 35)
			{
				p2++;
			}
			if (age > 35 && age <= 60)
			{
				p3++;
			}
			if (age > 60)
			{
				p4++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\nOver60: %.2lf%%\n",(double)p1 / n * 100,(double)p2 / n * 100,(double)p3 / n * 100,(double)p4 / n * 100);
		return 0;
	}





}

