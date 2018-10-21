package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void move(int * p, int n, int m);
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		move(p, n, m);
		return 0;
	}

	public static void move(int[] p, int n, int m)
	{
		int[] p1;
		p1 = new int[n];
		int i;
		int j = 0;

		for (i = 0;i < m;i++)
		{
			p1[i] = p[i + n - m];
		}
		for (i = m;i < n;i++,j++)
		{
			p1[i] = p[j];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ", p1[i]);
		}
		System.out.printf("%d\n", p1[n - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p1);
	}


}

