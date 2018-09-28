package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char a[11];
	//		int b;
	//	}
	//	p[100];
		int n;
		int i;
		int j = 0;
		int m;
		int t;
		char[][] c = new char[100][11];
		String string = new String(new char[11]);
		int[] d = new int[100];
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
				p[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].b = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].b >= 60)
			{
				c[j] = p[i].a;
				d[j] = p[i].b;
				j++;
			}
		}
		m = j;
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (d[i] < d[i + 1])
				{
					t = d[i];
					d[i] = d[i + 1];
					d[i + 1] = t;
					String = c[i];
					c[i] = c[i + 1];
					c[i + 1] = String;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",c[i],d[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].b < 60)
			{
				System.out.printf("%s\n",p[i].a,p[i].b);
			}
		}
	}
}

