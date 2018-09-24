public class stud
{
	public int n;
	public int chinese;
	public int math;
	public int total;
	public stud next;
}

package <missing>;

public class GlobalMembers
{
	public static int tol;
	public static stud creat()
	{
		stud head;
		stud p1;
		stud p2;
		int i = 1;
		p1 = p2 = new stud();
		head = p1;
		for (i = 1;i < tol;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.chinese = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			p1.total = (p1.math + p1.chinese);
			p1 = new stud();
			p2.next = p1;
			p2 = p1;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.n = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.chinese = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.math = Integer.parseInt(tempVar6);
		}
		p1.total = (p1.math + p1.chinese);
		p2.next = p1;
		p1.next = null;
		return head; //???????
	}
	public static int max(stud head, int max1, int max2)
	{
		stud p1;
		int maxtotal = head.total;
		int max_index;
		for (p1 = head;p1 != 0;p1 = p1.next)
		{
			if (p1.total > maxtotal && p1.n != max1 && p1.n != max2)
			{
				maxtotal = (p1.total);
				max_index = (p1.n);
			}
		}
		if (maxtotal != max1)
		{
			System.out.printf("%d %d\n",max_index,maxtotal);
		}
		return max_index;
	}
	public static void Main()
	{
		stud head;
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			tol = Integer.parseInt(tempVar);
		}
		head = creat();
		max1 = max(head, 0, 0);
		max2 = max(head, max1, 0);
		max(head, max1, max2);
	}

}

