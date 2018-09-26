public class mouse
{
	public String id = new String(new char[10]);
	public int age;
	public mouse next;
}

package <missing>;

public class GlobalMembers
{
	public static mouse creat(int n)
	{
		mouse head;
		mouse p1;
		mouse p2;
		int i;
		for (i = 0;i < n;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
			if (i > 1)
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new mouse();
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
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static mouse order(mouse head, int n)
	{
		mouse p1;
		mouse p2;
		int i;
		int j;
		int x;
		String a = new String(new char[10]);
		for (i = 1;i < n;i++)
		{
			p2 = head;
			p1 = p2.next;
			for (j = 0;j < n - i;j++)
			{
				if (p2.age < p1.age && p1.age >= 60)
				{
					x = p2.age;
					p2.age = p1.age;
					p1.age = x;
					a = p2.id;
					p2.id = p1.id;
					p1.id = a;
				}
				p2 = p1;
				p1 = p1.next;
			}
		}
		return (head);
	}
	public static int Main()
	{
		mouse head;
		mouse p;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		head = order(head, n);
		p = head;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
	}

}

