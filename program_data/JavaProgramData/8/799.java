package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int i;
	public static int j;
	public static int la;
	public static int lb;
	public static int p;
	public static void Main()
	{
		void canf();
	void px();
	void lj();
	void rintf();
	canf();
	px();
	lj();
	rintf();
	}

	public static void canf()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			la = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lb = Integer.parseInt(tempVar2);
		}
	for (i = 0;i <= la - 1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i <= lb - 1;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
	}
	}

	public static void px()
	{
		for (i = 0;i <= la - 2;i++)
		{
			for (j = i + 1;j <= la - 1;j++)
			{
				if (a[j] < a[i])
				{
				p = a[i];
				a[i] = a[j];
				a[j] = p;
				}
			}
		}
	for (i = 0;i <= lb - 2;i++)
	{
		for (j = i + 1;j <= lb - 1;j++)
		{
			if (b[j] < b[i])
			{
			p = b[i];
			b[i] = b[j];
			b[j] = p;
			}
		}
	}
	}

	public static void lj()
	{
		for (i = 0;i <= la - 1;i++)
		{
			c[i] = a[i];
		}
	for (i = la;i <= la + lb - 1;i++)
	{
		c[i] = b[i - la];
	}
	}

	public static void rintf()
	{
		System.out.printf("%d",c[0]);
		for (i = 1;i <= la + lb - 1;i++)
		{
			System.out.printf(" %d",c[i]);
		}
		System.out.print("\n");
	}

}

