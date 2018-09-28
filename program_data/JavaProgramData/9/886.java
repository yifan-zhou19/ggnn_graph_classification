public class p
{
	public String id = new String(new char[11]);
	public int y;
	public p next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static p creat()
	{
		p head;
		p p1;
		p p2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (p)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.y = Integer.parseInt(tempVar3);
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (p)malloc(LEN);
		}
		p2.next = null;
		return head;
	}
	public static void px(p head)
	{
		p p;
		int k;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		leap:
		t = 0;
		for (p = head;p != 0;)
		{
			if (p.y >= 60)
			{
			t = 1;
			}
			p = p.next;
		}
		if (t == 1)
		{
			p = head;
			k = p.y;
			for (;p != 0;)
			{
				if (p.y > k)
				{
				k = p.y;
				}
				p = p.next;
			}
			for (p = head;p != 0;)
			{
				if (p.y == k)
				{
					System.out.printf("%s\n",p.id);
					p.y = 0;
				}
				p = p.next;
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto leap;
		}
		for (p = head;p != 0;)
		{
			if (p.y != 0)
			{
			System.out.printf("%s\n",p.id);
			}
			p = p.next;
		}
	}
	public static void Main()
	{
		p p;
		p = creat();
		px(p);
	}
}

