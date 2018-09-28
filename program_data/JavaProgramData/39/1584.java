public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char xibu;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
		int f = struct student s;
		int n;
		int i;
		int[] a = new int[100];
		int max;
		int count = 0;
		int m = 0;
		int k = 0;
		int sum = 0;
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
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = f(stu[i]);
		}
		for (i = 0;i < n;i++)
		{
	  sum = sum + a[i];
		}
		max = a[0];
		for (i = 0;i < n;i++)
		{
		  if (a[i] > max)
		  {
			  max = a[i];
		  m = i;
		  }
		}
		  for (i = 0;i < n;i++)
		  {
			  if (a[i] == max)
			  {
			  count++;
			  }
		  }
			  if (count == 1)
			  {
				  System.out.printf("%s\n%d\n%d",stu[m].name,max,sum);
			  }
		 else
		 {
			 for (i = 0;i < n;i++)
			 {
			 if (a[i] == max)
			 {
				 System.out.printf("%s\n%d\n%d",stu[i].name,max,sum);
			 break;
			 }
			 }
		 }
			 return 0;

	}
		public static int f(student s)
		{
			int sum = 0;
		if (s.qimo > 80 && s.paper >= 1)
		{
			sum = sum + 8000;
		}
		if (s.qimo > 85 && s.banji > 80)
		{
			sum = sum + 4000;
		}
		if (s.qimo > 90)
		{
			sum = sum + 2000;
		}
		if (s.qimo > 85 && s.xibu == 'Y')
		{
			sum = sum + 1000;
		}
		if (s.banji > 80 && s.ganbu == 'Y')
		{
			sum = sum + 850;
		}
		return sum;
		}
}

