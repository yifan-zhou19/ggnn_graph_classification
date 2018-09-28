public class list
{
		public String name = new String(new char[20]);
		public int g1;
		public int g2;
		public char gb;
		public char xb;
		public int lw;
		public int total;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		list[] stu = tangible.Arrays.initializeWithDefaultlistInstances(100);
		int all = struct list stu;
		int i;
		int k;
		int n;
		int sum = 0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].g1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].g2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].total = all(stu[i]);
			sum = sum + stu[i].total;
		}
		for (k = n - 1,i = n - 2;i >= 0;i--)
		{
			if (stu[k].total <= stu[i].total)
			{
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].name,stu[k].total,sum);
	}

	public static int all(list stu)
	{
		stu.total = 0;
		if (stu.g1 > 80 && stu.lw >= 1)
		{
			stu.total += 8000;
		}
		if (stu.g1 > 85 && stu.g2 > 80)
		{
			stu.total += 4000;
		}
		if (stu.g1 > 90)
		{
			stu.total += 2000;
		}
		if (stu.g1 > 85 && stu.xb == 'Y')
		{
			stu.total += 1000;
		}
		if (stu.g2 > 80 && stu.gb == 'Y')
		{
			stu.total += 850;
		}
		return (stu.total);
	}

}

