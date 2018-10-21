package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void reserve();
		reserve();
	}

	public static void reserve()
	{
		void paixu(int a[],int k);
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[20];
		int[] b = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}

		paixu(a, x);
		paixu(b, y);

		for (j = 0;j < y;j++)
		{
			a[x + j] = b[j];
		}
		for (j = 0;j < x + y - 1;j++)
		{
			System.out.printf("%d ",a[j]);
		}
		System.out.printf("%d\n",a[j]);
	}

	public static void paixu(int[] a, int k)
	{
		int i;
		int j;
		int temp;
		for (j = 0;j < k;j++)
		{
			for (i = 0;i < k - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}

}

