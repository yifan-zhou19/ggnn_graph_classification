public class student
{
	public int id;
	public int c;
	public int m;
	public int s;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.m = Integer.parseInt(tempVar4);
			}
			p1.s = p1.c + p1.m;
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
		}
		p2.next = null;
		return (head);
	}
	public static void exchange(student x, student y)
	{
		int t;
		t = x.id;
		x.id = y.id;
		y.id = t;
		t = x.c;
		x.c = y.c;
		y.c = t;
		t = x.m;
		x.m = y.m;
		y.m = t;
		t = x.s;
		x.s = y.s;
		y.s = t;
	}
	public static void Main()
	{
		student p;
		student q;
		student head;
		int temp;
		int i;
		head = p = creat();
		for (p = head,i = 0;p.next != null,i < 3;p = p.next,i++)
		{
			temp = p.s;
			for (q = p.next;q != null;q = q.next)
			{
				if (p.s < q.s)
				{
					temp = q.s;
				}
				if (p.s != temp)
				{
					exchange(p, q);
				}
			}
		}
		for (p = head,i = 0;i < 3;p = p.next,i++)
		{
			System.out.printf("%d %d\n",p.id,p.s);
		}
	}

}

