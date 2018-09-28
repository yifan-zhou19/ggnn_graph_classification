package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a = new int[200];
	public static int[] b = new int[100];

	public static void readNum()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void Bubble()
	{
		int t;
		int i;
		int j;
		for (i = n1 - 1;i >= 1;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = n2 - 1;i >= 1;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
	}

	public static void gether()
	{
		int i;
		for (i = 0;i < n2;i++)
		{
			a[n1 + i] = b[i];
		}
	}

	public static void printNum()
	{
		int i;
		for (i = 0;i < n1 + n2;i++)
		{
			System.out.printf("%d%c",a[i],(i < n1 + n2 - 1)?' ':'\n');
		}
	}

	public static void Main()
	{
		readNum();
		Bubble();
		gether();
		printNum();
	}
}

