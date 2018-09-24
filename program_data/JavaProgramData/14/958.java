public class student
{
		public int xuehao;
		public int yuwen;
		public int shuxue;
		public int mark;
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat(int max)
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xuehao = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.shuxue = Integer.parseInt(tempVar3);
		}
		head = p1;
		while (n < max - 1)
		{
			n++;
			if (n != 1)
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.xuehao = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.yuwen = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.shuxue = Integer.parseInt(tempVar6);
			}

		}
		p2.next = p1;
		p1.next = null;
		return head;
	}
	public static void Main()
	{
		int max;
		int i;
		student table;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		table = creat(max);
		for (i = 0;i < 3;i++)
		{
			int mmax = 0;
			int mark = 0;
			student p;
			p = table;

			do
			{
			if (p.shuxue + p.yuwen > mmax && p.mark != -1)
			{
				mark++;
				p.mark = mark;
				mmax = p.shuxue + p.yuwen;
			}
			p = p.next;
			}while (p != 0);
			p = table;
			do
			{
				if (p.mark == mark)
				{
					System.out.printf("%d %d\n",p.xuehao,p.shuxue + p.yuwen);
				p.mark = -1;
				}
						p = p.next;
			}while (p != 0);

		}
	}



}

