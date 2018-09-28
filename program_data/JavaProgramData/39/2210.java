package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int z = 0;
		int sum = 0;
		int i;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		char na[30];
	//		int s1;
	//		int s2;
	//		char x1;
	//		char x2;
	//		int l;
	//		int b;
	//		struct st *next;
	//	}
	//	*p,*head,*p1,*p2,*q;
	p1 = p2 = new st();
	head = p1;
	do
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.na = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.s1 = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.s2 = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.x1 = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.x2 = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.l = tempVar7;
		}
		z++;
		p1.b = 0;
		if (p1.s1 > 80 && p1.l >= 1)
		{
			p1.b += 8000;
		}
		if (p1.s1 > 85 && p1.s2 > 80)
		{
			p1.b += 4000;
		}
		if (p1.s1 > 90)
		{
			p1.b += 2000;
		}
		if (p1.s1 > 85 && p1.x2 == 'Y')
		{
			p1.b += 1000;
		}
		if (p1.s2 > 80 && p1.x1 == 'Y')
		{
			p1.b += 850;
		}
		p1 = new st();
		p2.next = p1;
		p2 = p1;
	}while (z != n);
	p1 = null;
	z = 0;
	p = head;
	do
	{
		sum += p.b;
		if (p.b > max)
		{
			max = p.b;
			q = p;
		}
	z++;
	p = p.next;
	}while (z != n);
	System.out.printf("%s\n%d\n%d\n",q.na,max,sum);

	}
}

