public class student
{
	public int num;
	public int a;
	public int b;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student create()
	{
		student head;
		student p1;
		student p2;
		int i;
		i = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = Integer.parseInt(tempVar3);
		}
		head = null;
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
			if (i == n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.a = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.b = Integer.parseInt(tempVar6);
			}
			i++;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		student head;
		student h;
		student x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create();
		h = x = head;
		int[] p = new int[2];
		int m;
		int j;
		int s;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int [2])calloc(100000,2 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			p[i][1] = h.a + h.b;
			p[i][0] = h.num;
			h = x.next;
			x = h;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (p[j][1] >= p[j + 1][1])
				{
					m = p[j][1];
					p[j][1] = p[j + 1][1];
					p[j + 1][1] = m;
					s = p[j][0];
					p[j][0] = p[j + 1][0];
					p[j + 1][0] = s;
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",p[i][0],p[i][1]);
		}
	}
}

