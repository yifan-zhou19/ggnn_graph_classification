public class student
{
	public String name = new String(new char[1000]);
	public int final;
	public int aver;
	public char xshe;
	public char xb;
	public int paper;
	public int score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int num;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		int n;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.final = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.aver = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.xshe = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.xb = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.paper = Integer.parseInt(tempVar6);
		}
		p1.score = 0;
		head = null;
		while (n < num - 1)
		{
			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.final = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.aver = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.xshe = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.xb = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.paper = Integer.parseInt(tempVar12);
			}
			p1.score = 0;
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static void Main()
	{
			student head;
			student p1;
			student p2;
			student p;
			student max;
			int sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			head = creat();
			p = p1 = p2 = head;
			for (;p != null;p = p.next)
			{
				if ((p.aver) > 80 && p.xshe == 'Y')
				{
					p.score = p.score+850;
				}
				if ((p.final) > 80 && (p.paper) >= 1)
				{
					p.score = p.score+8000;
				}
				if ((p.final) > 85 && (p.aver) > 80)
				{
					p.score = p.score+4000;
				}
				if ((p.final) > 90)
				{
					p.score = p.score+2000;
				}
				if ((p.final) > 85 && (p.xb) == 'Y')
				{
					p.score = p.score+1000;
				}
			}
			max = p = head;
			for (;p != null;p = p.next)
			{
				if ((p.score) > max.score)
				{
				max = p;
				}
				sum = sum + p.score;
			}
			System.out.printf("%s\n%d\n%d\n",max.name,max.score,sum);
	}
}

