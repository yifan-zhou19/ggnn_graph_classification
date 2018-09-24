package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//int a;
	//int math;
	//int chi;
	//int sum;
	//struct student *next;
	//};
	int n;
	int i;
	int max;
	student p1;
	student p2;
	student head;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	head = null;
	for (i = 0;i < n;i++)
	{
		   if (i == 0)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   head = p1 = (student)malloc(LEN);
		   }
		   else
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					   p1.next = (student)malloc(LEN);
					   p1 = p1.next;
		   }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p1.a = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p1.math = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 p1.chi = tempVar4;
		 }
		p1.sum = (p1.math) + (p1.chi);
	}
	p1.next = null;
	for (i = 0;i < 3;i++)
	{
	p1 = head;
	max = p1.sum;
	do
	{
		p1 = p1.next;
	if (p1.sum > max)
	{
		max = p1.sum;
		p2 = p1;
	}
	}while (p1.next != null);
	System.out.printf("%d %d\n",p2.a,p2.sum);
	p2.sum = 0;
	}
	}

}

