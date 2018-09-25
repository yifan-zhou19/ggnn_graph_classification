package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct patient
	//{
	//	char id[10];
	//int age;
	//struct patient *next;
	//}
	//*p1,*p2,*head,*p[100],*temp;
	p1 = p2 = head = new patient();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.id = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p1.age = tempVar3;
	}
	for (i = 2;i <= n;i++)
	{
		p1 = new patient();
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		p1.id = tempVar4;
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		p1.age = tempVar5;
	}
	p2.next = p1;
	p2 = p1;
	}
	p2.next = null;
	  for (t = 0,p1 = head;p1 != null;p1 = p1.next)
	  {
		if (p1.age >= 60)
		{
			p[t] = p1;
		   t++;
		}
	  }

		for (j = 0;j < t - 1;j++)
		{
			for (i = 0;i < t - j - 1;i++)
			{
				if (p[i].age < p[i + 1].age)
				{
					temp = p[i];
				p[i] = p[i + 1];
				p[i + 1] = temp;
				}
			}
		}

	for (i = 0;i <= t - 1;i++)
	{
	System.out.printf("%s\n",p[i].id);
	}

	for (p1 = head;p1 != null;p1 = p1.next)
	{
	if (p1.age < 60)
	{
	 System.out.printf("%s\n",p1.id);
	}
	}









	}
}

