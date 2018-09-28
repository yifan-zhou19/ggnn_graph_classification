package <missing>;

public class GlobalMembers
{
	public static void order(int[] a, int l1)
	{
		int i;
		int j;
		int b;
		for (i = 0;i < l1;i++)
		{
			for (j = i;j < l1;j++)
			{
				if (a[j] < a[i])
				{
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
	}
	public static void prin(int[] a, int l1, int[] b, int l2)
	{
		int i;
		char c = '\0';
		order(a, l1);
		order(b, l2);
		for (i = 0;i < l1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < l2;i++)
		{
			if (i < l2 - 1)
			{
				c = ' ';
			}
			else
			{
				c = '\n';
			}
			System.out.printf("%d%c",b[i],c);
		}
	}
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < l1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < l2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		prin(a, l1, b, l2);
		return 0;
	}
}

