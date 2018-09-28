public class student
{
	public String num = new String(new char[10]);
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
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		head = p1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
		String tempVar8 = ConsoleInput.scanfRead(" ");
		if (tempVar8 != null)
		{
			p1.name = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar9 != null)
		{
			p1.sex = tempVar9.charAt(0);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			p1.age = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead(" ");
		if (tempVar11 != null)
		{
			p1.score = tempVar11.charAt(0);
		}
		String tempVar12 = ConsoleInput.scanfRead(" ");
		if (tempVar12 != null)
		{
			p1.add = tempVar12.charAt(0);
		}
		if (strcmp(p1.num,"end") != 0)
		{
			p2.next = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}
		else
		{
			p2.next = null;
		}
		return (head);
	}
	public static student reverse(student head)
	{
		student nowp;
		student prep;
		student nextp;
		prep = null;
		nowp = head;
		while (nowp != null)
		{
			nextp = nowp.next;
			nowp.next = prep;
			prep = nowp;
			nowp = nextp;
		}
		return (prep);
	}
	public static int Main()
	{
		student head;
		student head1;
		head = creat();
		head1 = reverse(head);
		student pt1;
		pt1 = head1;
		while (pt1 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",pt1.num,pt1.name,pt1.sex,pt1.age,pt1.score,pt1.add);
			pt1 = pt1.next;
		}
	return 0;
	}
}

