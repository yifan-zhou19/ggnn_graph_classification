public class student
{
	public String name = new String(new char[20]); //?????//
	public int final; //??????//
	public int a; //??????//
	public char b; //???????//
	public char c; //???????//
	public int d; //??????//
	public int scholarship;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int money;
		int sum = 0;
		String a = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		student p1;
		student p2;
		student head;
		for (i = 0;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(Len);
			p1.scholarship = 0;
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p1.b = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p1.c = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.d = Integer.parseInt(tempVar7);
			}
		}
		p2.next = null;
		p1 = head;
		for (i = 0;i < N;i++)
		{
			if (p1.final > 80 && p1.d >= 1) //????80???????>=1//
			{
				p1.scholarship += 8000;
			}
			if (p1.final > 85 && p1.a > 80) //????85?????????80???//
			{
				p1.scholarship += 4000;
			}
			if (p1.final > 90) //????90???//
			{
				p1.scholarship += 2000;
			}
			if (p1.final > 85 && p1.c == 'Y') //????85???????//
			{
				p1.scholarship += 1000;
			}
			if (p1.a > 80 && p1.b == 'Y') //??????80????????//
			{
				p1.scholarship += 850;
			}
			p1 = p1.next;
		}
		p1 = head;
		for (i = 0;i < N;i++)
		{
			sum += p1.scholarship;
			p1 = p1.next;
		}
		p1 = head;
		for (j = 0;j < N - 1;j++)
		{
			p2 = p1.next;
			for (i = 0;i < N - 1 - j;i++)
			{
				if (p1.scholarship < p2.scholarship)
				{
					a = p1.name;
					p1.name = p2.name;
					p2.name = a;
					money = p1.scholarship;
					p1.scholarship = p2.scholarship;
					p2.scholarship = money;
				}
				p2 = p2.next;
			}
			p1 = p1.next;
		}

		p1 = head;
		System.out.printf("%s\n%d\n%ld",p1.name,p1.scholarship,sum);
		return 0;
	}

}

