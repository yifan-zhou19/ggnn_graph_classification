public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int age;
	public String score = new String(new char[30]);
	public String add = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student p1;
		student p2;
		student p;
		p2 = p = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p2.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p2.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p2.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p2.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p2.add = tempVar6.charAt(0);
		}
		p2.next = null;
		 do
		 {
			p2 = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p2.num = tempVar7.charAt(0);
			}
			if (strcmp(p2.num,"end") == 0)
			{
				break;
			}
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
				p2.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p2.add = tempVar12.charAt(0);
			}
			p2.next = p;
			p = p2;

		 } while (strcmp(p2.num,"end") != 0);
		head = p;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			System.out.printf("%s %s %s %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
		}
		return 0;
	}


}

