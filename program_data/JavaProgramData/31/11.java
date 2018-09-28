public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[5]);
	public int age;
	public String score = new String(new char[20]);
	public String addr = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student head;
	public static student input()
	{
		student p1;
		student p2;
			p1 = p2 = new student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			p2.next = null;
			while (strcmp(p1.num,"end") != 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p1.name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p1.sex = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p1.age = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p1.score = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					p1.addr = tempVar6.charAt(0);
				}
				p1 = new student();
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p1.num = tempVar7.charAt(0);
				}
				p1.next = p2;
				p2 = p1;
			}
				head = p1;
				return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head.next;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.addr);
				p = p.next;
			} while (p != null);
		}
	}
	public static int Main()
	{
		input();
		print(head);
		return 0;
	}
}

