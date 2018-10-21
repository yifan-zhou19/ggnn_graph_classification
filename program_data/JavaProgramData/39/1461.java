public class student
{
	public String name = new String(new char[20]);
	public int qm;
	public int bj;
	public char gb;
	public char xb;
	public int lw;
	public int jj;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
		char c;
		int n;
		int i;
		int j;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct student *pstu=stu,e;
		student[] pstu = new student(stu);
		student e = new student();
		pstu = stu[0];

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
			stu[i].qm = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu[i].bj = Integer.parseInt(tempVar4);
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
			stu[i].jj = 0;
		if (stu[i].qm > 80 && stu[i].lw >= 1)
		{
			stu[i].jj += 8000;
		}
		if (stu[i].qm > 85 && stu[i].bj > 80)
		{
			stu[i].jj += 4000;
		}
		if (stu[i].qm > 90)
		{
			stu[i].jj += 2000;
		}
		if (stu[i].qm > 85 && stu[i].xb == 'Y')
		{
			stu[i].jj += 1000;
		}
		if (stu[i].bj > 80 && stu[i].gb == 'Y')
		{
			stu[i].jj += 850;
		}
		}

		for (j = 0;j < n;j++)
		{
						 for (i = 0;i < n - j;i++)
						 {
											if (stu[i].jj < stu[i + 1].jj)
											{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=*(pstu+i);
																	  e.copyFrom(pstu[i]);
																	  pstu[i] = (pstu + i + 1);
																	  pstu[1 + i] = e;
											}
						 }
		}

	   for (i = 0;i < n;i++)
	   {
		   sum += stu[i].jj;
	   }
	   System.out.printf("%s\n%d\n%d\n",(pstu).name,(pstu).jj,sum);
	   String tempVar8 = ConsoleInput.scanfRead();
	   if (tempVar8 != null)
	   {
		   c = tempVar8.charAt(0);
	   }
	   return 0;


	}

}

