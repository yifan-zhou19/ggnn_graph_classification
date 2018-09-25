public class student
{
	public int number;
	public int chinese;
	public int math;
	public int sum;
	public student next;
	public student previous;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		head = null_Renamed;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.number = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chinese = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.chinese + p1.math;
		p1.next = null_Renamed;
		p1.previous = null_Renamed;
		head = p1;
		p2 = p1;
		for (i = 2;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.number = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chinese = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.chinese + p1.math;
			p1.next = null_Renamed;
			p1.previous = p2;
			p2.next = p1;
			p2 = p1;
		}
		return (head);
	}
	public static student print(student head)
	{
		student max;
		student p;
		max = head;
		for (p = head;p != null_Renamed;p = p.next)
		{
		  if (p.sum > max.sum)
		  {
			  max = p;
		  }
		}
		System.out.printf("%d %d\n",max.number,max.sum);
		if (max == head)
		{
			head = max.next;
		}
		else
		{
			max.previous.next = max.next;
		}
		return (head);
	}
	public static void Main()
	{
		student head;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		print(head);
		print(head);
		print(head);
	}
}

