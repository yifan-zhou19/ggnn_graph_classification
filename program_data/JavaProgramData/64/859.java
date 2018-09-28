package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int a;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sz;
		int sz;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *jd;
		int jd;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *wd;
		int wd;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *d,c;
		double d;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			m += n - 1 - i;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sz = (int)malloc((Integer.SIZE / Byte.SIZE) * 3 * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		d = (double)malloc((Double.SIZE / Byte.SIZE) * m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		jd = (int)malloc((Integer.SIZE / Byte.SIZE) * m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		wd = (int)malloc((Integer.SIZE / Byte.SIZE) * m);
		for (i = 0;i < 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2;
			}
		}
		i = 0;
		for (a = 0;a < n;a++)
		{
			for (b = a + 1;b < n;b++)
			{
				d[i] = Math.sqrt(1.0 * (sz[3 * a + 0] - sz[3 * b + 0]) * (sz[3 * a + 0] - sz[3 * b + 0]) + (sz[3 * a + 1] - sz[3 * b + 1]) * (sz[3 * a + 1] - sz[3 * b + 1]) + (sz[3 * a + 2] - sz[3 * b + 2]) * (sz[3 * a + 2] - sz[3 * b + 2]));
				jd[i] = a;
				wd[i] = b;
				i++;
			}
		}
		for (a = 1;a <= m;a++)
		{
			for (b = 0;b < m - a;b++)
			{
				if (d[b] < d[b + 1])
				{
					c = d[b];
					d[b] = d[b + 1];
					d[b + 1] = c;
					i = jd[b];
					jd[b] = jd[b + 1];
					jd[b + 1] = i;
					i = wd[b];
					wd[b] = wd[b + 1];
					wd[b + 1] = i;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			a = jd[i];
			b = wd[i];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sz[3 * a + 0],sz[3 * a + 1],sz[3 * a + 2],sz[3 * b + 0],sz[3 * b + 1],sz[3 * b + 2],d[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(jd);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(wd);
		return 0;
	}

}

