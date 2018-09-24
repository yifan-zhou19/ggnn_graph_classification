public class student
{
	public String name = new String(new char[20]);
   public int s1;
   public int s2;
   public char a;
   public char b;
   public int num;
   public int bonus;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int i;
		int k = 0;
		int amount = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].num = Integer.parseInt(tempVar7);
			}


			if (stu[i].s1 > 80 && stu[i].num >= 1)
			{
				stu[i].bonus += 8000;
			}
			if (stu[i].s1 > 85 && stu[i].s2 > 80)
			{
				stu[i].bonus += 4000;
			}
			if (stu[i].s1 > 90)
			{
				stu[i].bonus += 2000;
			}
			if (stu[i].s1 > 85 && stu[i].b == 'Y')
			{
				stu[i].bonus += 1000;
			}
			if (stu[i].s2 > 80 && stu[i].a == 'Y')
			{
				stu[i].bonus += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
		amount = amount + stu[i].bonus;
		}
		for (i = 1;i < n;i++)
		{

		   if (stu[k].bonus < stu[i].bonus)
		   {
			  k = i;
		   }
		}

		System.out.printf("%s\n",stu[k].name);
		System.out.printf("%d\n",stu[k].bonus);
		System.out.printf("%d",amount);
			return 0;
	}


}

