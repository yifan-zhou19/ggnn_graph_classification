public class student
{
	public String id = new String(new char[100]);
	public String name = new String(new char[100]);
	public char sex;
	public int age;
	public String score = new String(new char[100000]);
	public String address = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p;
		student q;
		q = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(len);
		p = head;
		while (true)
		{
			q = p;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.id = tempVar.charAt(0);
			}
			if (strcmp(p.id,"end") == 0)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.address = tempVar6.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			q.next = p;
		}
		q.next = null;
		return (head);
	}

	public static student turn(student head)
	{
		student p;
		student q;
		student t;
		student newhead = null;
		while (head.next != null)
		{
			q = null;
			p = head;
			while (p.next != null)
			{
				q = p;
				p = p.next;
			}
			if (newhead == null)
			{
				newhead = p;
				t = newhead.next = q;
			}
			t = t.next = q;
			q.next = null;
		}
		return newhead;
	}

	public static void put(student head)
	{
		student p;
		for (p = head;p != null;p = p.next)
		{
			if (strcmp(p.id,"end") == 0)
			{
				continue;
			}
			System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.sex,p.age,p.score,p.address);
		}
	}

	public static void Main()
	{
		student head;
		head = creat();
		head = turn(head);
		put(head);
	}
}

