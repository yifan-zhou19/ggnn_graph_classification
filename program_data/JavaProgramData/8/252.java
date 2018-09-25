package <missing>;

public class GlobalMembers
{
	public static void input()
	{
		int i;
		int j;
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
		for (j = 0;j < n2;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void arrange()
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n1;i++)
		{
			for (j = i;j < n1;j++)
			{
				if (a[i] > a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		for (i = 0;i < n2;i++)
		{
			for (j = i;j < n2;j++)
			{
				if (b[i] > b[j])
				{
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				}
			}
		}
	}
	public static void add()
	{
		int i;
		for (i = 0;i < n1;i++)
		{
			c[i] = a[i];
		}
		for (i = n1;i < n1 + n2;i++)
		{
			c[i] = b[i - n1];
		}
	}
	public static void output()
	{
		int i;
		for (i = 0;i < n1 + n2;i++)
		{
			System.out.printf("%d",c[i]);
			if (i < n1 + n2 - 1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}

	}
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int n1;
	public static int n2;
	public static void Main()
	{
		input();
		arrange();
		add();
		output();
	}
}

