public class student
{
	public String id = new String(new char[100]);
	public String name = new String(new char[100]);
	public String sex = new String(new char[2]);
	public String sco = new String(new char[100]);
	public int age;
	public String pos = new String(new char[100]);
	public student pre;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		if (strcmp(p1.id,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.sco = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.pos = tempVar6.charAt(0);
			}
		}
		head = null;
		while (strcmp(p2.id,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
				p1.pre = null;
			}
			else
			{
				p2.pre = p1;
			}
			p1 = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p2.id = tempVar7.charAt(0);
			}
			if (strcmp(p2.id,"end") != 0)
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p2.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					p2.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					p2.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					p2.sco = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					p2.pos = tempVar12.charAt(0);
				}
			}
		}
		return p1;
	}
	public static void print(student head)
	{
			student p;
			p = head;
			if (head != null && strcmp(head.id,"end") != 0)
			{
				do
				{
					System.out.printf("%s %s %s %d %s %s\n",p.id,p.name,p.sex,p.age,p.sco,p.pos);
					p = p.pre;
				}while (p != null);
			}
	}
	public static int Main()
	{
		student last;
		last = creat();
		print(last);
		return 0;
	}
}

