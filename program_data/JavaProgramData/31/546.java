public class student
{
	public String xuehao = new String(new char[200]);
	public String name = new String(new char[300]);
	public char xingbie;
	public String age = new String(new char[20]);
	public String grade = new String(new char[20]);
	public String dizhi = new String(new char[200]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		student tail;
		student p1;
		student p2;
		student p;
		tail = null;
		p1 = p2 = null;
		for (i = 1;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.next = p2;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.xuehao = tempVar.charAt(0);
			}
			if (strcmp(p1.xuehao,"end") == 0)
			{
				tail = p2;
					 break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			System.in.read();
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				p1.xingbie = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.grade = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.dizhi = tempVar6.charAt(0);
			}
			p2 = p1;
			i++;
		}
		n = i - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
	p = tail;
		for (;p != null;)
		{
			System.out.printf("%s %s %c %s %s %s\n",p.xuehao,p.name,p.xingbie,p.age,p.grade,p.dizhi);
			p = p.next;
		}
		return 0;
	}





}

