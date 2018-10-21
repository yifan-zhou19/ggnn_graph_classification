public class pat
{
	public String num = new String(new char[11]);
	public int age;
	public pat next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pat head;
		pat p1;
		pat p2;
		pat pre;
		p1 = new pat();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.age = Integer.parseInt(tempVar3);
		}
		head = p1;
		p1.next = null;
		for (i = 1;i < n;i++)
		{
			p1 = new pat();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
			if (p1.age < 60)
			{
				p2 = head;
				while (p2 != null)
				{
					if (p2.next == null)
					{
						p2.next = p1;
						p1.next = null;
						break;
					}
					p2 = p2.next;
				}
			}
			else if (p1.age >= 60)
			{
				p2 = head;
			while (p2 != null)
			{
				if (p2 == head && p1.age > p2.age)
				{
					head = p1;
					p1.next = p2;
					break;
				}
				else if (p1.age > p2.age)
				{
					pre.next = p1;
					p1.next = p2;
					break;
				}
				else if (p2.next == null)
				{
					p2.next = p1;
					p1.next = null;
					break;
				}
				else
				{
					pre = p2;
					p2 = p2.next;
				}
			}
			}
		}
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.num);
			p1 = p1.next;
		}

	}

}

