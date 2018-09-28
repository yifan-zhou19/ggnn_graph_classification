public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
	public patient pre;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(struct patient * *head);
		patient head;
		patient p1;
		patient p2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = new patient();
		p2 = p1;
		head = p1;
		p1.pre = null;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.age = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - 1;i++)
		{
			p1 = new patient();
			p2.next = p1;
			p1.pre = p2;
			p2 = p1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
		}
		p2.next = null;
		f(head);
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			System.out.printf("%s\n",p1.id);
		}
	}
	public static void f(patient[] head)
	{
		patient p1;
		patient p2;
		patient p;
		for (p1 = head.next;p1 != null;p1 = p1.next)
		{
			if (p1.age >= 60)
			{
				p = p1.next;
				p1.pre.next = p1.next;
				if (p1.next != null)
				{
					p1.next.pre = p1.pre;
				}
				for (p2 = head[0];p2.next != null;p2 = p2.next)
				{
					if (p1.age > p2.age)
					{
						if (p2.pre != null)
						{
							p2.pre.next = p1;
						}
						else
						{
							head[0] = p1;
						}
						p1.pre = p2.pre;
						p2.pre = p1;
						p1.next = p2;
						break;
					}
				}
				if (p2.next == null)
				{
					if (p1.age > p2.age)
					{
						if (p2.pre != null)
						{
							p2.pre.next = p1;
						}
						else
						{
							head[0] = p1;
						}
						p1.pre = p2.pre;
						p2.pre = p1;
						p1.next = p2;
					}
					else
					{
						p2.next = p1;
						p1.pre = p2;
						p1.next = null;
					}
				}
				if (p != null)
				{
					p1 = p.pre;
				}
				else
				{
					break;
				}
			}
		}
	}

}

