public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[40]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(L);
		p1 = head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.num = tempVar.charAt(0);
		}
		while (strcmp(head.num,"end") != 0)
		{
			p1 = head;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			head = (student)malloc(L);
			head.next = p1;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				head.num = tempVar7.charAt(0);
			}
		}
		head = null;
		head = p1;
		while (p1 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
	}
}

