public class student
{
	public String name = new String(new char[20]);
	public int qipin;
	public int banpin;
	public char ganbu;
	public char xixue;
	public int lunwen;
	public int jj;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(struct student s[100],int n);
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

		int i;
		int m = 0;
		int sum = 0;
		int n;
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
			 stu[i].qipin = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 stu[i].banpin = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 stu[i].ganbu = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 stu[i].xixue = tempVar6.charAt(0);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 stu[i].lunwen = Integer.parseInt(tempVar7);
		 }
		 stu[i].jj = 0;
		if (stu[i].qipin > 80 && stu[i].lunwen > 0)
		{
			 stu[i].jj = stu[i].jj + 8000;
		}
		if (stu[i].qipin > 85 && stu[i].banpin > 80)
		{
			 stu[i].jj = stu[i].jj + 4000;
		}
		 if (stu[i].qipin > 90)
		 {
			stu[i].jj = stu[i].jj + 2000;
		 }
		 if (stu[i].qipin > 85 && stu[i].xixue == 'Y')
		 {
			stu[i].jj = stu[i].jj + 1000;
		 }
		  if (stu[i].banpin > 80 && stu[i].ganbu == 'Y')
		  {
		   stu[i].jj = stu[i].jj + 850;
		  }
		}

		for (i = 0;i < n;i++)
		{
		sum = sum + stu[i].jj;
		}
		m = max(stu, n);
		System.out.println(stu[0].name);
	   System.out.printf("%d\n%d\n",m,sum);
	}
	public static int max(student[] s, int n)
	{
		int i;
		int j;
		student t = new student();
	   for (i = 0;i < n - 1;i++)
	   {
				for (j = i + 1;j < n;j++)
				{
				if (s[i].jj < s[j].jj)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=s[j];
				t.copyFrom(s[j]);
				s[j] = s[i];
				s[i] = t;
				}
				}
	   }
		   return (s[0].jj);
	}



}

