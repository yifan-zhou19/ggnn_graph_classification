public class student
{
	public String name;
	public int grade;
	public int cla;
	public char gugan;
	public char xibu;
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int max = 0;
		student head;
		student p1;
		student p2;
		student s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p1.name = (String)calloc(22,(Character.SIZE / Byte.SIZE));
		head = p1;
		for (i = 0;i < n;i++)
		{
			//p1=(struct student *)malloc(LEN);

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
				p1.cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.gugan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p1.xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.paper = Integer.parseInt(tempVar7);
			}
			p2.next = p1;
			p2 = p1;
			p2.money = 0;
			if (p2.grade > 80 && ((p2.paper) >= 1))
			{
				p2.money = p2.money + 8000;
				sum = sum + 8000;
			}
			if (p2.grade > 85 && p2.cla > 80)
			{
				p2.money = p2.money + 4000;
				sum = sum + 4000;
			}
			if (p2.grade > 90)
			{
				p2.money = p2.money + 2000;
				sum = sum + 2000;
			}
			if (p2.grade > 85 && p2.xibu == 'Y')
			{
				p2.money = p2.money + 1000;
				sum = sum + 1000;
			}
			if (p2.cla > 80 && p2.gugan == 'Y')
			{
				p2.money = p2.money + 850;
				sum = sum + 850;
			}
			if (max < p2.money)
			{
				max = p2.money;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p1.name = (String)calloc(22,(Character.SIZE / Byte.SIZE));
			//scanf("%s %d %d %c %c %d",p1->name,&p1->grade,&p1->cla,&p1->gugan,&p1->xibu,&p1->paper);
		}

			p2.next = null;
			s = head;
			for (i = 0;s.money != max;i++)
			{
				s = s.next;
			}
			System.out.printf("%s\n%d\n%d",s.name,max,sum);
	}
}

