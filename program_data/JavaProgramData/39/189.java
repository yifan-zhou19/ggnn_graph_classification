public class student
{
	public String s = new String(new char[21]);
	public int a;
	public int b;
	public char m;
	public char p;
	public int c;
	public int q;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		student l = new student();
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
				stu[i].s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].m = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].p = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].c = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
				stu[i].q = 0;
				if ((stu[i].a > 80) && (stu[i].c > 0))
				{
					stu[i].q += 8000;
				}
				if ((stu[i].a > 85) && (stu[i].b > 80))
				{
					stu[i].q += 4000;
				}
				if (stu[i].a > 90)
				{
					stu[i].q += 2000;
				}
				if ((stu[i].a > 85) && (stu[i].p == 'Y'))
				{
					stu[i].q += 1000;
				}
				if ((stu[i].b > 80) && (stu[i].m == 'Y'))
				{
					stu[i].q += 850;
				}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
			 if (stu[i + 1].q > stu[i].q)
			 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: l=stu[i];
			 l.copyFrom(stu[i]);
			 stu[i] = stu[i + 1];
			 stu[i + 1] = l;
			 }
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 sum += stu[i].q;
		 }
	System.out.printf("%s",stu[0].s);
	System.out.printf("\n%d\n",stu[0].q);
	System.out.printf("%d",sum);
	}
}

