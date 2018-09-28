public class Student
{
public String id = new String(new char[9]);
public String name = new String(new char[20]);
public char gen;
public int age;
public String grade = new String(new char[10]);
public String add = new String(new char[20]);
public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	Student head;
	Student p2;
	Student p1;
	Student newstu;
	Student newhead;
	int i;
	int n = 1;
	final String e = "end";
	p1 = p2 = head = new Student();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.id = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p1.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		p1.gen = tempVar3.charAt(0);
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
	while (true)
	{
	p1 = new Student();
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p1.id = tempVar7.charAt(0);
	}
	if (strcmp(p1.id,e) == 0)
	{
		p2.next = null;
		break;
	}
	else
	{
	String tempVar8 = ConsoleInput.scanfRead(" ");
	if (tempVar8 != null)
	{
		p1.name = tempVar8.charAt(0);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar9 != null)
	{
		p1.gen = tempVar9.charAt(0);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		p1.age = Integer.parseInt(tempVar10);
	}
	String tempVar11 = ConsoleInput.scanfRead(" ");
	if (tempVar11 != null)
	{
		p1.grade = tempVar11.charAt(0);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ");
	if (tempVar12 != null)
	{
		p1.add = tempVar12.charAt(0);
	}
	p2.next = p1;
	p2 = p1;
	n++;
	}
	}
	for (i = 0;i < n;i++)
	{
	 p2 = p1 = head;
	 while (p1.next != null)
	 {
	 p2 = p1;
	 p1 = p1.next;
	 }
	 if (i == 0)
	 {
		 newhead = newstu = p1;
	 }
	 else
	 {
		 newstu = newstu.next = p1;
	 }
	 p2.next = null;
	}
	p1 = newhead;
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s %s %c %d %s %s\n",p1.id,p1.name,p1.gen,p1.age,p1.grade,p1.add);
		p1 = p1.next;
	}
	}
}

