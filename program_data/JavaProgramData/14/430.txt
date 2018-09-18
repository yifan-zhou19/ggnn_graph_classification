package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int chi;
	//		int ma;
	//		int sum;
	//		int i;
	//	};
		stu[] m = tangible.Arrays.initializeWithDefaultstuInstances(100000);
		stu temp = new stu();
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu[] p = new stu(m);
		stu q;
		for (;p < m + n;p += 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.i = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.ma = tempVar4;
			}
			p.sum = p.chi + p.ma;
		}
		for (p = m;p < m + n - 1;p++)
		{
			for (q = p + 1;q < m + n;q++)
			{
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
			if (p == m + 2)
			{
				break;
			}
		} // max is m[0]
		for (p = m;p < m + 3;p++)
		{
			System.out.printf("%d %d\n",p.i,p.sum);
		}
		return 0;
	}
}

