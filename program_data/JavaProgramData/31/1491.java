public class stu
{
	public String num = new String(new char[21]);
	public String name = new String(new char[21]);
	public char sex;
	public int age;
	public String score = new String(new char[11]);
	public String addr = new String(new char[21]);
	public stu pre;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu head = new stu();
	public static stu end = new stu();

	public static void create()
	{
		stu p1;
		stu p2;
		p2 = head;
		p1 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (strcmp(p1.num,"end") != 0)
		{
			p2.next = p1;
			p1.pre = p2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
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
			p2 = p1;
			p1 = new stu();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		p2.next = end;
		end.pre = p2;
	}
	public static void anti_print()
	{
		stu p;
		int flag = 0;
		p = end.pre;
		while (p != head)
		{
			if (flag != 0)
			{
				System.out.print("\n");
			}

			System.out.printf("%s",p.num);
			System.out.printf(" %s",p.name);
			System.out.printf(" %c",p.sex);
			System.out.printf(" %d",p.age);
			System.out.printf(" %s",p.score);
			System.out.printf(" %s",p.addr);
			p = p.pre;

			flag = 1;
		}
	}
	public static void Main()
	{
		head.pre = null;
		end.next = null;
		create();
		anti_print();
	}

}

