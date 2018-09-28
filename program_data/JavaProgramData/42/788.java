public class stu
{
public String num = new String(new char[20]);
public int score;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu del(stu head, int num)
	{
	 stu p1;
	 stu p2;
	p1 = head;
	for (;p1 != null;) //??????16???p1->next??p1->next->next
	{
		if (num != p1.score)
		{
	p2 = p1;
		}
	else
	{
		if (p1 == head)
		{
			head = p1.next;
		}
	else
	{
		p2.next = p1.next;
	}
	}
	p1 = p1.next;
	}
	return head;
	}
	public static stu creat(int k)
	{
		stu head;
		stu p1;
		stu p2;
		int j = 0;
		p1 = p2 = new stu();
		head = null;
		while (j < k)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.score = Integer.parseInt(tempVar);
			}
		j++;
		if (j == 1)
		{
			head = p1;
		}
		else
		{
			p2.next = p1;
		}
		p2 = p1;
		p1 = new stu();
		}
			p2.next = null;
		return head;
	}
	public static void print(stu head)
	{
	stu p;
	p = head;
	while (p != null)
	{
	System.out.printf("%d",p.score);
	p = p.next;
	if (p != null)
	{
		System.out.print(" ");
	}
	}
	}
	public static void Main()
	{
		stu head;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		head = del(head, k);
		print(head);
	}


}

