package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int p = 0;
		int q = 0;
		float d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct photo
	//	{
	//		char gender[10];
	//		float height;
	//	}
	//	a[40],m[40],f[40];

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
			a[i].gender = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].height = tempVar3;
		}
		}

		for (i = 0;i < n;i++)
		{
			if (a[i].gender[0] == 'm')
			{
				m[p] = a[i];
				p++;
			}
			else
			{
				f[q] = a[i];
				q++;
			}
		}

		for (i = 0;i < p - 1;i++)
		{
			for (j = i;j < p;j++)
			{
				if (m[i].height > m[j].height)
				{
					d = m[i].height;
					m[i].height = m[j].height;
					m[j].height = d;
				}
			}
		}
		for (i = 0;i < q - 1;i++)
		{
			for (j = i;j < q;j++)
			{
				if (f[i].height < f[j].height)
				{
					d = f[i].height;
					f[i].height = f[j].height;
					f[j].height = d;
				}
			}
		}

		for (i = 0;i < p;i++)
		{
		System.out.printf("%4.2f ",m[i].height);
		}
		for (i = 0;i < q - 1;i++)
		{
		System.out.printf("%4.2f ",f[i].height);
		}
		System.out.printf("%4.2f",f[q - 1].height);


	}
}

