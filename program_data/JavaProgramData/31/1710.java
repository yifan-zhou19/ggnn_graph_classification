package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//char a[20];
	//char b[20];
	//char c;
	//int d;
	//float e;
	//char f[20];
	//struct student *next;
	//};
	student head;
	student p1;
	student p0;
	int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student) malloc(LEN);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.a = tempVar;
	}
	head = p1;
	p1.next = 0;
	while (strcmp(head.a,"end") != 0)
	{
	n++;
	if (n > 1)
	{
		p1 = p0;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		head.b = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		head.c = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		head.d = tempVar4;
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		head.e = tempVar5;
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		head.f = tempVar6;
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p0 = (student) malloc(LEN);
	head = p0;
	p0.next = p1;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p0.a = tempVar7;
	}
	}
	head = p1;
	for (p1 = head;(p1 != 0) && (strcmp(p1.a,"end") != 0);)
	{
	System.out.printf("%s %s %c %d %g %s\n",p1.a,p1.b,p1.c,p1.d,p1.e,p1.f);
	p1 = p1.next;
	}
	}
}

