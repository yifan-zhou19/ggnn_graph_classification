public class student
{
	public String name = new String(new char[20]);
	public int grade1;
	public int grade2;
	public char gb;
	public char xb;
	public int lunwen;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static student t = new student();
	public static void Main()
	{
		int n;
		int i;
		int[] jj = new int[100];
		int maxjj;
		int sum = 0;
		int j;
		int k;
		String maxname = new String(new char[20]);
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
				stu[i].grade1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].grade2 = Integer.parseInt(tempVar4);
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
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].grade1 > 80 && stu[i].lunwen >= 1)
			{
				jj[i] = jj[i] + 8000;
			}
			if (stu[i].grade1 > 85 && stu[i].grade2 > 80)
			{
				jj[i] = jj[i] + 4000;
			}
			if (stu[i].grade1 > 90)
			{
				jj[i] = jj[i] + 2000;
			}
			if (stu[i].grade1 > 85 && stu[i].xb == 'Y')
			{
				jj[i] = jj[i] + 1000;
			}
			if (stu[i].grade2 > 80 && stu[i].gb == 'Y')
			{
				jj[i] = jj[i] + 850;
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (jj[i] < jj[i + 1])
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[i];
					t.copyFrom(stu[i]);
					stu[i] = stu[i + 1];
					stu[i + 1] = t;
					k = jj[i];
					jj[i] = jj[i + 1];
					jj[i + 1] = k;
				}
			}
		}
		maxjj = jj[0];
		maxname = stu[0].name;
		for (i = 0;i < n;i++)
		{
			sum = sum + jj[i];
		}
		System.out.printf("%s\n",maxname);
		System.out.printf("%d\n",maxjj);
		System.out.printf("%d\n",sum);
	}





}

