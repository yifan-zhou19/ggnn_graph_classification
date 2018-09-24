public class stu
{
	public int a;
	public int b;
	public int c;
	public int d;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
		int i = 1;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.c = Integer.parseInt(tempVar3);
		}
		p1.d = p1.b + p1.c;
		while (true)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (i >= n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.b = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.c = Integer.parseInt(tempVar6);
			}
			p1.d = p1.b + p1.c;
			i++;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		stu z;
		stu p3;
		stu[] p = tangible.Arrays.initializeWithDefaultstuInstances(100007);
		stu q;
		int i = 0;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		z = creat();
		p3 = p[i] = z;
		while (p3 != null)
		{
			i++;
			p[i] = p3.next;
			p3 = p[i];
		}
		m = i;
		q = p[0];
		for (i = 0;i < 4;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (p[j].d >= p[j + 1].d)
				{
					q = p[j];
					p[j] = p[j + 1];
					p[j + 1] = q;
				}
			}
		}
		for (i = 1;i < 4;i++)
		{
		System.out.printf("%d %d\n",p[m - i].a,p[m - i].d);
		}
	}
}

