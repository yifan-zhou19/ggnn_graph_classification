public class student
{
	public String name = new String(new char[20]);
	public int aver;
	public int bj;
	public char a;
	public char b;
	public int lunwen;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		int i;
		student head;
		student p1;
		student p2;
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
			p1.bj = Integer.parseInt(tempVar3);
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
			p1.lunwen = Integer.parseInt(tempVar6);
		}
		head = p1;
		for (i = 1;i < n;i++)
		{
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
				p1.bj = Integer.parseInt(tempVar9);
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
				p1.lunwen = Integer.parseInt(tempVar12);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student pt1;
		student pt2;
		head = creat(n);
		pt1 = head;
		while (pt1 != null)
		{
			pt1.sum = 0;
			if ((pt1.aver > 80) && (pt1.lunwen >= 1))
			{
				pt1.sum = pt1.sum + 8000;
			}
			if ((pt1.aver > 85) && (pt1.bj > 80))
			{
				pt1.sum = pt1.sum + 4000;
			}
			if (pt1.aver > 90)
			{
				pt1.sum = pt1.sum + 2000;
			}
			if ((pt1.aver > 85) && (pt1.b == 'Y'))
			{
				pt1.sum = pt1.sum + 1000;
			}
			if ((pt1.bj > 80) && (pt1.a == 'Y'))
			{
				pt1.sum = pt1.sum + 850;
			}
			pt1 = pt1.next;
		}
		pt1 = head;
		pt2 = pt1.next;
		while (pt2 != null)
		{
			if ((pt2.sum) > (pt1.sum))
			{
				pt1 = pt2;
			}
			pt2 = pt2.next;
		}
		System.out.printf("%s\n",pt1.name);
		System.out.printf("%d\n",pt1.sum);
		pt1 = head;
		int s = 0;
		while (pt1 != null)
		{
			s = s + pt1.sum;
			pt1 = pt1.next;
		}
		System.out.printf("%ld",s);
	return 0;
	}



}

