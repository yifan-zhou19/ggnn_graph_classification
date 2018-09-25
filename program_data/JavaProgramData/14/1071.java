public class student
{
	public int num;
	public int yu;
	public int shu;
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
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.yu = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.shu = Integer.parseInt(tempVar4);
		}
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.yu = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.shu = Integer.parseInt(tempVar7);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		for (i = 1;i <= 3;i++)
		{
		p1 = p2 = head;
		while (p1 != null)
		{
			if (p1.yu + p1.shu > p2.yu + p2.shu)
			{
				p2 = p1;
			}
			p1 = p1.next;
		}
		System.out.printf("%d %d\n",p2.num,p2.yu + p2.shu);
		p2.yu = 0;
		p2.shu = 0;
		}

	}


}

