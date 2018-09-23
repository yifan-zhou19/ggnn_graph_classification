public class student
{
public int num;
public int chi;
public int math;
public int sum;
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;


	public static void Main()
	{
		int i;
		int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	int m;
	m = 0;
	student head;
	student p1;
	student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(len);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.num = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p1.chi = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p1.math = Integer.parseInt(tempVar4);
	}
	p1.sum = p1.chi + p1.math;
	head = p1;
	while (m < n - 1)
	{
		m = m + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(len);
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		p1.num = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		p1.chi = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		p1.math = Integer.parseInt(tempVar7);
	}
	p1.sum = p1.chi + p1.math;
	p2.next = p1;
	p2 = p1;
	}
	p2.next = null;

	student max;
	student p;

	for (i = 0;i < 3;i++)
	{
		max = head;
	  p = p2 = head;
	  p1 = p2;
	  for (j = 0;j < n - i;j++)
	  {
		  if (p1.sum > max.sum)
		  {
			   max = p1;
		   p = p2;
		  }
		 p2 = p1;
		 p1 = p2.next;
	  }
	  p1 = p2 = head;
	  System.out.printf("%d %d\n",max.num,max.sum);
	   if (max.num == head.num)
	   {
		   head = p1.next;
	   }
	   else
	   {
		   p.next = max.next;
	   }
	}



	}



}

