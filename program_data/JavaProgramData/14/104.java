public class student
{
	public int no;
	public int ch;
	public int math;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		int i;
		student head;
		student p;
		student q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (student)malloc(len);
		head.next = q = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.no = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.ch = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.math = Integer.parseInt(tempVar3);
		}
		p.sum = (p.ch) + (p.math);

		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.no = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.ch = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.math = Integer.parseInt(tempVar6);
			}
			p.sum = (p.ch) + (p.math);
			q.next = p;
			q = p;
			p.next = null;
		}
	//	for(p=head->next;p!=NULL;p=p->next)printf("%d %d",p->no,p->sum);
		return (head);
	}

	public static void sort(student head)
	{
		student p;
		student q1;
		student q2;
		student q3;
		int m1;
		int m2;
		int m3;
		for (p = head.next,m1 = p.sum;p != null;p = p.next)
		{
			if (p.sum > m1)
			{
			m1 = p.sum;
			q1 = p;
			}
		}
		System.out.printf("%d %d\n",q1.no,q1.sum);
		for (p = head.next,m2 = p.sum;p != null;p = p.next)
		{
			if (p.sum > m2 && p != q1)
			{
			m2 = p.sum;
			q2 = p;
			}
		}
		System.out.printf("%d %d\n",q2.no,q2.sum);
		for (p = head.next,m3 = p.sum;p != null;p = p.next)
		{
			if (p.sum > m3 && p != q1 && p != q2)
			{
			m3 = p.sum;
			q3 = p;
			}
		}
		System.out.printf("%d %d\n",q3.no,q3.sum);
	}

	public static int Main()
	{
		int n;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		sort(head);
		return 0;
	}

}

