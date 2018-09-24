public class student
{
	public int id;
	public int score1;
	public int score2;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student head;
	public static student creat(int x)
	{
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score2 = Integer.parseInt(tempVar3);
		}
		head = null;
		while (p1.id < x)
		{
			if (p1.id == 1)
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.id = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score1 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.score2 = Integer.parseInt(tempVar6);
			}
			if (p1.id == x)
			{
				p2.next = p1;
				p2 = p1;
			}
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int n;
		student p;
		student q;
		student j;
		student k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		creat(n);
		p = q = head;
		do
		{
			if ((p.score1 + p.score2) > (q.score1 + q.score2))
			{
				q = p;
			}
			p = p.next;
		}while (p != 0);
		p = j = head;
		do
		{
			if ((p.score1 + p.score2) > (j.score1 + j.score2) && p != q)
			{
				j = p;
			}
			p = p.next;
		}while (p != 0);
		p = k = head;
		do
		{
			if ((p.score1 + p.score2) > (k.score1 + k.score2) && p != q && p != j)
			{
				k = p;
			}
			p = p.next;
		}while (p != 0);
		System.out.printf("%d %d\n",q.id,(q.score1 + q.score2));
		System.out.printf("%d %d\n",j.id,(j.score1 + j.score2));
		System.out.printf("%d %d",k.id,(k.score1 + k.score2));
	}
}

