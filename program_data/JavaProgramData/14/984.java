public class stu
{
	public int num;
	public int yu;
	public int shu;
	public int tol;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static stu creat()
	{
		stu p1;
		stu p2;
		stu head;
		stu p;
		int i;
		int k;
		p1 = p2 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yu = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.shu = Integer.parseInt(tempVar3);
		}
		p1.tol = p1.yu + p1.shu;
		p1.next = null;
		head = p1;
		p = p1;
		p1 = new stu();
		for (i = 1;i < n;i++)
		{
			p = head;
			p2 = p1;
			k = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.yu = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.shu = Integer.parseInt(tempVar6);
			}
			p1.tol = p1.yu + p1.shu;
			while (p != 0 && p.tol >= p1.tol)
			{
				p2 = p;
				p = p.next;
				k++;
			}
			if (k <= 3)
			{
			if (p == head)
			{
				head = p1;
				p1.next = p;
			}
			if (p == 0)
			{
				p2.next = p1;
				p1.next = null;
			}
			if (p != head && p != 0)
			{
				p2.next = p1;
				p1.next = p;
			}
			}
			p1 = new stu();
		}
		return head;
	}
	public static void Main()
	{
		stu head;
		stu p;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p = head;
		while (i < 3)
		{
			System.out.printf("%d %d\n",p.num,p.tol);
			i++;
			p = p.next;
		}
	}
}

