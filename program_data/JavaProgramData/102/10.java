package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int mk = 0;
		int fk = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char sex[10];
	//		double height;
	//	}
	//	p[40],m[40],f[40],e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].height = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(p[i].sex,"male") == 0)
			{
				m[mk] = p[i];
				mk++;
			}
			if (strcmp(p[i].sex,"female") == 0)
			{
				f[fk] = p[i];
				fk++;
			}
		}
		for (i = 1;i < mk;i++)
		{
			for (j = 0;j < mk - i;j++)
			{
				if (m[j].height > m[j + 1].height)
				{
					e = m[j];
					m[j] = m[j + 1];
					m[j + 1] = e;
				}
			}
		}
		for (i = 1;i < fk;i++)
		{
			for (j = 0;j < fk - i;j++)
			{
				if (f[j].height < f[j + 1].height)
				{
					e = f[j];
					f[j] = f[j + 1];
					f[j + 1] = e;
				}
			}
		}
		for (i = 0;i < mk;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",m[i].height);
			}
			else
			{
				System.out.printf(" %.2lf",m[i].height);
			}
		}
		for (i = 0;i < fk;i++)
		{
				System.out.printf(" %.2lf",f[i].height);
		}
		return 0;
	}
}

