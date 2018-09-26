public class student
{
	public String name = new String(new char[20]);
	public int s1;
	public int s2;
	public char c;
	public char w;
	public int paper;
	public int m;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int n;
		int total = 0;
		int r;
		int max;
		int[][] a = new int[108][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		student p1;
		student p2;
		student head;
		student p;
		student pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		n = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.s1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.s2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.c = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.w = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.paper = Integer.parseInt(tempVar7);
		}
		n = n + 1;
		while (n < N)
		{
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
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			p1.name = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ");
		if (tempVar9 != null)
		{
			p1.s1 = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			p1.s2 = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar11 != null)
		{
			p1.c = tempVar11.charAt(0);
		}
		String tempVar12 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar12 != null)
		{
			p1.w = tempVar12.charAt(0);
		}
		String tempVar13 = ConsoleInput.scanfRead(" ");
		if (tempVar13 != null)
		{
			p1.paper = Integer.parseInt(tempVar13);
		}
		n = n + 1;
		}
		p2.next = p1;
		p1.next = null;

		p = head;
		r = 0;
		while (r < N)
		{

			(p.m) = 8000 * ((p.s1) > 80 && (p.paper > 0)) + 4000 * ((p.s1) > 85 && (p.s2) > 80) + 2000 * ((p.s1) > 90) + 1000 * ((p.s1) > 85 && (p.w == 'Y')) + 850 * ((p.s2) > 80 && (p.c == 'Y'));
			total = total + (p.m);
			r++;
			p = p.next;
		}

	r = 0;
	int i;
	int j = 0;
		p = head;
		max = p.m;
		while (r < N)
		{
			if ((p.m) > max)
			{
				max = (p.m);
				j = r;
			}
			r++;
			p = p.next;

		}
	i = 0;
	pp = head;
	while (i < j)
	{
		pp = pp.next;
		i++;
	}
	System.out.printf("%s\n%d\n%d\n",pp.name,max,total);

	}

}

