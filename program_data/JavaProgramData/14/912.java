public class stu
{
		public int id;
		public int ch;
		public int mt;
		public int total;
}

package <missing>;

public class GlobalMembers
{
		public static stu[] stu_1 = tangible.Arrays.initializeWithDefaultstuInstances(100000);
		public static stu top1 = new stu(0,0,0,0);
		public static stu top2 = new stu(0,0,0,0);
		public static stu top3 = new stu(0,0,0,0);


	public static int Main()
	{
		int n;
		int i;
		stu tem = new stu();
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
				(stu_1[i].id) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(stu_1[i].ch) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(stu_1[i].mt) = Integer.parseInt(tempVar4);
			}
			stu_1[i].total = stu_1[i].ch + stu_1[i].mt;
			if (stu_1[i].total > top1.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top3=top2;
				top3.copyFrom(top2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top2=top1;
				top2.copyFrom(top1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top1=stu_1[i];
				top1.copyFrom(stu_1[i]);
			}
			else if (stu_1[i].total > top2.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top3=top2;
				top3.copyFrom(top2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top2=stu_1[i];
				top2.copyFrom(stu_1[i]);
			}
			else if (stu_1[i].total > top3.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: top3=stu_1[i];
				top3.copyFrom(stu_1[i]);
			}
			else
			{
				;
			}
		}
			System.out.printf("%d %d\n",top1.id,top1.total);
			if ((top2.id) != 0)
			{
				System.out.printf("%d %d\n",top2.id,top2.total);
			}
			if ((top3.id) != 0)
			{
				System.out.printf("%d %d\n",top3.id,top3.total);
			}

		return 0;
	}
}

