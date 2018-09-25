public class stu
{
	public int num;
	public int chinese;
	public int math;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void max(struct stu*);
		int n;
		int i;
		stu p;
		stu q;
		stu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = new stu();
		p = new stu();
		head.next = p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.math = Integer.parseInt(tempVar4);
			}
			p.sum = p.chinese + p.math;
			q = new stu();
			p.next = q;
			p = q;
		}
		p.next = null;
		max(head);
		max(head);
		max(head);
	}

	public static void max(stu head)
	{
		stu p;
		stu k;
		stu r;
		stu q;
		int max = 0;
		p = head;
		while (p.next != null)
		{
			r = p;
			p = p.next;
			if (p.sum > max)
			{
				max = p.sum,k = r,q = p;
			}
		}
		System.out.printf("%d %d\n",q.num,q.sum);
		k.next = q.next;
		q = null;
	}

}

