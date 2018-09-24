public class Student
{
public int id;
public int chn;
public int mth;
public int total;
public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static Student insert(Student head, Student stu)
	{
	int j = 0;
	Student p0;
	Student p1;
	Student p2;
	p1 = head;
	p0 = stu;
	if (head == null)
	{
		head = p0;
		p0.next = null;
	}
	else
	{
	while ((p0.total <= p1.total) && (p1.next != null) && j < 4)
	{
		p2 = p1;
		p1 = p1.next;
		j++;
	}
	if (p0.total > p1.total)
	{
	if (head == p1)
	{
		head = p0;
	}
	else
	{
		p2.next = p0;
	}
	p0.next = p1;
	}
	else
	{
		p1.next = p0;
		p0.next = null;
	}
	}
	return (head);
	}

	public static void Main()
	{
	Student p1;
	Student head;
	Student stu;
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	p1 = head = new Student();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		head.id = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		head.chn = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		head.mth = Integer.parseInt(tempVar4);
	}
	head.total = head.chn + head.mth;
	head.next = null;
	for (i = 1;i < n;i++)
	{
	stu = new Student();
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		stu.id = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		stu.chn = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		stu.mth = Integer.parseInt(tempVar7);
	}
	stu.total = stu.chn + stu.mth;
	head = insert(head, stu);
	}
	p1 = head;
	for (i = 0;i < 3;i++)
	{
		System.out.printf("%d %d\n",p1.id,p1.total);
		p1 = p1.next;
	}
	}
}

