package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] d = new int[200];
	public static void f1()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
	public static void pai()
	{
			int c;
			int i;
			int j;
			for (j = 0;j < n1;j++)
			{
				for (i = 0;i < n1 - 1;i++)
				{
					if (a[i] > a[i + 1])
					{
						c = a[i];
						a[i] = a[i + 1];
						a[i + 1] = c;
					}
				}
			}
			for (j = 0;j < n2;j++)
			{
				for (i = 0;i < n2 - 1;i++)
				{
					if (b[i] > b[i + 1])
					{
						c = b[i];
						b[i] = b[i + 1];
						b[i + 1] = c;
					}
				}
			}
	}
	public static void he()
	{
			int i;
			for (i = 0;i < n1;i++)
			{
				d[i] = a[i];
			}
			for (i = n1;i < n1 + n2;i++)
			{
				d[i] = b[i - n1];
			}
	}
	public static void shu()
	{
			int i;
			for (i = 0;i < n1 + n2 - 1;i++)
			{
				System.out.printf("%d ",d[i]);
			}
			System.out.printf("%d",d[n1 + n2 - 1]);
	}
	public static void Main()
	{
		f1();
		pai();
		he();
		shu();
	}
}

