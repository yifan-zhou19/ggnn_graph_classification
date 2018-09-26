package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int a;
	//		int b;
	//		char c;
	//		char d;
	//		int e;
	//		int sum;
	//	};
		stu s1 = new stu();
		stu s2 = new stu();
		int n;
		int i;
		int zong;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1.name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s1.a = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			s1.b = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			s1.c = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			s1.d = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			s1.e = tempVar7;
		}
			s1.sum = 0;
			if (s1.a > 80 && s1.e > 0)
			{
				s1.sum += 8000;
			}
			if (s1.a > 85 && s1.b > 80)
			{
				s1.sum += 4000;
			}
			if (s1.a > 90)
			{
				s1.sum += 2000;
			}
			if (s1.a > 85 && s1.d == 'Y')
			{
				s1.sum += 1000;
			}
			if (s1.b > 80 && s1.c == 'Y')
			{
				s1.sum += 850;
			}
			zong = s1.sum;
		for (i = 1;i < n;i++)
		{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				s2.name = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				s2.a = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				s2.b = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				s2.c = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				s2.d = tempVar12;
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				s2.e = tempVar13;
			}
			s2.sum = 0;
			if (s2.a > 80 && s2.e)
			{
				s2.sum += 8000;
			}
			if (s2.a > 85 && s2.b > 80)
			{
				s2.sum += 4000;
			}
			if (s2.a > 90)
			{
				s2.sum += 2000;
			}
			if (s2.a > 85 && s2.d == 'Y')
			{
				s2.sum += 1000;
			}
			if (s2.b > 80 && s2.c == 'Y')
			{
				s2.sum += 850;
			}
			zong = zong + s2.sum;
			if (s2.sum > s1.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s2;
			s1.copyFrom(s2);
			}
		}
		System.out.printf("%s\n%d\n%d",s1.name,s1.sum,zong);
	return 0;
	}

}

