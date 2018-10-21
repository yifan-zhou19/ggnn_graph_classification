public class student
{
	public String name = new String(new char[21]);
	public int grade;
	public int ping;
	public char a;
	public char w;
	public int pa;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;
	public static student head;
	public static student max;
	public static void Main()
	{
		int sum = 0;
		int N;
		int i;
		int maxmoney;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p2 = p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.grade = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.ping = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p1.w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.pa = Integer.parseInt(tempVar7);
			}
			p1.money = 0;
			if (p1.grade > 80 && p1.pa != 0)
			{
				p1.money = 8000 + p1.money;
			}
			if (p1.grade > 85 && p1.ping > 80)
			{
				p1.money = 4000 + p1.money;
			}
			if (p1.grade > 90)
			{
				p1.money = 2000 + p1.money;
			}
			if (p1.grade > 85 && p1.w == 'Y')
			{
				p1.money = 1000 + p1.money;
			}
			if (p1.ping > 80 && p1.a == 'Y')
			{
				p1.money = 850 + p1.money;
			}
			sum = sum + p1.money;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p2.next = p1;
			p2 = p1;
		}
		p1.next = null;
		max = head;
		p1 = head.next;
		maxmoney = head.money;
		while (p1.next != null)
		{
			if (p1.money > maxmoney)
			{
				maxmoney = p1.money;
				max = p1;
			}
			p1 = p1.next;
		}
		System.out.printf("%s\n%d\n%d",max.name,maxmoney,sum);
	}





}

