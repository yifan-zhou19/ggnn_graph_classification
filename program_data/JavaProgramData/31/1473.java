public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[30]);
	public String sex = new String(new char[2]);
	public String age = new String(new char[5]);
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
	public student prev;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student p1;
		student p2;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (strcmp(p1.num,"end"))
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
				p1.add = tempVar6.charAt(0);
			}
			p2 = p1;
			p1.prev = null;
		}
		while (strcmp(p1.num,"end"))
		{
			p1 = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (strcmp(p1.num,"end"))
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
					p1.add = tempVar12.charAt(0);
				}
				p1.prev = p2;
				p2 = p1;
			}
		}
		return (p2);
	}
	public static void Main()
	{
		student p1;
		p1 = create();
		while (p1 != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.prev;
		}
	}
}

