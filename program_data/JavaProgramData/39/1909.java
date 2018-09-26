public class stu
{
	public String name = new String(new char[25]);
	public int score;
	public int clas;
	public char job;
	public char west;
	public int paper;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m = 0;
		int max = 0;
		int all = 0;
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu p1;
		stu p2;
		stu head;
		stu p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.score = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.clas = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.job = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.west = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.paper = Integer.parseInt(tempVar7);
		}
		p1.sum = 0;
		head = null;

		while (n != 0)
		{
			m += 1;
			if (m == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.score = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.clas = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.job = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p1.west = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.paper = Integer.parseInt(tempVar13);
			}
			p1.sum = 0;
			n--;
		}
		p2.next = null;

		p = head;
		while (p != null)
		{
			if (p.clas > 80)
			{
				if (p.job == 'Y')
				{
					p.sum += 850;
				}
				if (p.score > 85)
				{
					p.sum += 4000;
				}
			}
			if (p.score > 80)
			{
				if (p.paper != 0)
				{
					p.sum += 8000;
				}
				if (p.score > 85)
				{
					if (p.west == 'Y')
					{
						p.sum += 1000;
					}
					if (p.score > 90)
					{
						p.sum += 2000;
					}
				}
			}
			if (p.sum > max)
			{
				max = p.sum;
				c = p.name;
			}
			all += p.sum;
			p = p.next;
		}
		System.out.println(c);
		System.out.printf("%d\n%d",max,all);
	}

}

