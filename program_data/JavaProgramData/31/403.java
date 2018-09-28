public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String add = new String(new char[100]);
	public String sex = new String(new char[2]);
	public int age;
	public float score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p;
		student p2;
		p = new student();
		p.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		while (p.num.charAt(0) != 'e')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
			p1 = p;
			p = new student();
			p.next = p1;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.num = tempVar7.charAt(0);
			}
		}
		p2 = p1;
		while (p2 != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.add);
			p2 = p2.next;
		}

	}

}

