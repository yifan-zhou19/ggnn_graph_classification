public class student
{
	   public String name = new String(new char[20]);
	   public int a;
	   public int b;
	   public char c1;
	   public char c2;
	   public int d;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int[] p = new int[100];
		int sum = 0;
		int max;
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
			stu[i].c1 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu[i].c2 = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu[i].d = Integer.parseInt(tempVar7);
		}
		}
		for (i = 0;i < n;i++)
		{
							  if ((stu[i].a > 80) && (stu[i].d > 0))
							  {
							  p[i] = p[i] + 8000;
							  }
							  if ((stu[i].a > 85) && (stu[i].b > 80))
							  {
							  p[i] = p[i] + 4000;
							  }
							  if (stu[i].a > 90)
							  {
							  p[i] = p[i] + 2000;
							  }
							  if ((stu[i].a > 85) && (stu[i].c2 == 'Y'))
							  {
							  p[i] = p[i] + 1000;
							  }
							  if ((stu[i].b > 80) && (stu[i].c1 == 'Y'))
							  {
							  p[i] = p[i] + 850;
							  }
							  sum = sum + p[i];
		}
		max = p[0];
	 for (i = 0;i < n;i++)
	 {
					   if (p[i] > max)
					   {
					   max = p[i];
					   }
	 }
	 for (i = 0;i < n;i++)
	 {
					   if (p[i] == max)
					   {
								   System.out.printf("%s\n",stu[i].name);
								   System.out.printf("%d\n",p[i]);
								   break;
					   }
	 }
					   System.out.printf("%d\n",sum);
					   return 0;
	}
}

