public class stu
	{
		public String num = new String(new char[100]);
		public String name = new String(new char[100]);
		public String sex = new String(new char[10]);
		public int age;
		public String score = new String(new char[100]);
		public String add = new String(new char[100]);
		public stu before;
	}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu p2;
		stu f = new stu();
		p2 = f();
		while (p2 != 0)
		{
			System.out.printf("%s %s %s %d %s %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.add);
			p2 = p2.before;
		}
	}

	public static stu f()
	{
		stu p1;
		stu p2;
		p1 = new stu();
		p2 = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		p1.before = null;
		if (strcmp(p1.num,"end") != 0)
		{
		do
		{
			p2 = p1;
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
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p1 = new stu();
			p1.before = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		} while (strcmp(p1.num,"end") != 0);
		}
		return p2;
	}


}

