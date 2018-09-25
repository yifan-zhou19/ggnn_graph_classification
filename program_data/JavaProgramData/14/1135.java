public class student
{
	public int a;
	public int b;
	public int c;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(L);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.c = Integer.parseInt(tempVar4);
		}
		head = null;
		for (i = 0;i < k - 1;i++)
		{
			n = n + 1;
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
			p1 = (student)malloc(L);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.a = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.b = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.c = Integer.parseInt(tempVar7);
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		student g;
		int[] x = new int[100000];
		int[] y = new int[100000];
		g = head;
		for (i = 0;i < k;i++)
		{
			x[i] = g.a;
			y[i] = g.b + g.c;
			g = g.next;
		}
		int[] m = new int[4];
		int t;
		int r = 1;
		int z = 0;
		m[0] = 201;
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (m[r] < y[j] && y[j] < m[r - 1])
				{
					m[r] = y[j];
				}
			}
			r++;
		}
		for (i = 0;i < k;i++)
		{
			if (z == 3)
			{
				break;
			}
			if (y[i] == m[1])
			{
				System.out.printf("%d %d\n",x[i],y[i]);
				z++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (z == 3)
			{
				break;
			}
			if (y[i] == m[2])
			{
				System.out.printf("%d %d\n",x[i],y[i]);
				z++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (z == 3)
			{
				break;
			}
			if (y[i] == m[3])
			{
				System.out.printf("%d %d",x[i],y[i]);
				z++;
			}
		}
	}
}

