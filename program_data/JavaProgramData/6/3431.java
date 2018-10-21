package <missing>;

public class GlobalMembers
{
	public static void sq(tangible.RefObject<Integer> p, int m, int n)
	{
		int i;
		int s;
		s = 0;
		for (i = 0;i < n;i++)
		{
			s = s + *(p.argValue + i);
		}
		for (i = 1;i < m;i++)
		{
			s = s + *(p.argValue + n * i) + *(p.argValue + n * i + n - 1);
		}
		for (i = 1;i < n - 1;i++)
		{
			s = s + *(p.argValue + (m - 1) * n + i);
		}
		System.out.printf("%d\n",s);
	}
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,m,n,k,i,j;
		int p;
		int m;
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (int)malloc(m * n * (Integer.SIZE / Byte.SIZE));
			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p + j = Integer.parseInt(tempVar4);
				}
			}
		tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
			sq(tempRef_p, m, n);
			p = tempRef_p.argValue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}
	}
}

