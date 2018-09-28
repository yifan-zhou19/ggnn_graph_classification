package <missing>;

public class GlobalMembers
{
	public static void input(int[] num, int[] a)
	{
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[1] = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < num[0] + num[1];j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}
	}
	public static void order(int[] num, int[] a)
	{
		int j;
		int k;
		int temp;
		for (j = 0;j < num[0];j++)
		{
			for (k = num[0] - 1;k > 0;k--)
			{
				if (a[k] < a[k - 1])
				{
					temp = a[k];
					a[k] = a[k - 1];
					a[k - 1] = temp;
				}
			}
		}
		for (j = num[0];j < num[0] + num[1];j++)
		{
			for (k = num[0] + num[1] - 1;k > num[0];k--)
			{
				if (a[k] < a[k - 1])
				{
					temp = a[k];
					a[k] = a[k - 1];
					a[k - 1] = temp;
				}
			}
		}
	}
	public static void print(int[] num, int[] a)
	{
		int i;
		for (i = 0;i < num[0] + num[1] - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[num[0] + num[1] - 1]);
	}
	public static void Main()
	{
		int[] a = new int[40];
		int[] num = new int[2];
		input(num, a);
		order(num, a);
		print(num, a);
	}
}

