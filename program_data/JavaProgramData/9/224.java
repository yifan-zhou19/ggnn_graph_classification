public class student
{
	public String num = new String(new char[10]);
	public int o;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		int scholar = struct student * p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.o = Integer.parseInt(tempVar2);
		}
		p1.next = null;

		head = p1;
		p2 = p1;
		for (i = 1;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.o = Integer.parseInt(tempVar4);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return head;
	}

	public static student max(student head)
	{
		student p;
		student m;
		m = head;
		p = head.next;
		while (p != null)
		{
			if (p.o > m.o)
			{
				m = p;
			}
			p = p.next;
		}
		return m;
	}

	public static void Main()
	{
		int n;
		student head;
		student m;
		student p;
		student create = new student(int n);
		student max = new student(struct student * head);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		p = head;
		for (;;)
		{
			m = max(p);
			if (m.o >= 60)
			{
				System.out.printf("%s\n",m.num);
				m.o = -1;
			}
			else
			{
				break;
			}
		}
		p = head;
		while (p != null)
		{
			if (p.o != -1)
			{
				System.out.printf("%s\n",p.num);
			}
			p = p.next;
		}
	}

}

