public class student
{
	public int num;
	public int chi;
	public int math;
	public int add;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	//struct student*creat()
	//{
	//	struct student*p1,*p2,*head;
	//	int i=0;
	//	p1=p2=(struct student *)malloc(LEN);
	//	
	//	head=NULL;
	//	i=i+1;
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student p1;
		student p2;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.chi = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.math = Integer.parseInt(tempVar4);
		}
		p1.add = p1.chi + p1.math;
		for (i = 1;i < n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.chi = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.math = Integer.parseInt(tempVar7);
			}
			p1.add = p1.chi + p1.math;
			p2.next = p1;
			p2 = p1;
		}
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			p1.num = Integer.parseInt(tempVar8);
		}
		String tempVar9 = ConsoleInput.scanfRead();
		if (tempVar9 != null)
		{
			p1.chi = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead();
		if (tempVar10 != null)
		{
			p1.math = Integer.parseInt(tempVar10);
		}
		p1.add = p1.chi + p1.math;
		p1.next = null;
	//		printf("%d\n",p1->add);
		for (i = 0;i < 3;i++)
		{
			p1 = head;
			int max = p1.add;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pp=&p1->num;
			int pp = p1.num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pp1=&p1->add;
			int pp1 = p1.add;
			while (p1.next != null)
			{
			  p1 = p1.next;
			  if (p1.add > max)
			  {
				max = p1.add;
				pp = p1.num;
				pp1 = p1.add;
			  }
			}
	//	    if(p2->add>max) 
	//		{
	//			max=p2->add;
	//			pp=&p2->num;
	//			pp1=&p2->add;
	//		} 
			 System.out.printf("%d %d\n", pp,max);
			 pp1 = null;
		}
	}





}

