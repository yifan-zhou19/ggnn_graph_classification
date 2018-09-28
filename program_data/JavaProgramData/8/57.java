package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int num1;
	public static int num2;
	public static void Main()
	{
		void read();
		void queue();
		void combine();
		void put();
		read();
		queue();
		combine();
		put();
	}
	public static void read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < num1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < num2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void queue()
	{
		int i;
		int j;
		int t;
		for (i = 0;i < num1 - 1;i++)
		{
			for (j = 0;j < num1 - i - 1;j++)
			{
				if (a[j] > a[j + 1]) //???
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < num2 - 1;i++)
		{
			for (j = 0;j < num2 - i - 1;j++)
			{
				if (b[j] > b[j + 1]) //???
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
	}
	public static void combine()
	{
		int i;
		for (i = 0;i < num1;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < num2;i++)
		{
			c[i + num1] = b[i];
		}
	}
	public static void put()
	{
		int i;
		for (i = 0;i < num1 + num2 - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[num1 + num2 - 1]);
	}
}

