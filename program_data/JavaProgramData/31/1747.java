public class student
{
	public String infor = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;
	public static student creat()
	{
		student head;
		head = null;
		p1 = null;
		p2 = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.infor = new Scanner(System.in).nextLine();
			if (strcmp(p1.infor,"end") == 0)
			{
				break;
			}
			if (head == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static student turnback(student head)
	{
		student newhead = null;
		student p;
		student q;
		student r;
		do
		{
			p = head;
			q = null;
			while (p.next != 0)
			{
				q = p;
				p = p.next;
			}
			if (newhead == 0)
			{
				newhead = p;
				newhead.next = q;
			}
			else
			{
				r = p;
				r.next = q;
			}
			q.next = null;
		}while (head.next != 0);
		return (newhead);
	}

	public static void output(student head)
	{
		student p;
		for (p = head;p.next != 0;p = p.next)
		{
			System.out.printf("%s\n",p.infor);
		}
		System.out.printf("%s\n",p.infor);
	}
	public static void Main()
	{
		student head;
		head = creat();
		head = turnback(head);
		output(head);
	}









}
