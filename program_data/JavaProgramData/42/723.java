package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100010];
		int num;
		int i;
		int j;
		int k;
		int move;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		move = 0;
		for (i = 0;i < num;i += 1)
		{
			if (a[i] == k)
			{
				for (j = i;j < num - 1;j += 1)
				{
					a[j] = a[j + 1];
				}
				i -= 1;
				num -= 1;
			}
		}
		for (i = 0;i < num - 1;i += 1)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[num - 1]);
	}

}

