public class pa
{
		public String id = new String(new char[11]);
		public int age;
		public pa next;
}

package <missing>;

public class GlobalMembers
{
	public static pa insert(pa head, pa new1)
	{
		pa p0;
		pa p1;
		pa p2;
		p1 = head;
		p0 = new1;
		if (head == null)
		{
			head = p0;
			p0.next = null;
		}
		else if (p0.age >= 60)
		{
			while ((p1.age >= p0.age) && (p1.next != null))
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p0.age > p1.age)
			{
				if (head == p1)
				{
					head = p0;
				}
				else
				{
					p2.next = p0;
				}
				p0.next = p1;
			}
			else
			{
				p1.next = p0;
				p0.next = null;
			}
		}
		else
		{
			p1 = head;
			while (p1 != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			p2.next = p0;
			p0.next = null;
		}
		return (head);
	}
	public static void Main()
	{
		pa p;
		pa head;
		int n;
		int i;
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p = new pa();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			head = insert(head, p);
		}
		p = head;
		while (p != null)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
	}
}

