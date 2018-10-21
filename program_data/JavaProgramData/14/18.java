public class student
{
	public int num;
	public int cn;
	public int math;
	public int sum;
	public int rank;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		int i = 1;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.cn = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		head = p1;
		do
		{
			p2 = p1;
			if (i == n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student) malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.cn = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p2.next = p1;
			i++;
		}while (1 != 0);
		p2.next = null;
		return (head);
	}

	public static void count(student head)
	{
		int max = 0;
		student p1;
		n = 1;
		p1 = head;
		do
		{
			p1.sum = p1.cn + p1.math;
			if (max < p1.sum)
			{
				max = p1.sum;
			}
			if (p1.next == 0)
			{
				break;
			}
			p1 = p1.next;
		}while (1 != 0);
		p1 = head;
		do
		{
			if (p1.sum == max)
			{
				p1.rank = n;
				n++;
			}
			if (n > 3)
			{
				break;
			}
			if (p1.next == 0)
			{
				p1 = head;
				max--;
			}
			else
			{
			p1 = p1.next;
			}
		}while (1 != 0);
	}

	public static void print(student head)
	{
		student p1;
		n = 1;
		p1 = head;
		do
		{
			if (p1.rank == n)
			{
				System.out.printf("%d %d\n",p1.num,p1.sum);
				n++;
			}
			if (n > 3)
			{
				break;
			}
			if (p1.next == 0)
			{
				p1 = head;
			}
			else
			{
				p1 = p1.next;
			}
		}while (1 != 0);
	}


	public static void Main()
	{
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		count(head);
		print(head);
	}


}

