public class ceshi
{
	public String hao = new String(new char[20]);
	public int num;
	public ceshi next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static ceshi charu(ceshi head, ceshi p1)
	{
		ceshi p2;
		ceshi p;
		if (p1.num >= 60)
		{
			if (head == Null)
			{
				head = p1;
			p1.next = Null;
			}
			else
			{
			p2 = head;
			while ((p1.num <= p2.num) && (p2.next != Null))
			{
				p = p2;
				p2 = p2.next;
			}
			if (p1.num >= p2.num)
			{
				if (p2 == head)
				{
					head = p1;
					p1.next = p2;
				}
				else
				{
					p.next = p1;
					p1.next = p2;
				}
			}
			else
			{
				p2.next = p1;
				p1.next = Null;
			}
			}
		}
		else
		{
			p = head;
			if (head == Null)
			{
				head = p1;
				p1.next = Null;
			}
			else
			{
				while (p.next != Null)
				{
				p = p.next;
				}
			p.next = p1;
			p1.next = Null;
			}
		}
		return (head);
	}

	public static ceshi create()
	{
		ceshi p1;
		ceshi head;
		ceshi p2;
		int i = 0;
		head = Null;
		while (i < n)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (ceshi)malloc(len);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.hao = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			head = charu(head, p1);
		}
		return (head);
	}

	public static void print(ceshi head)
	{
		ceshi p;
		p = head;
		while (p != Null)
		{
			System.out.printf("%s\n",p.hao);
		p = p.next;
		}
	}

	public static void Main()
	{
		ceshi p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = create();
		print(p);
	}

}

