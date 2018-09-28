public class student
{
	public String name = new String(new char[20]);
	public int aver;
	public int judge;
	public char a;
	public char b;
	public int punish;
	public int prize;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int stu_num;


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
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.aver = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.judge = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.a = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.b = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.punish = Integer.parseInt(tempVar6);
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.aver = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.judge = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.a = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.b = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.punish = Integer.parseInt(tempVar12);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}


	public static void Main()
	{
		student head;
		student q1;
		student q2;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stu_num = Integer.parseInt(tempVar);
		}
		head = creat();
		q1 = head;
		q2 = head;
		while (q1 != null)
		{
			q1.prize = 0;
			if (q1.aver > 80 && q1.punish > 0)
			{
				q1.prize += 8000;
			}
			if (q1.aver > 85 && q1.judge > 80)
			{
				q1.prize += 4000;
			}
			if (q1.aver > 90)
			{
				q1.prize += 2000;
			}
			if (q1.aver > 85 && q1.b == 'Y')
			{
				q1.prize += 1000;
			}
			if (q1.judge > 80 && q1.a == 'Y')
			{
				q1.prize += 850;
			}
			sum += q1.prize;
			if (q2.prize < q1.prize)
			{
				q2 = q1;
			}
			q1 = q1.next;
		}
		System.out.printf("%s\n%d\n%d\n",q2.name,q2.prize,sum);
	}

}

