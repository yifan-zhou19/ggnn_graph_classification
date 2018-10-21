public class student
{
	public String name = new String(new char[100]);
	public short score1;
	public short score2;
	public char x;
	public char y;
	public short num;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student head;
		String name2 = new String(new char[100]);
		int max = 0;
		int s = 0;
		int i;
		int n;
		p1 = p2 = head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new student();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.score1 = Short.parseShort(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.score2 = Short.parseShort(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p1.y = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.num = Short.parseShort(tempVar7);
			}
			p1.sum = 0;

			if (p1.score1 > 90)
			{
				p1.sum = 2000;
				if (p1.score2 > 80)
				{
					p1.sum = p1.sum + 4000;
					if (p1.x == 'Y')
					{
						p1.sum = p1.sum + 850;
					}
					if (p1.y == 'Y')
					{
						p1.sum = p1.sum + 1000;
					}
					if (p1.num >= 1)
					{
						p1.sum = p1.sum + 8000;
					}
				}
				else
				{
					if (p1.num >= 1)
					{
						p1.sum = p1.sum + 8000;
					}
					if (p1.y == 'Y')
					{
						p1.sum = p1.sum + 1000;
					}
				}
			}
			else if (p1.score1 > 85)
			{
				if (p1.score2 > 80)
				{
					p1.sum = p1.sum + 4000;
					if (p1.x == 'Y')
					{
						p1.sum = p1.sum + 850;
					}
					if (p1.y == 'Y')
					{
						p1.sum = p1.sum + 1000;
					}
					if (p1.num >= 1)
					{
						p1.sum = p1.sum + 8000;
					}
				}
				else
				{
					if (p1.y == 'Y')
					{
						p1.sum = p1.sum + 1000;
					}
					if (p1.num >= 1)
					{
						p1.sum = p1.sum + 8000;
					}
				}
			}
			else if (p1.score1 > 80)
			{
				if (p1.num >= 1)
				{
					p1.sum = p1.sum + 8000;
				}
				if (p1.score2 > 80 && p1.x == 'Y')
				{
					p1.sum = p1.sum + 850;
				}
			}
			else if (p1.score2 > 80 && p1.x == 'Y')
			{
				p1.sum = p1.sum + 850;
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
		p2.next = null;

		max = head.sum;
		p1 = head;
		while (p1 != null)
		{
			if (p1.sum > max)
			{
				max = p1.sum;
				name2 = p1.name;
			}
			s = s + p1.sum;
			p1 = p1.next;

		}
		System.out.printf("%s\n%d\n%d\n",name2,max,s);
	}



}

