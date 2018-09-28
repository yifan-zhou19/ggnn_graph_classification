package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char a[20];
	//		int b;
	//		int c;
	//		char d;
	//		char e;
	//		int f;
	//		int g;
	//		struct s *next;
	//	};
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int max;
		int sum;
		s p1;
		s p2;
		s head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		p1 = p2 = new s();
		head = p1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.c = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.d = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.e = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.f = tempVar7;
		}
		for (i = 0;i < n - 1;i++)
		{
			p1 = new s();
			p2.next = p1;
			p2 = p1;
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.a = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.b = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.c = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.d = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p1.e = tempVar12;
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.f = tempVar13;
			}
		}
		p2.next = 0;
		p1 = p2 = head;
		for (i = 0;i < n;i++)
		{
		p1.g = 0;
		if (p1.b > 80 && p1.f > 0)
		{
			p1.g = p1.g + 8000;
		}
		if (p1.b > 85 && p1.c > 80)
		{
			p1.g = p1.g + 4000;
		}
		if (p1.b > 90)
		{
			p1.g = p1.g + 2000;
		}
		if (p1.b > 85 && p1.e == 'Y')
		{
			p1.g = p1.g + 1000;
		}
		if (p1.c > 80 && p1.d == 'Y')
		{
			p1.g = p1.g + 850;
		}
		p2 = p1.next;
		p1 = p2;
		}
		p1 = p2 = head;
		max = p1.g;
		for (i = 0;i < n - 1;i++)
		{
			p2 = p1.next;
			p1 = p2;
			if (p1.g > max)
			{
				max = p1.g;
				m = i;
			}
		}
		p1 = head;
		for (i = 0;i < m + 1;i++)
		{
			p1 = p1.next;
		}
		System.out.printf("%s\n%d\n",p1.a,p1.g);

	p1 = head;
	sum = 0;
	for (i = 0;i < n;i++)
	{
		sum = sum + p1.g;
		p1 = p1.next;
	}
	System.out.printf("%d",sum);
	}
}

