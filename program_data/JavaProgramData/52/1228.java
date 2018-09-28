public class term
{
	public int num;
	public term next;
}

package <missing>;

public class GlobalMembers
{
	public static term creat(int n)
	{
		term head;
		term p1;
		term p2;
		int i = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (term)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		head = p1;
		while (i < n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (term)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			p2.next = p1;
			p2 = p1;
			i++;
		}
		p1.next = null;
		return (head);
	}

	public static void Main()
	{
		term head;
		term p1;
		term p2;
		term p;
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		head = creat(n);
		p1 = p2 = head;
		for (i = 1;i < n;i++)
		{
			p1 = p2.next;
			p2 = p1;
		}
		p1.next = head;
		p1 = p2 = head;
		for (i = 1;i < n - m;i++)
		{
			p1 = p2.next;
			p2 = p1;
		}
		head = p1.next;
		p2.next = null;
		for (p = head,i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",p.num);
			}
			else
			{
				System.out.printf(" %d",p.num);
			}
			p = p.next;
		}
		System.out.print("\n");
	}
}

