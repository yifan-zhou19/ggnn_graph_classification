public class student
{
	public String num = new String(new char[1000]);
	public int age;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student p1;
		student p2;
		student head;
		int i;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
			p1.next = null;
			if (i == 0)
			{
				p2 = p1;
				head = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
			}
		}
		return (head);
	}
	public static student trans(student head, int n)
	{
		student p1;
		student p2;
		student p3;
		student p4;
		student q;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			 p1 = head;
			 p2 = p1.next;
			 p3 = p2.next;
			 p4 = head;
			for (j = 0;p1.next != null;j++)
			{
				if (p2.age >= 60)
				{
			if (p1.age < p2.age)
			{
				if (p1 == head)
				{
					p2.next = p1;
					p1.next = p3;
					head = p2;
					q = p1;
					p1 = p2;
					p2 = q;
					p4 = head;
				}
				else if (p2.next != null)
				{
					p1.next = p3;
					p2.next = p1;
					p4.next = p2;
					q = p1;
					p1 = p2;
					p2 = q;
				}
				else
				{
					p2.next = p1;
					p4.next = p2;
					p1.next = null;
					q = p1;
					p1 = p2;
					p2 = q;
				}
			}
				}
				if (p1 != head)
				{
					p4 = p4.next;
				}
				p1 = p1.next;
				p2 = p2.next;
				if (p3 != null)
				{
					p3 = p3.next;
				}
			}
			q = head;
		}
		return (q);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
		public static print(student head)
		{
		student p;
		p = head;
		for (;p != null;p = p.next)
		{
			System.out.printf("%s\n",p.num);
		}
		}
	public static int Main()
	{
		student p;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		p = trans(p, n);
		print(p);
	}

}

