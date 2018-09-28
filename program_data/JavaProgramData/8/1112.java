package <missing>;

public class GlobalMembers
{
	public static int[] p;
	public static int[] q;
	public static int[] s;
	public static int m;
	public static int n;

	public static int pfCompare(Object elem1, Object elem2)
	{
		return *(int)elem1 - (int)elem2;
	}

	public static int input()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		p = new int[m];
		q = new int[n];
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static int downsort()
	{
		qsort(p,m,(Integer.SIZE / Byte.SIZE),pfCompare);
		qsort(q,n,(Integer.SIZE / Byte.SIZE),pfCompare);
	}

	public static int combine()
	{
		s = new int[(m + n)];
		int i;
		for (i = 0;i < m;i++)
		{
			s[i] = p[i];
		}
		for (i = m;i < m + n;i++)
		{
			s[i] = q[i - m];
		}
	}

	public static int output()
	{
		int i;
		System.out.printf("%d",s[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(q);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(s);
	}

	public static int Main()
	{
		input();
		downsort();
		combine();
		output();
	}

}

