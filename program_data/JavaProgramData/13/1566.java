public class arr
{
	public int num;
	public arr next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static arr create(int m) //  m?????
	{
		arr head;
		arr p1;
		arr p2;
		n = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (arr) malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		head = p1;
		while (n < m)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (arr)malloc(LEN);
			p2.next = p1;
			n++;
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
		}
		p1.next = null;
		return (head);
	}
	public static void print(arr head)
	{
		arr p;
		p = head;
		while (p != null)
		{
			if (p == head)
			{
			System.out.printf("%ld",p.num);
			}
			else
			{
				System.out.printf(" %ld",p.num); // ?????????????
			}
			p = p.next;
		}
	}
	public static void freelist(arr head)
	{
			arr p = head;
			while (p != null)
			{
				head = head.next;
				p = null;
				p = head;
			}
	}
	public static arr del(arr head, int dnum)
	{
		arr p1;
		arr p2;
		p1 = p2 = head;
		while (p1 != null && p1.num == dnum)
		{
				head = p1.next;
				p2 = head;
				p1 = null;
				p1 = head;
		}
		while (p1 != null)
		{
				p2 = p1;
				p1 = p1.next;
			while (p1 != null && p1.num == dnum)
			{
				p2.next = p1.next;
				p1 = null;
				p1 = p2.next;
			}

		}
		return (head);
	}


	public static void Main()
	{
		int m;
		arr head;
		arr p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = create(m);
		p = head;
		while (p != null)
		{
			p.next = del(p.next, p.num);
			p = p.next;
		}
		print(head);
		freelist(head);
	}
}

