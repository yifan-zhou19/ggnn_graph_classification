public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String grade = new String(new char[20]);
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stud = tangible.Arrays.initializeWithDefaultstudentInstances(200);
	public static student input()
	{
		student head;
		student p;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		while (strcmp(p.num,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.grade = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.address = tempVar6.charAt(0);
			}
			p.next = head;
			head = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.num = tempVar7.charAt(0);
			}
		}
		return (head);
	}
	public static void output(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.grade,p.address);
			p = p.next;
		}
	}
	public static int Main()
	{
		student head;
		head = input();
		output(head);
		return 0;
	}
}

