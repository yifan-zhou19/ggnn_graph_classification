package <missing>;

public class GlobalMembers
{
	public static int num_a;
	public static int num_b;
	public static int[] a = new int[2000];
	public static int[] b = new int[1000];
	public static int i;
	public static int j;
	public static void Main()
	{
		void a1(),a2(),a3(),a4();
		a1();
		a2();
		a3();
		a4();
	}

	public static void a1()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num_a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num_b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < num_a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < num_b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void a2()
	{
		int turn1;
		for (i = 0;i < num_a;i++)
		{
			for (j = i + 1;j < num_a;j++)
			{
				if (a[i] > a[j])
				{
					turn1 = a[i];
					a[i] = a[j];
					a[j] = turn1;
				}
			}
		}
		for (i = 0;i < num_b;i++)
		{
			for (j = i + 1;j < num_b;j++)
			{
				if (b[i] > b[j])
				{
					turn1 = b[i];
					b[i] = b[j];
					b[j] = turn1;
				}
			}
		}
	}

	public static void a3()
	{
		for (i = 0;i < num_b;i++)
		{
			a[num_a + i] = b[i];
		}
	}

	public static void a4()
	{
		for (i = 0;i < num_a + num_b - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[num_a + num_b - 1]);
	}


}

