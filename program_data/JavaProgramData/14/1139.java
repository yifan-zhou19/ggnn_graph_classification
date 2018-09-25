public class stu
{
	public int n;
 public int a;
 public int m;
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int l;
	public static stu creat()
	{
		stu head;
		stu p;
		stu q;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (stu)malloc(Len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.m = Integer.parseInt(tempVar3);
		}
		head = Null;
		for (;n < l - 1;)
		{
			n++;
			if (n == 1)
			{
				head = p;
			}
			else
			{
				q.next = p;
			}
			q = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(Len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.n = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.a = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.m = Integer.parseInt(tempVar6);
			}
		}
		q.next = Null;
		return (head);
	}
	public static void Main()
	{
		int s = 0;
		stu p;
		stu q;
		stu c;
		stu d;
		stu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		head = p = q = creat();
		for (;;)
		{
			if ((p.m + p.a) > s)
			{
				s = p.m + p.a;
				c = p;
				d = q;
			}
			q = p;
			p = q.next;
			if (p.next == Null)
			{
				break;
			}
		}
		System.out.printf("%d %d\n",c.n,s);
		if (d == head)
		{
			head = ((c.next).next);
		}
		else
		{
			d.next = c.next;
		}
		p = q = head;
		s = 0;
		for (;;)
		{
			if ((p.m + p.a) > s)
			{
				s = p.m + p.a;
				c = p;
				d = q;
			}
			q = p;
			p = p.next;
			if (p.next == Null)
			{
				break;
			}
		}
		System.out.printf("%d %d\n",c.n,s);
		if (d == head)
		{
			head = p = q = ((c.next).next);
		}
		else
		{
			d.next = c.next;
		}
		p = q = head;
		s = 0;
		for (;;)
		{
			if ((p.m + p.a) > s)
			{
				s = p.m + p.a;
				c = p;
				d = q;
			}
			q = p;
			p = p.next;
			if (p.next == Null)
			{
				break;
			}
		}
		System.out.printf("%d %d\n",c.n,s);
	}




}

