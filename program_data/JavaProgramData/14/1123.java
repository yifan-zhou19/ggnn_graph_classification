public class stu
{
	public int id;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p1;
		stu p2;
		stu p0;
		int n;
		int i;
		int ch;
		int ma;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		len = sizeof(stu);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(len);

		head = p1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ma = Integer.parseInt(tempVar4);
		}
		p1.sum = ch + ma;
		p1.next = null;

		for (i = 2;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p0 = (stu)malloc(len);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p0.id = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				ma = Integer.parseInt(tempVar7);
			}
			p0.sum = ch + ma;

			p1 = p2 = head;
			while ((p0.sum <= p1.sum) && (p1.next != 0))
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p0.sum > p1.sum)
			{
				if (head == p1)
				{
					head = p0;
				}
				else
				{
					p2.next = p0;
				}
				p0.next = p1;
			}
			else
			{
				p1.next = p0;
				p0.next = null;
			}
			if (i > 3)
			{
				p1 = head.next;
				p1 = p1.next;
				p1.next = null;
			}
		}
		p1 = head;
		while (p1 != 0)
		{
			System.out.printf("%d %d\n",p1.id,p1.sum);
			p1 = p1.next;
		}
	}


}

