package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	char a[6];
	//	int c;
	//	int m;
	//	int s;
	//	struct student * next;
	//	};
		student head;
		student p1;
		student p2;
		student first = new student("",0,0,0,0);
		student second = new student("",0,0,0,0);
		student third = new student("",0,0,0,0);
		int n;
		int i;
		int j;
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		for (j = 0;j < 6;j = j + 1)
		{
			p1.a[j] = '\0';
		}
		System.in.read();
		for (j = 0;(ch = System.in.read()) != ' ';j = j + 1)
		{
			p1.a[j] = ch;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.c = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.m = tempVar3;
		}
		p1.s = p1.c + p1.m;
		head = null;
		for (i = 1;i < n;i = i + 1)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			for (j = 0;j < 6;j = j + 1)
			{
				p1.a[j] = '\0';
			}
			System.in.read();
			for (j = 0;(ch = System.in.read()) != ' ';j = j + 1)
			{
				p1.a[j] = ch;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.c = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.m = tempVar5;
			}
			p1.s = p1.c + p1.m;
		}
		p2.next = 0;
		for (p1 = head;p1 != 0;p1 = p1.next)
		{
			if (p1.s > first.s)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: third=second;
				third.copyFrom(second);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: second=first;
				second.copyFrom(first);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: first=* p1;
				first.copyFrom(p1);
			}
			else if (p1.s > second.s)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: third=second;
				third.copyFrom(second);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: second=* p1;
				second.copyFrom(p1);
			}
			else if (p1.s > third.s)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: third=* p1;
				third.copyFrom(p1);
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%s %d\n",first.a,first.s);
		System.out.printf("%s %d\n",second.a,second.s);
		System.out.printf("%s %d\n",third.a,third.s);
	}
}

