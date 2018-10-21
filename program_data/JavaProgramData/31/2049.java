public class node
{
	public int num;
	public String number = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[10]);
	public String age = new String(new char[10]);
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static node creat(int n)
	{
		node ps;
		ps = new node();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ps.number = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			ps.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			ps.age = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			ps.sex = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			ps.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ps.address = tempVar6.charAt(0);
		}
		fflush(stdin);
		ps.num = n;
		return (ps);
	}
	public static node insert(node head, node q)
	{
		node m;
		node n;
		m = head;
		if (head == 0)
		{
			head = q;
			q.next = null;
		}
		else
		{
			if (q.num <= head.num)
			{
				q.next = head;
				head = q;
			}
			else
			{
				while ((q.num > m.num) && (m.next != 0))
				{
					n = m;
					m = m.next;
				}
				if (q.num <= m.num)
				{
					n.next = q;
					q.next = m;
				}
				else
				{
					m.next = q;
					q.next = null;
				}
			}
		}
		return (head);
	}
	public static void list(node head)
	{
		node p;
		p = head;
		while (p != 0)
		{
			System.out.printf("%s %s %s %s %s %s\n", p.number, p.name, p.age, p.sex, p.score, p.address);
			p = p.next;
		}

	}
	public static node fv(node head)
	{
		node p;
		node q;
		node k;
		node l;
		l = head;
		p = new node();
		p.next = l;
		k = p.next;
		while (k != 0)
		{
			q = p;
			p = k;
			k = p.next;
			p.next = q;
		}
		p.next = q;
		q = p;
		while (q.num != head.num)
		{
			q = q.next;
		}
		q.next = null;
		return (p);
	}
	public static int Main()
	{
		node p;
		p = creat(0);
		int i;
		for (i = 1;i < 1000;i++)
		{
			node q;
			q = creat(i);
			if (strcmp("end",q.number) != 0)
			{
				p = insert(p, q);
			}
			else
			{
				break;
			}
		}
		p = fv(p);
		list(p);
		return 0;
	}



}

