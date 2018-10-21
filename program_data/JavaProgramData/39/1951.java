public class student
{
public String name = new String(new char[20]);
public int a1;
public int a2;
public char b1;
public char b2;
public int c;
public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int max = 0;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
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
				p.a1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.a2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.b1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.b2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.c = Integer.parseInt(tempVar7);
			}
			 p.money = 0;
			if (p.a1 > 80 && p.c >= 1)
			{
				p.money = p.money + 8000;
			}
			if (p.a1 > 85 && p.a2 > 80)
			{
				p.money = p.money + 4000;
			}
			if (p.a1 > 90)
			{
				p.money = p.money + 2000;
			}
			if (p.a1 > 85 && p.b2 == 'Y')
			{
				p.money = p.money + 1000;
			}
			if (p.a2 > 80 && p.b1 == 'Y')
			{
				p.money = p.money + 850;
			}
		}
		for (p = stu;p < stu + n;p++)
		{
		if (p.money > max)
		{
			max = p.money;
		}
		}
		for (p = stu;p < stu + n;p++)
		{
		if (p.money == max)
		{
			System.out.printf("%s\n%d\n",p.name,p.money);
		break;
		}
		}
		for (p = stu;p < stu + n;p++)
		{
			m = m + p.money;
		}
		System.out.printf("%d",m);
	}
}

