package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct r
	//	{
	//		int a;
	//		int b;
	//		int c;
	//	}
	//	r[99999];
		int i;
		int n;
		int x = 0;
		int y = 0;
		int z = 0;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				r[i].c = tempVar4;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (r[i].b + r[i].c > m1)
			{
				m1 = r[i].b + r[i].c;
				x = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if ((r[i].b + r[i].c == m1) && (i != x))
			{
				m2 = r[i].b + r[i].c;
				y = i;
			}
			else if ((m1 > r[i].b + r[i].c) && (r[i].b + r[i].c > m2))
			{
				m2 = r[i].b + r[i].c;
				y = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if ((r[i].b + r[i].c == m2) && (i != y) && (i != x))
			{
				m3 = r[i].b + r[i].c;
				z = i;
			}

			else if ((m2 > r[i].b + r[i].c) && (r[i].b + r[i].c > m3))
			{

				m3 = r[i].b + r[i].c;
				z = i;
			}
		}
		System.out.printf("%d %d\n",x,m1);
		System.out.printf("%d %d\n",y,m2);
		System.out.printf("%d %d\n",z,m3);

	}



}

