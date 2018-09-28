public class s
{
	public String xuehao = new String(new char[20]);
	public String xingming = new String(new char[20]);
	public char xingbie;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[20]);
	public s next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		s A = new s();
		s head;
		s p;
		head = A();
		p = head;
		if (head != null)
		{
			while (p.next != null)
			{
				System.out.printf("%s %s %c %d %s %s\n",p.xuehao,p.xingming,p.xingbie,p.age,p.score,p.add);
				p = p.next;
			}
			System.out.printf("%s %s %c %d %s %s\n",p.xuehao,p.xingming,p.xingbie,p.age,p.score,p.add);
		}
		return 0;
	}

	public static s A()
	{
		s head;
		s p1;
		s p2;
		head = new s();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.xuehao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			head.xingming = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			head.xingbie = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			head.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			head.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			head.add = tempVar6.charAt(0);
		}
		head.next = null;
		p1 = head;
		for (;;)
		{
			p2 = new s();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p2.xuehao = tempVar7.charAt(0);
			}
			if (strcmp(p2.xuehao,"end"))
			{
				String tempVar8 = ConsoleInput.scanfRead(" ");
				if (tempVar8 != null)
				{
					p2.xingming = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p2.xingbie = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p2.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p2.score = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p2.add = tempVar12.charAt(0);
				}
			}
			else
			{
				break;
			}
			p2.next = p1;
			p1 = p2;
		}
		p2.next = p1;
		return (p1);
	}
}

