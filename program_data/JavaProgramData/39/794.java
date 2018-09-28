public class Student
{
		public String name = new String(new char[30]);
	 public int q;
	 public int b;
	 public char s;
	 public char x;
	 public int w;
	 public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100);
		Student temp = new Student();
		int n;
		int sum = 0;
		int i;
		int j;
		int k;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].q = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].s = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].w = Integer.parseInt(tempVar7);
			}
			stu[i].money = 0;
			if (stu[i].q > 80 && stu[i].w > 0)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].q > 85 && stu[i].b > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].q > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].q > 85 && stu[i].x == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].b > 80 && stu[i].s == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		for (i = 0;i < n;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
			if (stu[j].money > stu[k].money)
			{
				k = j;
			}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[k];
			temp.copyFrom(stu[k]);
			stu[k] = stu[i];
			stu[i] = temp;
		}
		System.out.printf("%s\n%d\n%d\n",stu[0].name,stu[0].money,sum);
		return 0;
	}

}

