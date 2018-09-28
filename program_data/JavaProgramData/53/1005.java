public class num
{
	public int shu;
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static num creat()
	{
		num p1;
		num p2;
		num head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (num)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.shu = Integer.parseInt(tempVar);
		}
		p1.next = null;
		head = p1;
		n = n - 1;
		while (n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (num)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.shu = Integer.parseInt(tempVar2);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			n--;
		}
		return head;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num head;
		num p;
		num q;
		num qpre;
		head = creat();
		for (p = head;p != null;p = p.next)
		{
			for (q = p.next,qpre = p;q != null;)
			{
				if (q.shu == p.shu)
				{
					qpre.next = q.next;
					q = qpre.next;
				}
				else
				{
					qpre = q;
					q = q.next;
				}
			}
		}
		System.out.printf("%d",head.shu);
		for (p = head.next;p != null;p = p.next)
		{
			System.out.printf(",%d",p.shu);
		}
	}
}

