package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a1 = new int[100];
	public static int[] a2 = new int[100];
	public static void Main()
	{
		void scan(),rank(),combine(),print();
		scan();
		rank();
		combine();
		print();
	}

	public static void scan()
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
				a1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void rank()
	{
		int i;
		int j;
		int mid;
		for (j = 0;j < n1 - 1;j++)
		{
			for (i = 0;i < n1 - 1 - j;i++)
			{
				if (a1[i] > a1[i + 1])
				{
					mid = a1[i];
					a1[i] = a1[i + 1];
					a1[i + 1] = mid;
				}
			}
		}
		for (j = 0;j < n2 - 1;j++)
		{
			for (i = 0;i < n2 - 1 - j;i++)
			{
				if (a2[i] > a2[i + 1])
				{
					mid = a2[i];
					a2[i] = a2[i + 1];
					a2[i + 1] = mid;
				}
			}
		}
	}

	public static void combine()
	{
		int i;
		for (i = n1;i < n1 + n2;i++)
		{
			a1[i] = a2[i - n1];
		}
	}

	public static void print()
	{
		int i;
		for (i = 0;i < n1 + n2;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a1[i]);
		}
	}

}

