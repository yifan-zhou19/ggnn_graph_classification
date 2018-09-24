public class stu
{
	public String num = new String(new char[9]);
	public String name = new String(new char[18]);
	public String sex = new String(new char[2]);
	public int age;
	public float score;
	public String addr = new String(new char[12]);
	public stu pre;
}

package <missing>;

public class GlobalMembers
{
	public static stu create()
	{
		stu head;
		stu p1;
		stu p2;
		final String end = "end";
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (strcmp(p1.num,end) == 0)
		{
			return p1;
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
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.addr = tempVar6.charAt(0);
		}
		p1.pre = null;
		p2 = p1;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (strcmp(p1.num,end) == 0)
			{
				return p2;
			}
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
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.score = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.addr = tempVar12.charAt(0);
			}
			p1.pre = p2;
			p2 = p1;
		}
	}

	public static void print(stu head)
	{
		stu p1;
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.addr);
			p1 = p1.pre;
		}
	}

	public static void destroy(stu head)
	{
		stu p1;
		while (head != null)
		{
			p1 = head;
			head = p1.pre;
			p1 = null;
		}
	}

	public static int Main()
	{
		stu head;
		head = create();
		print(head);
		destroy(head);
		return 0;
	}

}

