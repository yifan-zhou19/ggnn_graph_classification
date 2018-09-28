public class student
{
	public student pre;
	public String No = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float grade;
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student p1;
		student p2;
		student h;
		student p;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.No = tempVar.charAt(0);
		}
		if (p1.No.charAt(0) == 'e')
		{
			p1 = null;
			head = null;
			return head;
		}
		else
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			System.in.read();
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
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
				p1.grade = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			p1.next = null;
		}
		head = p1;
		p2 = p1;
		for (;;)
		{
			p1 = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.No = tempVar7.charAt(0);
			}
			if (p1.No.charAt(0) == 'e')
			{
				head.pre = null;
				for (h = head;h.next != null;)
				{
				p = h.next;
				p.pre = h;
				h = h.next;
				}
			p1 = null;
			return head;
			}
			else
			{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			System.in.read();
			String tempVar9 = ConsoleInput.scanfRead(null, 1);
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.grade = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
			p1.next = null;
			}
			p2.next = p1;
			p2 = p1;
		}
	}
	public static void destroy(student head)
	{
		student p;
		for (;head != null;)
		{
			p = head;
			head = head.next;
			p = null;
		}
	}
	public static void Main()
	{
		student h;
		student t;
		student h1;
		h = create();
		for (h1 = h;h1.next != null;)
		{
			h1 = h1.next;
		}
		for (t = h1;t != null;t = t.pre)
		{
		System.out.printf("%s %s %c %d %g %s\n",t.No,t.name,t.sex,t.age,t.grade,t.address);
		}
		destroy(h);
	}
}

