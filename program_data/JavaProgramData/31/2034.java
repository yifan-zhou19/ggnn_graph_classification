public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[5]);
	public String age = new String(new char[5]);
	public String score = new String(new char[10]);
	public String adr = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (student) malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
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
			p1.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.adr = tempVar6.charAt(0);
		}
		p1.next = null;
		while (p1.num.charAt(0) != 'e')
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student) malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (p1.num.charAt(0) != 'e')
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					p1.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					p1.age = tempVar10.charAt(0);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					p1.score = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					p1.adr = tempVar12.charAt(0);
				}
				p1.next = head;
				head = p1;
			}
		}
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.adr);
			p = p.next;
		}
	}
	public static void Main()
	{
		student h;
		h = creat();
		print(h);
	}













}

