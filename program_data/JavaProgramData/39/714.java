package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[35];
	//		int sum;
	//	};
		stu[] m = tangible.Arrays.initializeWithDefaultstuInstances(102);
		stu temp = new stu();
		int i;
		int j;
		int k;
		int n;
		char a;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu[] p = new stu(m);
		stu q;
		for (;p < m + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				i = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				j = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				k = Integer.parseInt(tempVar7);
			}
			p.sum = 0;
			if (i > 80 && k > 0)
			{
				p.sum += 8000;
			}
			if (i > 85 && j > 80)
			{
				p.sum += 4000;
			}
			if (i > 90)
			{
				p.sum += 2000;
			}
			if (i > 85 && b == 'Y')
			{
				p.sum += 1000;
			}
			if (a == 'Y' && j > 80)
			{
				p.sum += 850;
			}
		}
		p = m;
		i = 0;
		i = p.sum;
		for (q = p + 1;q < m + n;q++)
		{
			i += q.sum;
			if (p.sum < q.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*p;
				temp.copyFrom(p);
				p[0] = q;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *q=temp;
				q.copyFrom(temp);
			}
		}
		System.out.printf("%s\n%d\n%d\n",m.name,m.sum,i);
		return 0;
	}
}

