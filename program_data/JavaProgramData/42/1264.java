package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int del;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		int num;
	//		struct p *next;
	//	};
		p p1;
		p p2;
		p head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (p)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p1.num) = tempVar2;
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p1.next = null;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			del = Integer.parseInt(tempVar3);
		}
		for (p2 = p1 = head;p1 != null;p1 = p1.next)
		{
			if (p1.num == del)
			{
				if (p1 == head)
				{
					head = p2 = p1.next;
				}
				else
				{
					p2.next = p1.next;
				}
			}
			else
			{
				p2 = p1;
			}
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			System.out.printf("%d%c",p1.num,p1.next == null?'\n':' ');
		}
	}
}

