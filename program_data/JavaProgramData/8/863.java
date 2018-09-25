package <missing>;

public class GlobalMembers
{
	public static void mysort(int[] pn, int n)
	{
		int i;
		int j;
		int temp;
		for (j = 0; j < n; j++)
		{
			for (i = j + 1; i < n; i++)
			{
				if (pn[j] > pn[i])
				{
					temp = pn[j];
					pn[j] = pn[i];
					pn[i] = temp;
				}
			}
		}
	}

	public static void merge(int[] pn, int n, int[] pm, int m)
	{
		int i;
		System.out.printf("%d", pn[0]);
		for (i = 1; i < n; i++)
		{
			System.out.printf(" %d", pn[i]);
		}
		for (i = 0; i < m; i++)
		{
			System.out.printf(" %d", pm[i]);
		}
	}
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int[] pm;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pn;
		int pn;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		pm = new int[m];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		pn = (int)calloc(n,(Integer.SIZE / Byte.SIZE));

		for (i = 0; i < m; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(pm[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(pn[i]) = tempVar4;
			}
		}

		mysort(pm, m);
		mysort(pn, n);
		merge(pm, m, pn, n);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pm);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pn);
	}
}

