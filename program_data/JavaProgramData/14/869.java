public class student
{
	public int num;
	public int chi;
	public int math;
	public int total;
	public student next;

}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student p1;
		student p2;
		student head;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student) malloc(len);
		head = null;
		i = 0;
		while (i < n)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.chi = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			i = i + 1;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
		}
		p2.next = null;
		return (head);
	}
	public static void sum(student head)
	{
		student p1;
		p1 = head;
		while (p1 != null)
		{
			p1.total = p1.chi + p1.math;
			p1 = p1.next;

		}
	}
	public static student choose(student head)
	{
		student p1;
		student p2;
		p1 = head;
		p2 = p1;
		while (p1.next != null)
		{
			if (p2.total < (p1.next).total)
			{
				p2 = p1.next;
			}
			p1 = p1.next;

		}
		System.out.printf("%d %d\n",p2.num,p2.total);
		return (p2);
	}
	public static student del(student head, student p2)
	{
		student p1;
		p1 = head;
		if (p2 == head)
		{
			head = p2.next;
			return (head);
		}
		else
		{
			while (p1.next != p2)
			{
			p1 = p1.next;
			}
			p1.next = p2.next;
		}
		return (head);


	}
	public static void Main()
	{
		student head;
		student p;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 3)
		{
		head = creat(n);
		sum(head);
		p = choose(head);
		head = del(head, p);
		p = choose(head);
		head = del(head, p);
		p = choose(head);
		}
		else if (n = 2)
		{
			head = creat(n);
		sum(head);
		p = choose(head);
		head = del(head, p);
		p = choose(head);

		}
		else
		{

			head = creat(n);
		sum(head);
		p = choose(head);
		}


	}

}

