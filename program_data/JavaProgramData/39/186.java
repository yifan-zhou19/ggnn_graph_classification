public class student
{
	public String name = new String(new char[30]);
	public int examgrade;
	public int appgrade;
	public char a;
	public char b;
	public int thesis;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int temp;
		int sum = 0;
		int max = 0;
		int[] money = new int[100];
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				stu[i].examgrade = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].appgrade = Integer.parseInt(tempVar4);
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].thesis = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].examgrade > 80)
			{
				if (stu[i].thesis >= 1)
				{
					money[i] = money[i] + 8000;
				}
				if (stu[i].examgrade > 85)
				{
					if (stu[i].appgrade > 80)
					{
						money[i] = money[i] + 4000;
					}
					if (stu[i].examgrade > 90)
					{
						money[i] = money[i] + 2000;
					}
					if (stu[i].b == 'Y')
					{
						money[i] = money[i] + 1000;
					}
				}
			}
			if (stu[i].a == 'Y' && stu[i].appgrade > 80)
			{
				money[i] = money[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + money[i];
			if (money[i] > max)
			{
				max = money[i];
				temp = i;
			}
		}
		System.out.printf("%s\n",stu[temp].name);
		System.out.printf("%d\n%d",max,sum);
	}
}

