public class student
{
	public int num;
 public int math;
 public int chinese;
 public int sum;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		student head;
	 student p1;
	 student p2;
	 int i = 1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (student)malloc(LEN);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p1.num = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p1.math = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 p1.chinese = Integer.parseInt(tempVar4);
	 }
	 p2.sum = p2.chinese + p2.math;
	 while (i <= n)
	 {
	  if (i == 1)
	  {
		  head = p1;
	  }
	  else
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
		  p1.math = Integer.parseInt(tempVar6);
	  }
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  p1.chinese = Integer.parseInt(tempVar7);
	  }
	  p1.sum = p1.chinese + p1.math;
	  p2.next = p1;
	  p2 = p1;
	  }
	  i++;
	 }
	 p2.next = null;
	 return head;
	}

	public static student del(student head, int max)
	{
		student p1;
		student p2;
		p1 = head;
		while (p1.sum != max && p1.next != 0)
		{
			p2 = p1;
			p1 = p1.next;
		}
		if (p1.sum == max)
		{
			if (p1 == head)
			{
				head = p1.next;
			}
			else
			{
				p2.next = p1.next;
			}
			n = n - 1;
		}
		return (head);
	}

	public static void print(student head)
	{
		student p1;
		student p2;
		int i;
		int max;
		int num;
		max = head.sum;
		p1 = head;
		p2 = p1.next;
		for (i = 1;i <= 3;i++)
		{
		 while (p1.next != 0)
		 {
			 if ((p2.sum) > max)
			 {
				 max = p2.sum;
				 num = p2.num;
			 }
			 p1 = p2;
			 p2 = p1.next;
		 }
		 System.out.printf("%ld %d\n",num,max);
		 head = del(head, max);
		 p1 = head;
		 p2 = p1.next;
		 max = p1.sum;
		}

	}

	//void print (struct student*head)
	//{
	//	struct student *p;
	//	p=head;
	//	if(head!=0)
	//		do
	//		{
	//			printf("%ld %d %d %d\n",p->num,p->math,p->chinese,p->sum);
	//			p=p->next;
	//		}while (p!=0);
	//}
	public static int Main()
	{
		student head;
		head = creat();
		print(head);
	}
}

