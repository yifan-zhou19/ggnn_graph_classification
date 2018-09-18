package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char NUM[100000];
	//		int Ma;
	//		int Ch;
	//	}
	//	stu;
		int n;
		int i;
		int x;
		int max1;
		int max2;
		int max3;
		int m1;
		int m2;
		int m3;
		max1 = max2 = max3 = 0;
		m1 = m2 = m3 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.NUM = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(stu.Ma) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(stu.Ch) = tempVar4;
			}
			x = stu.Ma + stu.Ch;
			if (x > max1)
			{
			max3 = max2;
			max2 = max1;
			max1 = x;
			m3 = m2;
			m2 = m1;
			m1 = i;
			}
		else if (x == max1)
		{
			max3 = max2;
			max2 = max1;
			max1 = max1;
			m3 = m2;
			m2 = i;
		}
		else if (x < max1 && x> max2)
		{
			max3 = max2;
			max2 = x;
			m3 = m2;
		}

		else if (x == max2)
		{
			max3 = max2;
			m3 = i;
		}
		else if (x < max2 && x> max3)
		{
			max3 = x;
			m3 = i;
		}
		}

		System.out.printf("%d %d\n",m1,max1);
		System.out.printf("%d %d\n",m2,max2);
		System.out.printf("%d %d\n",m3,max3);
		return 0;
	}

}

