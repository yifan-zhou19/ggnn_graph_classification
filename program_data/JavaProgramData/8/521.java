package <missing>;

public class GlobalMembers
{
	public static int[] m = new int[100];
	public static int[] n = new int[100];
	public static int[] p;
	public static int[] q;
	public static int a;
	public static int b;
	public static void input()
	{
		p = m;
		q = n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++,p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b;i++,q++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q = Integer.parseInt(tempVar4);
			}
		}
		p = m;
		q = n;
	}
	public static void sort(int[] p, int a)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < a - 1;i++)
		{
			for (j = 0;j < a - i - 1;j++)
			{
				if (p[j] > p[j + 1])
				{
					temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
				}
			}
		}
	}
	public static void mix()
	{
		int i;
		for (i = 0;i < b;i++)
		{
			p[a + i] = q[i];
		}
	}
	public static void output()
	{
		int i;
		for (i = 0;i < a + b - 1;i++)
		{
			System.out.printf("%d ",p[+]);
		}
		System.out.printf("%d\n",p[0]);
	}
	public static int Main()
	{
		input();
		sort(p, a);
		sort(q, b);
		mix();
		output();
		return 0;
	}
}

