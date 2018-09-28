public class student
{
	public student formal;
	public String xuehao = new String(new char[20]);
	public String xingming = new String(new char[20]);
	public char xingbie;
	public int nianling;
	public String defen = new String(new char[20]);
	public String dizhi = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat()
	{
		student end;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xuehao = tempVar.charAt(0);
		}
		while (p1.xuehao.charAt(0) != 'e')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.xingming = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.xingbie = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.nianling = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.defen = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.dizhi = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				p1.formal = null;
			}
			else
			{
				p2.next = p1;
				p1.formal = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xuehao = tempVar7.charAt(0);
			}
		}
		p2.next = null;
		end = p2;
		return (end);
	}
	public static void print(student end)
	{
		student p;
		p = end;
		if (end != null)
		{
			do
			{
			System.out.printf("%s %s %c %d %s %s\n",p.xuehao,p.xingming,p.xingbie,p.nianling,p.defen,p.dizhi);
			p = p.formal;
			}while (p != null);
		}
	}

	public static void Main()
	{
		student enda;
		enda = creat();
		print(enda);
		return 0;
	}
}

