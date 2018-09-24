public class student
{
	public String name = new String(new char[25]);
	public int qmpj;
	public int bjpy;
	public char gb;
	public char xb;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int total = 0;
		int c1;
		int c2;
		int c3;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		student m;
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
				(p.name) = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p.qmpj) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p.bjpy) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				c1 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				(p.gb) = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				c2 = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				(p.xb) = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(null, 1);
			if (tempVar9 != null)
			{
				c3 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				(p.paper) = Integer.parseInt(tempVar10);
			}
			p.money = 0;
		}
		for (p = stu;p < stu + n;p++)
		{
			if (p.qmpj > 80 && p.paper > 0)
			{
				p.money = p.money + 8000;
			}
			if (p.qmpj > 85 && p.bjpy > 80)
			{
				p.money = p.money + 4000;
			}
			if (p.qmpj > 90)
			{
				p.money = p.money + 2000;
			}
			if (p.qmpj > 85 && p.xb == 'Y')
			{
				p.money = p.money + 1000;
			}
			if (p.bjpy > 80 && p.gb == 'Y')
			{
				p.money = p.money + 850;
			}
		}
		m = stu;
		for (p = stu;p < stu + n;p++)
		{
			if (p.money > m.money)
			{
				m = p;
			}
			total = p.money + total;
		}
		System.out.printf("%s\n%d\n%d\n",m.name,m.money,total);
	}
}

