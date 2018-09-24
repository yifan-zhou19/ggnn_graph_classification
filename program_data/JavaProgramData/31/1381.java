public class stud
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String grade = new String(new char[10]);
	public String add = new String(new char[30]);
	public stud next;
}

package <missing>;

public class GlobalMembers
{
	public static stud creat()
	{
		stud head;
		stud p1;
		stud p2;
		p1 = p2 = new stud();
		p2.next = null;
		head = p1;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (*(p1.num.Substring(2)) == 'd')
			{
				return head;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.grade = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p1 = new stud();
			head = p2;
			p1.next = p2;
			p2 = p1;
		}
	}
	public static void print(stud head)
	{
		stud p;
		for (p = head;p != 0;p = p.next)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.grade,p.add);
		}
	}
	public static void Main()
	{
		stud head;
		head = creat();
		print(head);
	}

}

