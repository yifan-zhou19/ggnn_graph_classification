package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int n;
		int[] t = new int[50000];
		int f = 0;
		int d;
		int k;
		int l;
		int h;
		double m = 10000;
		double y = 1;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		double a,b;
	//	}
	//	*q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		q = (qj)malloc(sizeof(qj) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(q[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(q[i].b) = tempVar3;
			}
			if (q[i].a <= m)
			{
				m = q[i].a;
			}
			if (q[i].b >= y)
			{
				y = q[i].b;
			}
		}
		for (s = m,d = 0;s <= y;s += 0.5,d++)
		{
			for (i = 0;i < n;i++)
			{
				if (s >= q[i].a && s <= q[i].b)
				{
					t[d] = 1;
					break;
				}
			}
		}
		for (k = 0;k < d;k++)
		{
			if (t[k] != 1)
			{
			   f = 1;
			   break;
			}
		}
		if (f == 1)
		{
			System.out.print("no");
		}
		if (f == 0)
		{
			l = (int)m;
			h = (int)y;
			System.out.printf("%d %d",l,h);
		}
		q = null;
		return 0;
	}
}

