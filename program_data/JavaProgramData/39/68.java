public class student
	{
		public String name = new String(new char[20]);
		public int score1;
		public int score2;
		public char moni;
		public char west;
		public int comp;
	}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		int n;
		int sum = 0;
		int t;
		int s = 0;
		int d;
		int i;
		String nam = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = stu;p < stu + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.moni = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.comp = Integer.parseInt(tempVar7);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		for (p = stu;p < stu + n;p++)
		{
			t = 0;
		   if (p.score1 > 80 && p.comp >= 1)
		   {
			   t = t + 8000;
		   }
		   if (p.score1 > 85 && p.score2 > 80)
		   {
			   t = t + 4000;
		   }
		   if (p.score1 > 90)
		   {
			   t = t + 2000;
		   }
		   if (p.score1 > 85 && p.west == 'Y')
		   {
			   t = t + 1000;
		   }
		   if (p.score2 > 80 && p.moni == 'Y')
		   {
			   t = t + 850;
		   }
		   if (t > s)
		   {
			   s = t;
			   d = p.name.length();
			   nam = p.name;
			   for (i = d;i < 20;i++)
			   {
				   nam = nam.substring(0, i);
			   }
		   }
		   sum = sum + t;

		}
		System.out.println(nam);

		System.out.printf("%d\n%d",s,sum);

	}
}

