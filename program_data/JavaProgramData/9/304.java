public class a
{
	public String id = new String(new char[20]);
	public int age;
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static a insert(a head, a s) //??????????????????????
	{
		a p0;
		a p1;
		a p2;
		p1 = head; //???
		p0 = s; //??????
		if (head == null) //?????
		{
			head = p0;
			p0.next = null;
		}
		else
		{
		//while((p0->age<p1->age)&&(p1->next!=NULL))
		while ((p0.age <= p1.age) && (p1.next != null))
		{
			p2 = p1;
			p1 = p1.next;
		} //??????
		if (p0.age > p1.age) //???
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
		} //????????
		}
		return (head);

	}

	public static a creat(a head, a s) //???????????????????
	{
		a t;
		if (head == null)
		{
			head = s;
			s.next = null;
		}
		else
		{
			for (t = head;t.next != null;t = t.next)
			{
				; //????
			}
			   t.next = s; //??
			   s.next = null;
		}
		return (head);

	}

	public static void Main()
	{
		a head1;
		a head2;
		a s;
		a p;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head1 = null;
		head2 = null;
		for (i = 0;i <= n - 1;i++)
		{
			s = LEN;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s.age = Integer.parseInt(tempVar3);
			}
			s.next = null;
			if (s.age >= 60)
			{
			 head1 = insert(head1, s); //???????????????
			}
			if (s.age < 60)
			{
			 head2 = creat(head2, s); //?????????????
			}
		}
		for (p = head1;p != null;p = p.next)
		{
			System.out.printf("%s\n",p.id);
		}
		for (p = head2;p != null;p = p.next) //????????????????
		{
			System.out.printf("%s\n",p.id);
		}
	}
}

