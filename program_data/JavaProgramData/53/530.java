package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int c = 1;
		int index;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1,index = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= index;j++)
			{
				if (a[j] != k)
				{
					c = c * 1;
				}
				else
				{
					c = 0;
				}
			}
			if (c == 1)
			{
				index = index + 1;
				a[index] = k;
			}
			c = 1;

		}
		for (i = 0;i <= index - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[index]);

	}
}

