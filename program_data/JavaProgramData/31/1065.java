public class student
{
	public String stuID = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student a;
		final String str = "end";
		p = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.stuID = tempVar.charAt(0);
		}
		p.next = null;
		while (strcmp(p.stuID,str) != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				(p.sex) = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p.age) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
			a = p;
			p = new student();
			p.next = a;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.stuID = tempVar7.charAt(0);
			}
		}
		while (p.next != null)
		{
			p = p.next;
			System.out.printf("%s %s %c %d %s %s\n",p.stuID,p.name,p.sex,p.age,p.score,p.add);
		}
		return 0;
	}


}

