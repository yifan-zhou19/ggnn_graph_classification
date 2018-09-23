public class student
{
	public int num;
	public int math;
	public int chinese;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int stu_num;
	public static student max1;
	public static student max2;
	public static student max3;

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.math = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.chinese = Integer.parseInt(tempVar3);
		}
		head = null;
		n = 0;
		while (n < stu_num - 1)
		{
			n++;
			if (n == 1)
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.math = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.chinese = Integer.parseInt(tempVar6);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}

	public static void Max1(student head, int stu_num)
	{
		student q1;
		q1 = head;
		max1 = head;
		for (;q1 != null;)
		{
			if ((max1.math + max1.chinese) < (q1.math + q1.chinese))
			{
				max1 = q1;
				q1 = q1.next;
			}
			else
			{
				q1 = q1.next;
			}
		}
		System.out.printf("%ld %d\n",max1.num,max1.math + max1.chinese);
	}


	public static void Max2(student head, int stu_num)
	{
		student q2;
		q2 = head;
		if (head != max1)
		{
			max2 = head;
		}
		else
		{
			max2 = q2.next;
		}
		for (;q2 != null;)
		{
			if ((max2.math + max2.chinese) < (q2.math + q2.chinese) && q2 != max1)
			{
				max2 = q2;
				q2 = q2.next;
			}
			else
			{
				q2 = q2.next;
			}
		}
		System.out.printf("%ld %d\n",max2.num,max2.math + max2.chinese);
	}


	public static void Max3(student head, int stu_num)
	{
		student q3;
		q3 = head;
		for (;q3 != null;)
		{
			if (q3 == max1 || q3 == max2)
			{
				q3 = q3.next;
			}
			else
			{
				max3 = q3;
				break;
			}
		}
		q3 = head;
		for (;q3 != null;)
		{
			if ((max3.math + max3.chinese) < (q3.math + q3.chinese) && q3 != max1 && q3 != max2)
			{
				max3 = q3;
				q3 = q3.next;
			}
			else
			{
				q3 = q3.next;
			}
		}
		System.out.printf("%ld %d\n",max3.num,max3.math + max3.chinese);
	}


	public static void Main()
	{
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stu_num = Integer.parseInt(tempVar);
		}
		head = creat();
		Max1(head, stu_num);
		Max2(head, stu_num);
		Max3(head, stu_num);
	}



}

