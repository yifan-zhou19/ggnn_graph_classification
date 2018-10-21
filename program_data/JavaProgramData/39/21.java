public class stu
{
	public String name = new String(new char[20]);
	public int mark1;
	public int mark2;
	public char position;
	public char hometown;
	public int paper;
	public int fund;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat(int n)
	{
		int i = 1;
		stu head;
		stu p1;
		stu p2;
		p1 = new stu();
		scanf(A, p1.name, p1.mark1, p1.mark2, p1.position, p1.hometown, p1.paper);
		p1.fund = 0;
		if (n == 1)
		{
			head = p1;
			p1.next = null;
			p1 = null;
			return head;
		}
		else
		{
			head = p1;
			p2 = p1;
			do
			{
				p1 = new stu();
				scanf(A, p1.name, p1.mark1, p1.mark2, p1.position, p1.hometown, p1.paper);
				p1.fund = 0;
				i++;
				if (i == n)
				{
					p1.next = null;
					p2.next = p1;
					break;
				}
				else
				{
					p2.next = p1;
					p2 = p1;
				}
			}while (1 != 0);
			return head;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int max = 0;
		stu head;
		stu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		while (p != null)
		{
			if (p.mark1 > 80 && p.paper > 0)
			{
				p.fund += 8000;
			}
			if (p.mark1 > 85 && p.mark2 > 80)
			{
				p.fund += 4000;
			}
			if (p.mark1 > 90)
			{
				p.fund += 2000;
			}
			if (p.mark1 > 85 && p.hometown == 'Y')
			{
				p.fund += 1000;
			}
			if (p.mark2 > 80 && p.position == 'Y')
			{
				p.fund += 850;
			}
			p = p.next;
		}
		p = head;
		while (p != null)
		{
			/*printf("%d %d\n",p->fund,i);*/
			j += p.fund;
			if (p.fund > max)
			{
				max = p.fund;
			}
			p = p.next;
		}
		p = head;
		while (p != null)
		{
			if (max == p.fund)
			{
				System.out.printf("%s\n%d\n%d\n",p.name,p.fund,j);
				break;
			}
			else
			{
				p = p.next;
			}
		}
	}
}

