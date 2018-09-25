package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int h;
		int g;
		int m;
		int i;
		int j;
		int[] max = new int[100];
		char[][] s = new char[100][10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char d[10];
	//		int a;
	//	}
	//	p[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].d = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].a = tempVar3;
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (p[i].a >= 60)
			{
				m++;
			}
		}
		k = m;
		for (i = 0;i < n;i++)
		{
			if (p[i].a < 60)
			{
			   s[k] = p[i].d;
			   k = k + 1;
			}
		}
		g = 0;
		for (j = 0;j < m;j++)
		{
			max[j] = 59;
			for (i = 0;i < n;i++)
			{
				if (p[i].a > max[j])
				{
					max[j] = p[i].a;
					h = i;
				}
			}
			p[h].a = 59;
			s[g] = p[h].d;
			g++;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}

			return 0;

	}

}

