public class student
{
	public String name = new String(new char[20]);
	public int ss;
	public int cs;
	public String g = new String(new char[2]);
	public String w = new String(new char[2]);
	public int pa;
	public int m;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int mm = 0;
		int all = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student p2;
		student p;
		student q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ss = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.cs = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.g = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.w = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.pa = Integer.parseInt(tempVar7);
		}
		head = null;
		while (mm < n - 1)
		{
			mm = mm + 1;
			if (mm == 1)
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
				p1.ss = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.cs = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.g = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.w = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.pa = Integer.parseInt(tempVar13);
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;

	/*?????*/
		p = head;
		do
		{
			p.m = 0;
			if (p.ss > 80 && p.pa >= 1)
			{
				p.m = p.m + 8000;
			}
			if (p.ss > 85 && p.cs > 80)
			{
				p.m = p.m + 4000;
			}
			if (p.ss > 90)
			{
				p.m = p.m + 2000;
			}
			if (p.ss > 85 && strcmp(p.w,"Y") == 0)
			{
				p.m = p.m + 1000;
			}
			if (p.cs > 80 && strcmp(p.g,"Y") == 0)
			{
				p.m = p.m + 850;
			}
			p = p.next;
		}while (p != null);
		p = q = head;
		do
		{
			all = all + q.m;
			if (p.m < q.m)
			{
				p = q;
			}
			q = q.next;
		}while (q != null);
		System.out.printf("%s\n%d\n%d\n",p.name,p.m,all);
	}
}

