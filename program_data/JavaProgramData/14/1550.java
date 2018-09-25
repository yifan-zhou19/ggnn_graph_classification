public class stu
{
	public int no;
	public int chi;
	public int math;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu a = new stu();
		stu head;
		stu p;
		stu tail;
		stu q;
		int k;
		int i;
		int m1;
		int m2;
		int m3;
		int n1;
		int n2;
		int n3;
		int temp1;
		int temp2;
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.math = Integer.parseInt(tempVar4);
			}
			p.sum = (p.chi + p.math);
			if (head == null)
			{
				head = tail = p;
			}
			else
			{
				tail.next = p;
				tail = p;
				tail.next = a;
			}
		}
		a.next = null;
		p = head;
		for (q = p.next;q.next != null;q = q.next)
		{
				if (p.sum < q.sum)
				{
				temp1 = q.sum;
				q.sum = p.sum;
				p.sum = temp1;
				temp2 = q.no;
				q.no = p.no;
				p.no = temp2;
				}
		}
		m1 = p.no;
		n1 = p.sum;
		head = p.next;
		p = head;
		for (q = p.next;q.next != null;q = q.next)
		{
				if (p.sum < q.sum)
				{
				temp1 = q.sum;
				q.sum = p.sum;
				p.sum = temp1;
				temp2 = q.no;
				q.no = p.no;
				p.no = temp2;
				}
		}
		m2 = p.no;
		n2 = p.sum;
		head = p.next;
		p = head;
		for (q = p.next;q.next != null;q = q.next)
		{
				if (p.sum < q.sum)
				{
				temp1 = q.sum;
				q.sum = p.sum;
				p.sum = temp1;
				temp2 = q.no;
				q.no = p.no;
				p.no = temp2;
				}
		}
		m3 = p.no;
		n3 = p.sum;
		System.out.printf("%d %d\n%d %d\n%d %d\n",m1,n1,m2,n2,m3,n3);
	}
}

