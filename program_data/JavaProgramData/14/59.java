public class student
{
	public String num = new String(new char[10]);
 public int chinese;
 public int math;
 public int sum;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;


	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
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
		head = null;
		int t = n;
	while (n > 1)
	{
		if (n == t)
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
			p1.num = tempVar4.charAt(0);
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
		n--;
	}
		p2.next = null;
		return (head);
	}



	public static void Main()
	{
		int n;
		int i;
		student first;
		student second;
		student third;
		int fir_index;
		int sec_index;
		int thr_index;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student stu = new student();
		head = creat(n);
		first = head;
		second = head;
		third = head;
		for (p1 = head;p1.next != null;p1 = p1.next)
		{
				if (p1.sum > first.sum)
				{
					third = second;
					second = first;
					first = p1;
				}
				else if (p1.sum > second.sum)
				{
					third = second;
					second = p1;
				}
				else if (p1.sum > third.sum)
				{
					third = p1;
				}
		}
		System.out.printf("%s %d\n",first.num,first.sum);
		System.out.printf("%s %d\n",second.num,second.sum);
		System.out.printf("%s %d\n",third.num,third.sum);
	}


}

