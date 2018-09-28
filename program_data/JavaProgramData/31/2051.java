public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public String age = new String(new char[3]);
	public String mark = new String(new char[10]);
	public String add = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student rcreate()
	{
		student head;
		student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		p.next = null;
		if (strcmp(p.num,"end") == 0)
		{
			head = null;
			return (null);
		}
		while (strcmp(p.num,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.mark = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			p.next = head;
			head = p;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.num = tempVar7.charAt(0);
			}
		}
		head = p.next;
		p = null;
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (p == null)
		{
			System.out.print("list null!");
			return;
		}
		while (p.next != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.mark,p.add);
			p = p.next;
		}
		System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.mark,p.add);
	}
	public static void Main()
	{
		student h;
		h = rcreate();
		print(h);
	}
}

