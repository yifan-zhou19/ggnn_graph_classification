public class st
{
	public String s = new String(new char[11]);
	public int n;
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static st creat(int m)
	{
		st head;
		st p1;
		st p2;
		int i;
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (st)malloc(len);
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.s = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.n = Integer.parseInt(tempVar2);
			}
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void line(st head, int m)
	{
		st p;
		st p1;
		st p2;
		p = head;
		int i;
		int j;
		int t;
		for (i = 0;i < m;i++)
		{
			p1 = p;
			p2 = p1.next;
			for (j = 1;j < m;j++)
			{
				final String ss = "";
				if (p1.n >= 60)
				{
					if (p2.n > p1.n)
					{
						ss = p1.s;
						p1.s = p2.s;
						p2.s = ss;
						t = p1.n;
						p1.n = p2.n;
						p2.n = t;
					}
				}
				else
				{
					if (p2.n >= 60)
					{
						ss = p1.s;
						p1.s = p2.s;
						p2.s = ss;
						t = p1.n;
						p1.n = p2.n;
						p2.n = t;
					}
				}
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",p.s);
			p = p.next;
		}
	}
	public static void Main()
	{
		st p;
		void line(struct st * head,int m);
		st creat = new st(int m);
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p = creat(m);
		line(p, m);
	}

}

