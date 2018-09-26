public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String dizhi = new String(new char[20]);
	public char xb;
	public int year;
	public float score;
	public student next;
	public student pre;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		scanf(TYPE, p1.num, p1.name, p1.xb, p1.year, p1.score, p1.dizhi);
		head = p1;
		p1.pre = null;
		p2 = p1;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
				p1 = null;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.xb = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.year = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.dizhi = tempVar6.charAt(0);
			}
			p2.next = p1;
			p1.pre = p2;
			p2 = p1;
		}
		p2.next = null;
		return p2;
	}

	public static int Main()
	{
		student head;
		student p;
		head = create();
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s",p.num,p.name,p.xb,p.year,p.score,p.dizhi);
			System.out.print("\n");
			p = p.pre;
		}
		return 0;
	}

	/*????????????????????*/
}

