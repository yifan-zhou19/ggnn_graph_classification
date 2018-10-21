public class man
{
	public String id = new String(new char[20]);
	public int a;
	public man next;
}

package <missing>;

public class GlobalMembers
{
	public static man p;
	public static man head;
	public static man q;



	public static void Main()
	{

		man insert = new man(struct man * head,struct man * ill);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (man)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.a = Integer.parseInt(tempVar3);
			}
			head = insert(head, p);
		}

		q = head;
		while (q != null)
		{
			System.out.printf("%s\n",q.id);
			q = q.next;
		}
	}


	public static man insert(man head, man ill)
	{
		man p0;
		man p1;
		man p2;
		p1 = head;
		p0 = ill;
		if (head == null)
		{
			head = p0;
			p0.next = null;
		}
		else
		{
		  if (p0.a < 60)
		  {
				while (p1.next != null)
				{
					p2 = p1;
					p1 = p1.next;
				}
				p1.next = p0;
				p0.next = null;
		  }

		  else if (p0.a >= 60)
		  {
			while ((p0.a <= p1.a) && (p1.next != null))
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p0.a > p1.a)
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

		}
		return (head);
	}

}

