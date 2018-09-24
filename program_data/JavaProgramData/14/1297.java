public class student
{
	public int id;
	public int chinese;
	public int math;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.chinese = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.math = Integer.parseInt(tempVar4);
		}
		p1.sum = p1.chinese + p1.math;
		head = null;
		for (;p1.id < n;)
		{
			if (p1.id == 1)
			{
				head = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.id = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.chinese = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.math = Integer.parseInt(tempVar7);
			}
			p1.sum = p1.chinese + p1.math;
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		student head;
		student p1;
		student p2;
		student p3;
		student p;
		head = creat();
		for (p = head,p1 = head,p2 = head,p3 = head;p != null;p = p.next)
		{
			if (p.sum > p1.sum)
			{
				p3 = p2;
				p2 = p1;
				p1 = p;
			}
			else if (p.sum > p2.sum)
			{
				p3 = p2;
				p2 = p;
			}
			else if (p.sum > p3.sum)
			{
				p3 = p;
			}
		}
		System.out.printf("%d %d\n",p1.id,p1.sum);
		System.out.printf("%d %d\n",p2.id,p2.sum);
		System.out.printf("%d %d\n",p3.id,p3.sum);
	}

}

