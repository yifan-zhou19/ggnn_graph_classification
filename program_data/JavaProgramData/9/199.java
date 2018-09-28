public class pa
{
	public String name = new String(new char[10]);
	public int age;
	public pa next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(pa head, pa s)
	{
		pa p1;
		pa p2;
		p1 = head.next;
		p2 = head;
		while (p1 != null && p1.age >= s.age)
		{
			p2 = p1;
			p1 = p1.next;
		}
		p2.next = s;
		s.next = p1;
	}

	public static void creat(pa head, pa s)
	{
		pa p2;
		pa p1;
		p1 = head.next;
		p2 = head;
		while (p1 != null)
		{
			p2 = p1;
			p1 = p1.next;
		}
		p2.next = s;
		s.next = p1;
	}

	public static pa input()
	{
		int i;
		int n;
		pa s;
		pa head1;
		pa head2;
		pa p1;
		pa p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head1 = (pa)malloc(len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head2 = (pa)malloc(len);
		head1.next = null;
		head2.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s = (pa)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s.age = Integer.parseInt(tempVar3);
			}
			if (s.age >= 60)
			{
				sort(head1, s);
			}
			else
			{
				creat(head2, s);
			}
		}
		p1 = head1.next;
		p2 = head1;
		while (p1 != null)
		{
			p2 = p1;
			p1 = p1.next;
		}
		p2.next = head2.next;
		return (head1);
	}

	public static void print(pa head)
	{
		pa p;
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.name);
			p = p.next;
		}
	}


	public static void Main()
	{
		pa head;
		head = input();
		print(head);
	}




}

