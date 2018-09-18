public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p1;
		student p2;
		student P;

		int n;
		int i = 0;
		int j = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = head = (student)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.shuxue = Integer.parseInt(tempVar4);
			}
			p1.total = p1.yuwen + p1.shuxue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2.next = p1 = (student)malloc(LEN);
		}

		p2.next = head;
		p1 = head;

		for (i = 0;;)
		{
			if (j == 3)
			{
				break;
			}
			head = p1;
			P = p1;
			p1 = head.next;
			while (p1 != head)
			{
				if (p1.total > P.total)
				{
					P = p1;
				}
				else if (p1.total == P.total && p1.num < P.num)
				{
					P = p1;
				}
				p1 = p1.next;
			}
			System.out.printf("%d %d\n", P.num,P.total);
			while (p1.next != P)
			{
				p1 = p1.next;
			}
			p1.next = P.next; //??P??
			j++;
		}


	}


}

