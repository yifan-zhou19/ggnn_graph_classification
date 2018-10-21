package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int yu;
	//		int shu;
	//		char name[6];
	//	};
		stu[] s = tangible.Arrays.initializeWithDefaultstuInstances(100000);
		stu one = new stu();
		stu two = new stu();
		stu three = new stu();
		one.yu = 0;
		one.shu = 0;
		two.yu = 0;
		two.shu = 0;
		three.yu = 0;
		three.shu = 0;
		int n;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[j].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[j].yu = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[j].shu = tempVar4;
			}
		}
		for (j = 0;j < n;j++)
		{
			if ((s[j].yu + s[j].shu) > (one.yu + one.shu))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: one=s[j];
				one.copyFrom(s[j]);
				k = j;
			}
		}
		s[k].yu = 0;
		s[k].shu = 0;
		for (j = 0;j < n;j++)
		{
			if ((s[j].yu + s[j].shu) > (two.yu + two.shu))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: two=s[j];
				two.copyFrom(s[j]);
				k = j;
			}
		}
		s[k].yu = 0;
		s[k].shu = 0;
		for (j = 0;j < n;j++)
		{
			if ((s[j].yu + s[j].shu) > (three.yu + three.shu))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: three=s[j];
			three.copyFrom(s[j]);
			}
		}
		System.out.printf("%s %d\n%s %d\n%s %d\n",one.name,one.yu + one.shu,two.name,two.yu + two.shu,three.name,three.yu + three.shu);
		return 0;
	}
}

