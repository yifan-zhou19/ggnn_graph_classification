public class stu
{
	public int num;
	public int ch;
	public int math;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m = 0;
		int max = 0;
		int max2 = 0;
		int max3 = 0;
		int no = 0;
		int no2 = 0;
		int no3 = 0;
		stu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu p1;
		stu p2;
		stu head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.math = Integer.parseInt(tempVar4);
		}
		head = null;

		while (n - 1 != 0)
		{
			m = m + 1;
			if (m == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (stu)malloc(LEN);
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 p1.num = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 p1.ch = Integer.parseInt(tempVar6);
			 }
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p1.math = Integer.parseInt(tempVar7);
			 }
			 n--;
		}
		p2.next = null;

		p = head;
		while (p != null)
		{
			p.ch = p.math + p.ch;
			p = p.next;
		}

		p = head;
		while (p != null)
		{
			if (p.ch > max)
			{
			  max = p.ch;
			  no = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",no,max);

		p = head;
		while (p != null)
		{
			if (p.ch <= max != 0 && p.ch> max2 && p.num != no)
			{
			  max2 = p.ch;
			  no2 = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",no2,max2);

		p = head;
		while (p != null)
		{
			if (p.ch <= max2 != 0 && p.ch> max3 && p.num != no && p.num != no2)
			{
			  max3 = p.ch;
			  no3 = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d",no3,max3);

	}
}

