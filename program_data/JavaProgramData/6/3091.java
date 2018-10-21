package <missing>;

public class GlobalMembers
{
	///#define num 31

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,i,all,m,n,cycle,ii;
		int p;
		int i;
		int all;
		int m;
		int n;
		int cycle;
		int ii;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cycle = Integer.parseInt(tempVar);
		}
		for (ii = 0;ii < cycle;ii++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (int)calloc(m * n,(Integer.SIZE / Byte.SIZE));
			for (i = 0;i < m * n;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p + i = Integer.parseInt(tempVar4);
				}
			}
			all = 0;
			for (i = 0;i < n;i++)
			{
				all += *(p + i);
			}
			if (m > 1)
			{
				for (i = 0;i < n;i++)
				{
					all += *(p + i + (m - 1) * n);
				}
			}
			for (i = 2;i < m;i++)
			{
				all += *(p + (i - 1) * n);
			}
			if (n > 1)
			{
				for (i = 2;i < m;i++)
				{
					all += *(p + n - 1 + (i - 1) * n);
				}
			}
			System.out.printf("%d\n",all);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}


	}
}

