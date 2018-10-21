public class student
{
	public String a = new String(new char[200]);

	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
		student head;
		int n = 0;
		p1 = new student();
		p1.a = new Scanner(System.in).nextLine();
		p2 = p1;
		head = null;

		while (strcmp(p1.a,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new student();
			p1.a = new Scanner(System.in).nextLine();

		}
		p2.next = null;

		return (head);
	}
	public static void Main()
	{
		student p;
		student head;
		student q;
		head = creat();
		p = head;
		while (true)
		{
			if (p.next != null)
			{
				q = p;
				p = p.next;
			}

		if (p.next == null && q != head)
		{
					System.out.printf("%s\n",p.a);
					q.next = null;
					p = head;
		}
				if (p.next == null && q == head)
				{
					System.out.printf("%s\n",p.a);
					System.out.printf("%s",q.a);
					break;
				}
		}

	}





}
