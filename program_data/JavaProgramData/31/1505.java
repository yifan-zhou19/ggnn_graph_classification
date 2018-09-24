public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu p1;
		stu p2;
		stu head;
		p1 = new stu();
		p1.next = null;
		p2 = p1;
		p1 = new stu();
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				head = p2;
				p1.next = p2;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				(p1.sex) = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p1.age) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p1.next = p2;
			p2 = p1;
			p1 = new stu();
		}
		p1 = head;
		while (p1.next != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
		return 0;
	}
}

