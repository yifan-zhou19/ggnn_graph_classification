public class s
{
	public String a = new String(new char[100]);
	public int b;
	public s next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		s p1;
		s p2;
		s p0;
		s head;
		s insert = new s(struct s * head,struct s * stud);
		s h;
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		p1 = new s();
		h = new s();
		p2 = head = p1;
		p1.next = null;
		k = 0;
		j = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = Integer.parseInt(tempVar3);
		}
		x = 0;
		if (p1.b < 60)
		{
		p2 = h = p1;
		x = 1;
		}

		else
		{
			p2 = h;
		}
		for (i = 0;i < n - 1;i++)
		{
			p0 = new s();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p0.a = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p0.b = Integer.parseInt(tempVar5);
			}
			if (p0.b >= 60)
			{
			head = insert(head, p0);
			k++;
			}
			else
			{
				p2.next = p0;
				p2 = p0;
				j++;
			}


		}
		p1 = head;
		if (x == 0)
		{
			i = -1;
		}
		else
		{
			i = 0;
		}
		for (;i < k;i++)
		{
			System.out.printf("%s\n",p1.a);
				p1 = p1.next;
		}
		if (x == 0)
		{
			p2 = h.next;
		i = 0;
		}
		else
		{
			p2 = h;
			i = -1;
		}
		for (;i < j;i++)
		{
			System.out.printf("%s\n",p2.a);
			p2 = p2.next;
		}


	}
	public static s insert(s head, s stud)
	{
		s p0;
		s p1;
		s p2;
		p1 = head;
		p0 = stud;
		if (head == 0)
		{
			head = p0;
			p0.next = null;
		}
		else
		{
			while ((p0.b <= p1.b) && (p1.next != 0))
			{
			p2 = p1;
		p1 = p1.next;
			}
		if (p0.b > p1.b)
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
		return (head);
	}


}

