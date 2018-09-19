//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//int i;
	//int x;
	//int y;
	//int m;
	//struct student *next;
	//};
	int n;
	int j;
	int k;
	student head;
	student p1;
	student p2;
	student p0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student) malloc(LEN);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.i = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p1.x = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		p1.y = tempVar4;
	}
	p1.m = p1.x + p1.y;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p2 = (student) malloc(LEN);
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		p2.i = tempVar5;
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		p2.x = tempVar6;
	}
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p2.y = tempVar7;
	}
	p2.m = p2.x + p2.y;
	if (p1.m > p2.m)
	{
		head = p1;
		p1.next = p2;
		p2.next = 0;
	}
	else
	{
		p0 = p1;
		p1 = p2;
		p2 = p0;
		head = p1;
		p1.next = p2;
		p2.next = 0;
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p0 = (student) malloc(LEN);
	String tempVar8 = ConsoleInput.scanfRead();
	if (tempVar8 != null)
	{
		p0.i = tempVar8;
	}
	String tempVar9 = ConsoleInput.scanfRead();
	if (tempVar9 != null)
	{
		p0.x = tempVar9;
	}
	String tempVar10 = ConsoleInput.scanfRead();
	if (tempVar10 != null)
	{
		p0.y = tempVar10;
	}
	p0.m = p0.x + p0.y;
	while ((p0.m <= p1.m) && (p1.next != 0))
	{
	p2 = p1;
	p1 = p1.next;
	}
	if (p0.m > p1.m)
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
		p0.next = 0;
	}
	for (j = 3;j < n;j++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p0 = (student) malloc(LEN);
	String tempVar11 = ConsoleInput.scanfRead();
	if (tempVar11 != null)
	{
		p0.i = tempVar11;
	}
	String tempVar12 = ConsoleInput.scanfRead();
	if (tempVar12 != null)
	{
		p0.x = tempVar12;
	}
	String tempVar13 = ConsoleInput.scanfRead();
	if (tempVar13 != null)
	{
		p0.y = tempVar13;
	}
	p0.m = p0.x + p0.y;
	for (k = 0,p1 = head;k <= 2;k++)
	{
		if (p0.m > p1.m)
		{
			break;
		}
		p1 = p1.next;
	}
	if (k == 3)
	{
		continue;
	}
	p1 = p2 = head;
	while (p0.m <= p1.m)
	{
	p2 = p1;
	p1 = p1.next;
	}
	if (p0.m > p1.m)
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
		p0.next = 0;
	}
	}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


