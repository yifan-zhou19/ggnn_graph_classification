public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int age;
	public float score;
	public String add = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p1;
		student p2;
		student head;
		p1 = new student();
		p1.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (p1.num.charAt(0) != 'e')
		{
		while (p1.num.charAt(0) != 'e')
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
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p2 = p1;
			p1 = new student();
			p1.next = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		head = p2;
		while (head != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",head.num,head.name,head.sex,head.age,head.score,head.add);
			head = head.next;
		}
		}
		return 0;
	}

}

