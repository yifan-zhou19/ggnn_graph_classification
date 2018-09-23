//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class s
{
	public int a;
public int b;
public int c;
public int sum;
public s next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		s head1;
		s head2;
	s p;
	s p1;
	s p2;
	s p3;
	s p4;
	int n;
	int i;
	int rank1;
	int rank2;
	int rank3;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (s)malloc(L);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p1.b = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p1.c = Integer.parseInt(tempVar4);
	}
	p1.sum = p1.b + p1.c;
	rank1 = p1.sum;
	for (i = 1;;i++)
	{
		if (i == 1)
		{
			head1 = p1;
		}
	else
	{
		p2.next = p1;
	}
	p2 = p1;
	if (i == n)
	{
		break;
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (s)malloc(L);
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		p1.a = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		p1.b = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		p1.c = Integer.parseInt(tempVar7);
	}
	p1.sum = p1.b + p1.c;
	if (p1.sum > rank1)
	{
		rank1 = p1.sum;
	}
	}
	p2.next = N;

	p1 = head1;
	while (rank1 != p1.sum)
	{
		p2 = p1;
		p1 = p1.next;
	}
	if (rank1 == p1.sum)
	{
		if (p1 == head1)
		{
			head1 = p1.next;
		}
	else
	{
		p2.next = p1.next;
	}
	p3 = p1;
	}
	head2 = p3;
	p4 = p3;

	p1 = head1;
	rank2 = p1.sum;
	while (p1 != N)
	{
		if (p1.sum > rank2)
		{
			rank2 = p1.sum;
		}
	p1 = p1.next;
	}

	p1 = head1;
	while (rank2 != p1.sum)
	{
		p2 = p1;
		p1 = p1.next;
	}
	if (rank2 == p1.sum)
	{
		if (p1 == head1)
		{
			head1 = p1.next;
		}
	else
	{
		p2.next = p1.next;
	}
	p3 = p1;
	}

	p4.next = p3;
	p4 = p3;

	p1 = head1;
	rank3 = p1.sum;
	while (p1 != N)
	{
		if (p1.sum > rank3)
		{
			rank3 = p1.sum;
		}
	p1 = p1.next;
	}

	p1 = head1;
	while (rank3 != p1.sum)
	{
		p2 = p1;
		p1 = p1.next;
	}
	if (rank3 == p1.sum)
	{
		if (p1 == head1)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


