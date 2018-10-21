public class arr
{
	public String id = new String(new char[10]);
	public int age;
	public arr next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static arr create(int m)
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
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
		head = p1;
		while (n < m)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (arr)malloc(LEN);
			p2.next = p1;
			n++;
			p2 = p1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.id = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
		}
		p1.next = null;
		return (head);
	}
	public static arr del(arr head, int dnum)
	{
		arr p1;
		arr p2;
		p1 = p2 = head;
		while (p1 != null && p1.age == dnum)
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
			while (p1 != null && p1.age == dnum)
			{
				p2.next = p1.next;
				p1 = null;
				p1 = p2.next;
			}

		}
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
			System.out.printf("%s\n",p.id);
			}
			else
			{
				System.out.printf("%s\n",p.id);
			}
			p = p.next;
		}
	}
	public static void freelist(arr head)
	{
			arr p = head;
			if (head != null)
			{
			while (p != null)
			{
				head = head.next;
				p = null;
				p = head;
			}
			}
	}
	public static void Main()
	{
		arr head;
		arr p1;
		int m;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = create(m);
		for (;;)
		{
			max = 0;
			for (p1 = head;p1 != null;p1 = p1.next)
			{
				max = (max > p1.age)?max:p1.age;
			}
			if (max >= 60)
			{
				for (p1 = head;p1 != null;p1 = p1.next)
				{
					if (p1.age == max)
					{
						System.out.printf("%s\n",p1.id);
					}
				}
				head = del(head, max);
			}
			else
			{
				break;
			}
		}
		print(head);
		freelist(head);
	}


}

