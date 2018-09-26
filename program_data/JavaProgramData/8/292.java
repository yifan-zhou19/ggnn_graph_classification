package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int anum;
	public static int bnum;
	public static void scan()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			anum = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			bnum = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < anum;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
		}
		for (i = 0;i < bnum;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b + i = tempVar4;
			}
		}
	}
	public static void mysort()
	{
		int temp;
		int i;
		int j;
		for (i = 0;i < anum - 1;i++)
		{
			for (j = 1;j < anum - i;j++)
			{
				if (a[j] < a[j - 1])
				{
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		for (i = 0;i < bnum - 1;i++)
		{
			for (j = 1;j < bnum - i;j++)
			{
				if (b[j] < b[j - 1])
				{
					temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
	}
	public static void print()
	{
		int i;
		for (i = 0;i < anum;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < bnum;i++)
		{
			System.out.printf("%d%c",b[i],i == bnum - 1?'\n':' ');
		}
	}
	public static void Main()
	{
		scan();
		mysort();
		print();
	}
}

