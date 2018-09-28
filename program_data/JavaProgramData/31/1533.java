public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public double x;
	public String add = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.x = Double.parseDouble(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		p2 = p1;
		head = p1;
		p1.next = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
		if (p1.num.charAt(0) != 'e')
		{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.x = Double.parseDouble(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.add = tempVar12.charAt(0);
			}
			p1.next = p2;
			p2 = p1;
		}
		else
		{
			break;
		}
		}
		return p2;
	}
	public static void print(stu head)
	{
		stu p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.x,p.add);
			p = p.next;
		}
	}
	public static void destroy(stu head)
	{
		stu p;
		while (head != null)
		{
			p = head;
			head = head.next;
			p = null;
		}
	}

	public static int Main()
	{
		stu head;
		head = creat();
		print(head);
		destroy(head);
		return 0;
	}
}

